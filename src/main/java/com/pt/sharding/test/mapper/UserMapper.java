package com.pt.sharding.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pt.sharding.test.vo.User;

@Mapper
public interface UserMapper {
	
	/**
	 * 保存
	 */
	void save(User user);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	User get(Long id);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	User getSex(int sex);
	
	
}
