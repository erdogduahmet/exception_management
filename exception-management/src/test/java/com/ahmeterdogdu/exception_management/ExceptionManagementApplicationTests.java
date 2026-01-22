package com.ahmeterdogdu.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmeterdogdu.dto.DtoEmployee;
import com.ahmeterdogdu.service.IEmployeeService;
import com.ahmeterdogdu.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("BeforeEach çalıştı...");
	}
	
	//CTRL + 1
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(1L);
		if (employee!=null) {
			System.out.println("İsim: "+ employee.getName());
		}
	}
	
	@Test
	public void testFindEmployeeById2() {
		DtoEmployee employee = employeeService.findEmployeeById(1L);
		assertNotNull(employee);
		}
	@Test
	public void testFindEmployeeById3() {
		DtoEmployee employee = employeeService.findEmployeeById(1L);
		assertEquals(1, employee.getId());
		}

	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach çalıştı...");
	}
}
