package com.generics;

import java.util.List;

public class Arraylist {
private List<Object> list;

public List<Object> getList() {
	return list;
}

public void setList(List<Object> list) {
	this.list = list;
}
public void DisplayList()
{
	System.out.println(list);
}
}