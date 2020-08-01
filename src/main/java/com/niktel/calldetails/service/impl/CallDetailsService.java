package com.niktel.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niktel.calldetails.dto.CallDetailsDTO;
import com.niktel.calldetails.entity.CallDetails;
import com.niktel.calldetails.repository.CallDetailsRepository;
import com.niktel.calldetails.service.ICallDetailsService;

@Service
public class CallDetailsService implements ICallDetailsService {

	@Autowired
	CallDetailsRepository repository;
	
	@Override
	public List<CallDetailsDTO> getDetailsByPhoneNumber(Long calledBy) {

		List<CallDetails> calledList = repository.findByCalledBy(calledBy);
		List<CallDetailsDTO> callDto = new ArrayList<>();
		for(CallDetails i : calledList){
			
			CallDetailsDTO dto =new CallDetailsDTO();
			BeanUtils.copyProperties(i, dto);
			callDto.add(dto);
		}
		
		return callDto;
	}	

}
