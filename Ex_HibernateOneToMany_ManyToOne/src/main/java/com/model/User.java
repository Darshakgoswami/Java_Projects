package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/* pojo class
 pojo class is a simple java class that contains only
 fields and getter and setter methods
 it's used to represent a table in the database
 it's also known as entity class
 it's used to map the table in the database to a java */

// @Entity anotation us used to specify that the class is an entity
@Entity
@Table(name = "Users1")

public class User {
@Id
@GeneratedValue
private int id;
@Column
private String username;
@Column
private String password;
@Column
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}