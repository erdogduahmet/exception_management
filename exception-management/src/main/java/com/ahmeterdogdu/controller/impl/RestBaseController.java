package com.ahmeterdogdu.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import com.ahmeterdogdu.model.RootEntity;

@RestController
public class RestBaseController {

	public <T> RootEntity<T> ok(T data){
		return RootEntity.ok(data);
	}
	
	public <T> RootEntity<T> error(String errorMessage){
		return RootEntity.error(errorMessage);
	}
}
