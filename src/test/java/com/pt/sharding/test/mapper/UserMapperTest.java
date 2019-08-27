package com.pt.sharding.test.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pt.sharding.test.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void save() {
        for (int i = 0; i <10 ; i++) {
            User user=new User();
            user.setName("test"+i);
            user.setCityId(i%2==0?2:1);
            user.setCreateTime(new Date());
            user.setSex(i%2==0?1:2);
            user.setPhone("11111111"+i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("eeeeeeeeeeee");
            userMapper.save(user);
        }
	}
	
	@Test
	public void get() {
		long s = System.currentTimeMillis();
		User user =  userMapper.get(373043261612228608l);
		long e = System.currentTimeMillis();
		System.out.println("---- time: "+(e-s));
		System.out.println(user);
	}
	
	@Test
	public void testGetSex() {
		long s = System.currentTimeMillis();
		User user =  userMapper.getSex(1);
		long e = System.currentTimeMillis();
		System.out.println("---- time: "+(e-s));
		System.out.println(user);
	}
	
}
