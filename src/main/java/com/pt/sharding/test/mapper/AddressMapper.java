package com.pt.sharding.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pt.sharding.test.vo.Address;

@Mapper
public interface AddressMapper {

	/**
	 * 保存
	 */
	void save(Address address);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	Address get(Long id);
	
}
