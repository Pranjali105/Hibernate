package com.practise.main;

import java.util.ArrayList;
import java.util.List;

import com.practise.pojo.Answer;
import com.practise.pojo.Question;
import com.practise.service.impl.ServiceImpl;

public class OneToManyMappingMain {

	public static void main(String[] args) {

		List<Answer> ans_lst1 = new ArrayList<Answer>();
		List<Answer> ans_lst2 = new ArrayList<Answer>();
		List<Question> que_lst = new ArrayList<Question>();

		Answer ans1 = new Answer();
		ans1.setAns_name("String Literal");
		ans1.setPostedBy("ABC");

		Answer ans2 = new Answer();
		ans2.setAns_name("Using new keyword");
		ans2.setPostedBy("DEF");
		
		ans_lst1.add(ans1);
		ans_lst1.add(ans2);

		Answer ans3 = new Answer();
		ans3.setAns_name("List");
		ans3.setPostedBy("GHI");

		Answer ans4 = new Answer();
		ans4.setAns_name("Set");
		ans4.setPostedBy("JKL");

		Answer ans5 = new Answer();
		ans5.setAns_name("Map");
		ans5.setPostedBy("MNO");
		
		ans_lst2.add(ans3);
		ans_lst2.add(ans4);
		ans_lst2.add(ans5);
		
		Question question1 = new Question();
		question1.setQue_name("What are the way to create the String objects?");
		question1.setAnswer(ans_lst1);
		
		Question question2 = new Question();
		question2.setQue_name("what are the collections you have used in your project?");
		question2.setAnswer(ans_lst2);
		
		que_lst.add(question1);
		que_lst.add(question2);
		
		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.insertQuestionAnswer(que_lst);

	}

}
