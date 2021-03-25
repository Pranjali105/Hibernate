package com.practise.service.impl;

import java.util.List;

import com.practise.dao.impl.DAOImpl;
import com.practise.pojo.Question;
import com.practise.service.intrfc.ServiceInterface;

public class ServiceImpl implements ServiceInterface {

	public void insertQuestionAnswer(List<Question> que_lst) {
		
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.insertQuestionAnswer(que_lst);
		
	}

}
