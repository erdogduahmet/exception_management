package com.ahmeterdogdu.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmeterdogdu.dto.DtoDepartment;
import com.ahmeterdogdu.dto.DtoEmployee;
import com.ahmeterdogdu.exception.BaseException;
import com.ahmeterdogdu.exception.ErrorMessage;
import com.ahmeterdogdu.exception.MessageType;
import com.ahmeterdogdu.model.Department;
import com.ahmeterdogdu.model.Employee;
import com.ahmeterdogdu.repository.EmployeeRepository;
import com.ahmeterdogdu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee=new DtoEmployee();
		DtoDepartment dtoDepartment =new DtoDepartment();
		Optional<Employee> optional =employeeRepository.findById(id);
		if (optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST, id.toString()));
		}
		Employee employee=optional.get();
		BeanUtils.copyProperties(employee, dtoEmployee);
		
		Department department=optional.get().getDepartment();
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		
		
		return dtoEmployee;
	}

}
