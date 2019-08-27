package com.pt.sharding.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pt.sharding.test.vo.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTest {

	@Autowired
	private AddressMapper addressMapper;

	@Test
	public void save() {
		for (int i = 0; i <10 ; i++) {
			Address address=new Address();
			address.setCode("code_"+i);
			address.setName("name_"+i);
			address.setPid(i+"");
			address.setType(0);
			address.setLit(i%2==0?1:2);
			addressMapper.save(address);
		}

	}
	
	@Test
	public void get() {
		long s = System.currentTimeMillis();
		Address addr = addressMapper.get(373163357634560000l);
		long e = System.currentTimeMillis();
		System.out.println("---- time: "+(e-s));
		System.out.println(addr);
	}
	
}
