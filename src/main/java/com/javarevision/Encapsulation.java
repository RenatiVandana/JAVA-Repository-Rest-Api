package com.javarevision;

public class Encapsulation {
	private String stuName;
	private int stuId;
	private double stuFee;

	public Encapsulation() {
		super();
	}

	public Encapsulation(String stuName, int stuId, double stuFee) {
		super();
		this.stuName = stuName;
		this.stuId = stuId;
		this.stuFee = stuFee;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public double getStuFee() {
		return stuFee;
	}

	public void setStuFee(double stuFee) {
		this.stuFee = stuFee;
	}

	@Override
	public String toString() {
		return "Encapsulation [stuName=" + stuName + ", stuId=" + stuId + ", stuFee=" + stuFee + "]";
	}

	}
