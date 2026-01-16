package com.ahmeterdogdu.service;

import com.ahmeterdogdu.dto.DtoEmployee;

public interface IEmployeeService {
	
	public DtoEmployee findEmployeeById(Long id);

}
