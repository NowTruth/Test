package com.example.app.survey.entity;

import java.time.LocalDateTime;

public class Survey {
	private Integer id;
	private Integer age;
	private Integer satisfaction;
	private String contents;
	private LocalDateTime created;
	
	public Survey() {
		super();
	}

	public Survey(Integer id, Integer age, Integer satisfaction, String contents, LocalDateTime created) {
		super();
		this.id = id;
		this.age = age;
		this.satisfaction = satisfaction;
		this.contents = contents;
		this.created = created;
	}

	public Integer getId() {
		return id;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getSatisfaction() {
		return satisfaction;
	}

	public String getContents() {
		return contents;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSatisfaction(Integer satisfaction) {
		this.satisfaction = satisfaction;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	

}
