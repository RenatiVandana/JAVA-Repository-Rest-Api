package com.iam.restapi;

import java.beans.Customizer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	String cusName;
	int cusId;

	public Customer(String cusName, int cusId) {
		super();
		this.cusName = cusName;
		this.cusId = cusId;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [cusName=" + cusName + ", cusId=" + cusId + "]";
	}

	public String serializable() throws IOException {
		Customer c1 = new Customer("vandana", 01);
		Customer c2 = new Customer("pavani", 02);
		Customer c3 = new Customer("lavi", 03);
		Customer[] cus = new Customer[2];
		cus[0] = c1;
		cus[1] = c2;
		cus[2] = c3;

		FileOutputStream fileout = new FileOutputStream("D://b4//object.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fileout);
		oout.writeObject(cus);
		return "data saved";
	}

	public String deSerialization() throws Exception {
		FileInputStream fin = new FileInputStream("D:\\b4\\object.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student[] s = (Student[]) oin.readObject();
		String str = "";
		for (int i = 0; i < s.length; i++) {
			str += s[i].toString();
		}

		return str;

	}
}
