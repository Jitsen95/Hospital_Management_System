package com.HMS.Department.Dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
	
	private String departmentId;
	@NotNull(message="Provide Department Name")
	private String departmentName;
	@NotNull(message="Provide Department Description")
	private String departmentDescription;
	private String departmentCode;
	
	
	

}
