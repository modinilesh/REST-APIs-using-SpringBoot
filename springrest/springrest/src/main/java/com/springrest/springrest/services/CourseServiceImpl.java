package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> courses;
	
	@Autowired
	private CourseDao courseDao;
	
	//Courses data
	public CourseServiceImpl() {
//		courses = new ArrayList<>();
//		
//		Course course = new Course(1234, "Core Java", "Course contains Spring learnings");
//		Course course1 = new Course(34567, "Python", "Course contains Django learnings");
//		Course course2 = new Course(98765, "Javascript", "Course contains ReactJS learnings");
//	
//		courses.add(course);
//		courses.add(course1);
//		courses.add(course2);
	}

	
	//get all courses
	@Override
	public List<Course> getCourses() {
//		return this.courses;
		return this.courseDao.findAll();
	}

	
	//get course with courseId
	@Override
	public Course getCourse(long courseId) {
//		
//		for(Course c : courses) {
//			if(c.getId() == courseId) {
//				return c;
//			}
//		}
//		return null;
		
		return this.courseDao.getReferenceById(courseId);
	}

	//add new Course
	@Override
	public Course addCourse(Course course) {
//		this.courses.add(course);
		
		this.courseDao.save(course);
		return course;
	}

	//update course
	@Override
	public Course updateCourse(Course course) {
//		long id = course.getId();
//		for(Course c : this.courses) {
//			if(c.getId() == id) {
//				c.setTitle(course.getTitle());
//				c.setDescription(course.getDescription());
//				return course;
//			}
//		}
//		return null;
		this.courseDao.save(course);
		return course;
	}

	//Delete course
	@Override
	public void deleteCourse(long courseId) {
//		for(Course c : courses) {
//			if(c.getId() == courseId) {
//				this.courses.remove(c);
//			}
//		}
		
		Course entity = this.courseDao.getReferenceById(courseId);
		this.courseDao.delete(entity);
		
	}

}
