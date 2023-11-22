package com.springrest.springrest.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	// creating object of CourseServiceImpl
	@Autowired
	private CourseService courseService;

	// /home
	@GetMapping("/home")
	public String home() {
		return "Hello! Welcome to the Home Page.";
	}

	// fetch all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	// fetch course with courseId
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	// POST mapping, adding new course
	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	// Put mapping, updating course
	@PutMapping(path = "/courses", consumes = "application/json")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	// DELETE mapping, updating course
	@DeleteMapping(path = "/courses", consumes = "application/json")
	public Course deleteCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

}
