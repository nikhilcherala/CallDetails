package com.niktel.calldetails.service;

import java.util.List;

import com.niktel.calldetails.dto.CallDetailsDTO;

public interface ICallDetailsService {

	List<CallDetailsDTO> getDetailsByPhoneNumber(Long calledBy);
}
