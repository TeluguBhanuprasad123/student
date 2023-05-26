package com.serviceregistry.www.externalclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.serviceregistry.www.excpetion.CustomException;
import com.serviceregistry.www.reponse.Departmentreponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@CircuitBreaker(name="external",fallbackMethod="fallback")
@FeignClient(name ="DEPARTMENT",path="/department/")
public interface Departmentclient {

	
	@GetMapping("/{departmentid}")
	Departmentreponse getDepartmentById(@PathVariable int departmentid);
	
	

    default ResponseEntity<Long> fallback(Exception e) {
        throw new CustomException("DEPARTMENT Service is not available","UNAVAILABLE",500);
    }
}
