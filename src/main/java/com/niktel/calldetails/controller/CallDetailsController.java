package com.niktel.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.niktel.calldetails.dto.CallDetailsDTO;
import com.niktel.calldetails.service.ICallDetailsService;

@RestController
public class CallDetailsController {

	@Autowired
	ICallDetailsService service;
	
	@GetMapping("/{phoneNumber}")
	List<CallDetailsDTO> getDetailsByPhoneNumber(@PathVariable("phoneNumber")Long calledBy){
		
		return service.getDetailsByPhoneNumber(calledBy);
	}
}
