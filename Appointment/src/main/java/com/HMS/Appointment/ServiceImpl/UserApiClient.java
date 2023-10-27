package com.HMS.Appointment.ServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HMS.Appointment.Dto.UserDto;



@FeignClient(url="http://localhost:7070",name="User-Service")
public interface UserApiClient {
	
	@GetMapping("User/byUserId/{userId}")
	public UserDto findByUserId(@PathVariable("userId") String userId);
		
	
	

}
