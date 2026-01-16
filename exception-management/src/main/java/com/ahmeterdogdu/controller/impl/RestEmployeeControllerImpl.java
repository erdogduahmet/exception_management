package com.ahmeterdogdu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmeterdogdu.controller.IRestEmployeeController;
import com.ahmeterdogdu.dto.DtoEmployee;
import com.ahmeterdogdu.model.RootEntity;
import com.ahmeterdogdu.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements IRestEmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping(path = "/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}

}
