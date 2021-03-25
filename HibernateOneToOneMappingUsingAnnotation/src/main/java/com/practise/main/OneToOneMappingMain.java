package com.practise.main;

import java.util.ArrayList;
import java.util.List;

import com.practise.pojo.Address;
import com.practise.pojo.User;
import com.service.impl.ServiceImpl;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		
		List<Address> address_list = new ArrayList<Address>();
		
		User user1 = new User();
		user1.setName("A");
		
		Address address1 = new Address();
		address1.setCity("Pune");
		address1.setUser(user1);
		
		address_list.add(address1);
		
		User user2 = new User();
		user2.setName("B");
		
		Address address2 = new Address();
		address2.setCity("Amt");
		address2.setUser(user2);
		
		address_list.add(address2);
		
		User user3 = new User();
		user3.setName("C");
		
		Address address3 = new Address();
		address3.setCity("Ngp");
		address3.setUser(user3);
		
		address_list.add(address3);
		
		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.insertUserDetails(address_list);
	}

}
