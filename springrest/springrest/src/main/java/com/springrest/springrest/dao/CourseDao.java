package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

//<T, ID> --> T represents our object and ID it's primary key type
public interface CourseDao extends JpaRepository<Course, Long> {

}
