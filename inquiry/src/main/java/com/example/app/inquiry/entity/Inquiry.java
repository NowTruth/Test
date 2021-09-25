package com.example.app.inquiry.entity;

import java.time.LocalDateTime;

public class Inquiry {
	
	private Integer id;
	private String name;
	private String email;
	private String contents;
	private LocalDateTime created;
	
	public Inquiry() {
		super();
	}
	
	public Inquiry(Integer id, String name, String email, String contents, LocalDateTime created) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contents = contents;
		this.created = created;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
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
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	

}
