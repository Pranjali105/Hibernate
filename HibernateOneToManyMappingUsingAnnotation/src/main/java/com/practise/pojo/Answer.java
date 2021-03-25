package com.practise.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Demo.answer")
public class Answer {

	@Id
	@GeneratedValue
	@Column(name = "ans_id")
	private int ans_id;

	@Column(name = "ans_name")
	private String ans_name;

	@Column(name = "postedBy")
	private String PostedBy;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "que_id") // @OrderColumn(name = "type") private Answer
	 * answer;
	 */

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAns_name() {
		return ans_name;
	}

	public void setAns_name(String ans_name) {
		this.ans_name = ans_name;
	}

	public String getPostedBy() {
		return PostedBy;
	}

	public void setPostedBy(String postedBy) {
		PostedBy = postedBy;
	}

}
