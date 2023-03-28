package com.iam.restapi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.server.Operation;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.sun.jersey.spi.container.ParamQualifier;

@Path("/static")
public class Application {
	// int a;
	private String Boolean;
	private Object num;

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("i")
	public String welcome() {
		return "welcome to my world";
	}

	@GET
	@Path("/van")
	@Produces(MediaType.TEXT_HTML)
	public String show() {
		Child child = new Child();
		return child.x + "";
	}

	@GET
	@Path("/student/{id},{name},{course},{fee}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getDetails(@PathParam("id") int id, @PathParam("name") String name,
			@PathParam("course") String course, @PathParam("fee") int fee) {
		String s = "";
		Student s1 = new Student(13, "pavani", "cyber security", 45000);
		Student s2 = new Student(12, "vandana", "java", 30000);
		Student s3 = new Student(12, "lavanya", "cloud computing", 20000);
		Student s4 = new Student(12, "sai sushmitha", "AWS", 60000);
		Student stud = new Student(id, name, course, fee);
		List<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return stud;
	}

	@GET
	@Path("/add/{n1},{n2}")
	public String add(@PathParam("n1") int a, @PathParam("n2") int b) {
		// System.out.println("addition of 2 numbers");
		return a + b + " ";
	}

	@GET
	@Path("/substract/{a1},{a2},{a3}")
	public String substract(@PathParam("a1") int x, @PathParam("a2") int y, @PathParam("a3") int z) {
		return x - (y * z) + " ";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/mul/{x}")
	public String multiplication(@PathParam("x") int a) {
		String result = "";
		for (int i = 1; i <= 10; i++) {
			result += a + " * " + i + " = " + a * i + "<br>";
		}
		return result;
	}

	@GET
	@Path("/array/{size}/{value}")
	@Produces("text/html")
	public String array(@PathParam("size") int x, @PathParam("value") String y) {

		String[] a1 = new String[x];
		for (int i = 0; i < x; i++) {
			a1[i] = "0";
		}
		String str = y;
		String[] ch = str.split(",");
		if (ch.length <= a1.length) {
			for (int z = 0; z < ch.length; z++) {
				a1[z] = ch[z];
			}
		} else {
			for (int z = 0; z < x; z++) {
				a1[z] = ch[z];
			}
		}
		return Arrays.toString(a1);

	}

	@GET
	@Path("/next/{name}")
	public String nextAlpha(@PathParam("name") String s) {
		String s1 = new String(s);
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == 'z') {
				s2 += (char) ((int) ch - 25);
			} else {
				s2 += (char) ((int) ch + 1);
			}
		}
		return s2;

	}

	@GET
	@Produces("text/html")
	@Path("/task/{s}")
	public String name(@PathParam("s") String n) {
		Bheem bheem = new Bheem();
		bheem.fullName = n;
		String s = bheem.getname();
		return "Full Name : " + n + " Raju";

	}

	@GET
	@Path("/htmltask")
	@Produces(MediaType.TEXT_HTML)
	public String input(@Context HttpServletRequest s) {
		String s1 = s.getParameter("user_name");
		return "Hello" + s1;

	}

	@GET
	@Path("/check/{a},{b}")
	@Produces(MediaType.TEXT_HTML)
	public boolean check(@PathParam("a") String a1, @PathParam("b") String b1) {
		String a3 = a1.equals(b1) + " ";
		return true;

	}

	@GET
	@Path("/func/{a}")
	@Produces(MediaType.TEXT_HTML)
	public String even(@PathParam("s") int c) {
		Function factorial = (a) -> {
			return a * a;
		};
		Function fac = (a) -> {
			int i = 1, fact = 1;
			int number = c;
			for (int j = 0; j <= number; j++) {
				fact = fact * i;
				i++;
			}
			return fact;
		};
		int mul = factorial.doit(2);
		int fa = fac.doit(5);
		// return mul + "";
		return fa + "";

	}

	/*
	 * @GET
	 * 
	 * @Path("/lambda/{int}")
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String lambda(@PathParam("int") int
	 * num){ //FunctionalImplementation a = new FunctionalImplementation(); //
	 * return
	 * "Given number is : "+num+"<br>"+a.evenOdd(num)+"<br>"+a.prime(num)+"<br>"+a.
	 * squre(num)+"<br>"+StaticImpli.returnh();  //   }
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/calculate")
	public String emp() {
		String empNames[] = { "vandana", "lavanya", "sushmitha" };
		String empIds[] = { "TY01", "TY02", "TY03" };
		double exper[] = { 2, 5.7, 4 };
		String skills[][] = { { "java", "python", "c" }, { "html", "css" }, { "javascript", "python", "sql" } };
		double salary[] = new double[3];
		// double salary[] = { 25000.00, 50000.00, 30000.00 };
		// double bonus[] = new double[3];
		Employee employees[] = new Employee[3];
		// double addbonus;
		for (int i = 0; i < exper.length; i++) {
			salary[i] = (exper[i] * 10000) + (skills[i].length * 1000);
		}
		Employee employees1[] = new Employee[3];
		// bonus[i] = addbonus + salary[i];
		// }

		for (int j = 0; j < employees1.length; j++) {
			employees1[j] = new Employee(empNames[j], empIds[j], salary[j]);
		}
		String op = "";
		// for (Employee employee : employees1)
		// op += employee.toString();
		for (int i = 0; i < employees1.length; i++) {
			op += employees1[i].toString() + "," + exper[i] + "," + Arrays.toString(skills[i]);

		}
		return op;
	}

	@GET
	@Path("/office/{pur}")
	public String getDetails(@PathParam("pur") String pur) {
		Office listen = Office.TRAINING_ROOM;
		Office office[] = Office.values();// to store enum elements in array
		Office office2 = Office.valueOf(pur.toUpperCase());
		String msg = "";
		switch (office2) {
		case TRAINING_ROOM:
			msg = "Listen to session";
			break;
		case CONFERENCE_ROOM:
			msg = "Meeting are going";
			break;
		case CAFETERIA:
			msg = "Time for tea & cofee";
			break;
		}
		return listen.toString() + "<br>" + Arrays.deepToString(office) + "<br>" + listen.time + "<br>" + listen.purpose
				+ "<br>" + msg;
	}

	@GET()
	@Produces(MediaType.TEXT_HTML)
	@Path("/operation/{value}/{x},{y}")
	public String operation(@PathParam("value") String value, @PathParam("x") int x, @PathParam("y") int y) {
		Arth_Operations addition = Arth_Operations.ADDITION;
		Arth_Operations operations = Arth_Operations.valueOf(value.toUpperCase());
		int count = 0;
		switch (operations) {
		case ADDITION:
			count = x + y;
			break;
		case SUBSTRACTION:
			count = x - y;
			break;
		case MULTIPLICATION:
			count = x * y;
			break;
		case DIVISION:
			count = x / y;
			break;
		}
		return value + " of " + x + " , " + y + "=" + count;

	}

	@GET
	@Path("/obj_file/{name},{id}")
	public String arrayObjToFile(@PathParam("name") String name, @PathParam("id") int id) throws IOException {
		Customer customer = new Customer();
		customer.serializable();
		return customer.serializable();

	}

	@GET
	@Path("/obj/{num}")
	public String readli(@PathParam("num") int num) throws IOException {
		ReadFile file = new ReadFile();
		file.readline(num);
		return file.readline(num);

	}
}
