package com.courses;

public class Courses {
private int course_Id;
private String courseName;
public int getCourse_Id() {
	return course_Id;
}
public void setCourse_Id(int course_Id) {
	this.course_Id = course_Id;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Courses [course_Id=" + course_Id + ", courseName=" + courseName + "]";
}
}