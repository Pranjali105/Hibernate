package com.service.impl;

import java.util.List;

import com.dao.impl.DAOImpl;
import com.practise.pojo.Address;
import com.service.intrfc.ServiceInterface;

public class ServiceImpl implements ServiceInterface{

	public void insertUserDetails(List<Address> address_lst) {
		
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.insertUserDetails(address_lst);
		
	}

/*public void insertUserDetails(Map<User,Address>mp) {
		
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.insertUserDetails(mp);*/
		
	
}
