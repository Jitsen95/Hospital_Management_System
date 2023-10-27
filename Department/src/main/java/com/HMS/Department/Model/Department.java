package com.HMS.Department.Model;

import java.util.ArrayList;
import java.util.List;

import com.HMS.Department.Dto.DoctorDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Department")
public class Department {
	@Id
	private String departmentId;
	@Column(name="Department_Name")
	private String departmentName;
	@Lob
	@Column(name="Description")
	private String departmentDescription;
	@Column(name="DepartmentCode") 
	private String departmentCode;
	
	@Transient
	private List<DoctorDto> dtoList=new ArrayList<>();
	
	

}
