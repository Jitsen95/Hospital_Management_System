package com.HMS.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.Department.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department,String>{
	
	Department findByDepartmentCode(String departmentCode);
	
	Department findByDepartmentName(String departmentName);
	

}
