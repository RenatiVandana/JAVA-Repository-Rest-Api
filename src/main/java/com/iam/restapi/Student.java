package com.iam.restapi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	public int stuid;
	public String stuName;
	public String stuCourse;
	public int fee;

	public Student() {
		super();
	}

	public Student(int stuid, String stuName, String stuCourse, int fee) {
		super();
		this.stuid = stuid;
		this.stuName = stuName;
		this.stuCourse = stuCourse;
		this.fee = fee;
	}

}
