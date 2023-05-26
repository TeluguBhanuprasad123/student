package com.serviceregistry.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.serviceregistry.www.entity.Student;
import com.serviceregistry.www.externalclient.Departmentclient;

public class Studentservice {

	  @Autowired
	  private Departmentclient departmentClient;

	
}
