package com.student;

public class Student {
private int stuid;
private String studentName;
public int getStuid() {
	return stuid;
}
public void setStuid(int stuid) {
	this.stuid = stuid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
@Override
public String toString() {
	return "Student [stuid=" + stuid + ", studentName=" + studentName + "]";
}
}