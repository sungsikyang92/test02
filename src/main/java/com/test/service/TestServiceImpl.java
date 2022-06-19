package com.test.service;

import org.springframework.stereotype.Service;

import com.test.dto.TestDto;
import com.test.mapper.TestMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
	private final TestMapper mapper;

	@Override
	public int testInput(TestDto dto) {
		return mapper.testInput(dto);
	}
	

}
