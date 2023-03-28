package com.iam.restapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/readfile")
public class ReadFile implements Serializable {
	public String readline(int c) throws IOException {
		FileInputStream inputStream = new FileInputStream("D://b4//names.txt");
		int ch = inputStream.read();
		String str = "";
		int count = 0;
		while (ch != -1) {
			if (ch == 13) {
				count += 1;
			}
			if (count == c) {
				str += (char) ch;
			}
			ch = inputStream.read();
		}
		return str;
	}

	public String value() throws Exception {
		FileInputStream inputStream = new FileInputStream("D://b4//names.txt");
		return null;
	}

	@GET
	@Path("/data/{var}")
	public String readvalue(@PathParam("var") String var) throws Exception {
		FileInputStream stream = new FileInputStream("D://b4//details.txt");
		int ch = stream.read();
		String data = "";
		while (ch != -1) {
			data += (char) ch;
			ch = stream.read();
		}
		String val = "";
		String ar[] = data.split("\n");
		for (String str : ar) {
			if (str.substring(0, str.indexOf('=')).equals(var.toLowerCase()))
				val = str.substring(str.indexOf('=') + 1);
		}
		if (val.length() == 0)
			return "No data";
		else
			return val;
	}

	@GET
	@Path("/index/{num}")
	public String indexread(@PathParam("num") int num) throws Exception {
		String[] arr = { "vandana", "pavani" };
		FileOutputStream ou = new FileOutputStream("D://b4//index.txt");
		String s = Arrays.toString(arr);
		ou.write(s.getBytes());

		return "data saved";
	}

	@GET
	@Path("/in/{index}")
	public String read(@PathParam("index") int index) throws Exception {
		FileInputStream in = new FileInputStream("D:/b4/index.txt");
		int ch = in.read();
		String s = "";
		String s1 = "";
		while (ch != -1) {
			s += (char) ch;
			ch = in.read();
		}
		String ar[] = s.split(",");
		for (int i = 0; i < ar.length; i++) {
			if (index == i) {
				s1 = ar[i];
			}
		}
		return s1;
	}

	@GET
	@Path("/copypaste")
	public String copy() throws Exception {
		FileInputStream stream = new FileInputStream("D://b4//names.txt");
		int ch = stream.read();
		String data = "";
		while (ch != -1) {
			data += (char) ch;
			ch = stream.read();
		}

		File file = new File("c:/boot");
		// File file2 = new File("c:/vandana");
		file.mkdir();
		FileOutputStream out = new FileOutputStream("C://boot//names.txt");
		out.write(data.getBytes());
		// file.renameTo(file2);
		return "data stored";
	}

	public String copyPaste() throws Exception {
		File f1 = new File("D:/b4/details.txt");
		File f2 = new File("D:/b4/vandana/" + f1.getName());
		FileInputStream fin = new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);
		int ch = fin.read();
		while (ch != -1) {
			fout.write(ch);
			ch = fin.read();
		}
		return "copied file";
	}

	public String cutPaste() throws Exception {
		File f1 = new File("D:/b4/index.txt");
		File f2 = new File("D:/b4/vandana/" + f1.getName());
		FileInputStream fin = new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);
		int ch = fin.read();
		while (ch != -1) {
			fout.write(ch);
			ch = fin.read();
		}
		fin.close();
		f1.delete();
		return "deleted";
	}

	public String cutByRename() {
		File f1 = new File("D:/b4//details.txt");
		File f2 = new File("D:/b4/pavani.txt");
		f1.renameTo(f2);
		return "renamed";
	}
}
