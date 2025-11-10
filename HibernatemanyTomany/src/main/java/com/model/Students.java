// Table which belongs to the foreign key is considered as Child-Table.

package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Students {
	@Id
	@GeneratedValue
private int studentid;
	@Column
private String studentName;
	@Column
private String studentsem;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",
	joinColumns = @JoinColumn(name="studentid"),
	inverseJoinColumns = @JoinColumn(name="courseid"))
private List<Courses> courses;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentsem() {
	return studentsem;
}
public void setStudentsem(String studentsem) {
	this.studentsem = studentsem;
}
public List<Courses> getCourses() {
	return courses;
}
public void setCourses(List<Courses> courses) {
	this.courses = courses;
}
}