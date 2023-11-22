package com.springrest.springrest.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Course {
	
	private long id;
	private String title;
	private String description;
	
	//parameterized constructor
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	//default constructor
	public Course() {
		super();
	}

	
	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	//toString method
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	

}
