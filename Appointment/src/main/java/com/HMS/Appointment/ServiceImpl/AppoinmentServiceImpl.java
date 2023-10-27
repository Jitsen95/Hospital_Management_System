package com.HMS.Appointment.ServiceImpl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.HMS.Appointment.Dto.AppointmentDto;
import com.HMS.Appointment.Dto.BookingDto;
import com.HMS.Appointment.Dto.DepartmentDto;
import com.HMS.Appointment.Dto.DoctorDto;
import com.HMS.Appointment.Dto.UserDto;
import com.HMS.Appointment.Entity.Appointment;
import com.HMS.Appointment.Repository.AppoinmentRepository;
import com.HMS.Appointment.Service.AppointmentService;
@Service
public class AppoinmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppoinmentRepository appointmentRepo;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	private DepartmentApiClient apiClient;
	
	@Autowired
	private UserApiClient userClient;
	
	@Autowired
	DoctorApiClient doctorClient;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public AppointmentDto createAppointment(AppointmentDto appointmentDto) {
		String appointmentId=UUID.randomUUID().toString();
		appointmentDto.setAppointmentId(appointmentId);
		Appointment appointment=mapper.map(appointmentDto,Appointment.class);
		Appointment savedappointment =appointmentRepo.save(appointment);
		AppointmentDto savedDto=mapper.map(savedappointment, AppointmentDto.class);
		return savedDto;
	}

	@Override
	public ApiResponseDto findAppointmentById(String appointmentId) {
		Appointment appointment=appointmentRepo.findById(appointmentId).orElseThrow(
				()->new RuntimeException("Not found with this ID")
				);
		AppointmentDto appointmentDto=mapper.map(appointment, AppointmentDto.class);
		BookingDto bookingDto=new BookingDto();
		bookingDto.setAppointmentId(appointmentDto.getAppointmentId());
		bookingDto.setBookingDate(appointmentDto.getBookingDate());
		bookingDto.setConsultationFee(appointmentDto.getConsultationFee());
		
		//ResponseEntity<DoctorDto> doctorDto=restTemplate.getForEntity("http://localhost:8080/Doctor/byId/"+appointmentDto.getDoctorId(), DoctorDto.class);
		
		DepartmentDto departmentDto=apiClient.findByDepartmentId(appointmentDto.getDepartmentId());
		
		DoctorDto doctorDto=doctorClient.findByDoctorId(appointmentDto.getDoctorId());
		UserDto userDto=userClient.findByUserId(appointmentDto.getUserId());
		UserDto newUserDto=new UserDto();
		newUserDto.setFirstName(userDto.getFirstName());
		newUserDto.setLastName(userDto.getLastName());
		newUserDto.setUserId(userDto.getUserId());
		newUserDto.setMobile(userDto.getMobile());
		newUserDto.setEmail(userDto.getEmail());
		newUserDto.setCity(userDto.getCity());
		
		
		
		ApiResponseDto apiResponeDto=new ApiResponseDto();
		apiResponeDto.setBookingDto(bookingDto);
		apiResponeDto.setUser(newUserDto);
		apiResponeDto.setDoctor(doctorDto);
		
		apiResponeDto.setDepartment(departmentDto);
		return apiResponeDto;
	}

	@Override
	public List<AppointmentDto> findAllAppointments() {
		List<Appointment> appointmentList=appointmentRepo.findAll();
		List<AppointmentDto> dtoList=appointmentList.stream()
				.map(e->mapper.map(e, AppointmentDto.class)).collect(Collectors.toList());
		return dtoList;
	}
	
	

}
