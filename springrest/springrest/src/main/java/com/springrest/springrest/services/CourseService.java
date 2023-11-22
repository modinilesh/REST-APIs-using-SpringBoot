package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;


public interface CourseService {
	
	//fetching all courses
	public List<Course> getCourses();
	
	//fetching single course with CourseId
	public Course getCourse(long courseId);
	
	//adding new Courses
	public Course addCourse(Course course);
	
	//updating course
	public Course updateCourse(Course course);

}
