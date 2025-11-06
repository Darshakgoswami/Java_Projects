package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_data")
public class Courses {
	@Id
	@GeneratedValue
private int courseid;
	@Column
private String courseName;
	@ManyToMany(mappedBy = "courses")
private List<Students> students;
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public List<Students> getStudents() {
	return students;
}
public void setStudents(List<Students> students) {
	this.students = students;
}
}
