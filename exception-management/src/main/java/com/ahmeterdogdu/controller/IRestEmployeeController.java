package com.ahmeterdogdu.controller;

import com.ahmeterdogdu.dto.DtoEmployee;
import com.ahmeterdogdu.model.RootEntity;

public interface IRestEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
