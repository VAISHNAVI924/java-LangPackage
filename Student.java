package com;

public class Student {
int id;
String name;
Student(int id,String name){
	this.id=id;
	this.name=name;
}

public boolean equals(Object obj) {
	Student s=(Student)obj;
	return this.id==s.id && this.name. equals(s.name);
}
}

