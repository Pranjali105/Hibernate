package com.practise.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Demo.question")
public class Question {

	@Id
	@GeneratedValue
	@Column(name = "que_id")
	private int que_id;

	@Column(name = "que_name")
	private String que_name;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "que_id")
	//@OrderColumn(name = "type")
	private List<Answer> answer;

	public int getQue_id() {
		return que_id;
	}

	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}

	public String getQue_name() {
		return que_name;
	}

	public void setQue_name(String que_name) {
		this.que_name = que_name;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}
