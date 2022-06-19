package com.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.test.dto.TestDto;

@Mapper
public interface TestMapper {
	@Insert("INSERT INTO test (name, age, addr) VALUES (#{name), #{age}, #{addr})")
	int testInput(TestDto dto);
}
