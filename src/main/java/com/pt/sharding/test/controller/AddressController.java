package com.pt.sharding.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pt.sharding.test.mapper.AddressMapper;
import com.pt.sharding.test.vo.Address;

@RestController
public class AddressController {

	@Autowired
	private AddressMapper addressMapper;

	@RequestMapping("/address/save")
	@ResponseBody
	public String save() {
		for (int i = 0; i <10 ; i++) {
			Address address=new Address();
			address.setCode("code_"+i);
			address.setName("name_"+i);
			address.setPid(i+"");
			address.setType(0);
			address.setLit(i%2==0?1:2);
			addressMapper.save(address);
		}

		return "success";
	}
	
	@RequestMapping("/address/get/{id}")
	@ResponseBody
	public Address get(@PathVariable Long id) {
		return addressMapper.get(id);
	}
	
}
