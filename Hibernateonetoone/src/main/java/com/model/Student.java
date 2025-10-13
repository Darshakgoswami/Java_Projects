package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
	@Id
	@GeneratedValue
private int Rollno;
	@Column
private String std_name;
	@Column
private String std_email;
	@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="sub_id")
private Subject subject;
public Subject getSubjects() {
	return subject;
}
public void setSubjects(Subject subjects) {
	this.subject = subjects;
}
public int getRollno() {
	return Rollno;
}
public void setRollno(int rollno) {
	Rollno = rollno;
}
public String getStd_name() {
	return std_name;
}
public void setStd_name(String std_name) {
	this.std_name = std_name;
}
public String getStd_email() {
	return std_email;
}
public void setStd_email(String std_email) {
	this.std_email = std_email;
}
}
