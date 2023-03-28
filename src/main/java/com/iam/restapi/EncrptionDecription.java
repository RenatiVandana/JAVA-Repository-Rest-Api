package com.iam.restapi;

import java.util.StringTokenizer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/encrip")
public class EncrptionDecription {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/encription/{s}")
	public String read(@PathParam("s") String b) {
		String str = b;
		char[] st = str.toCharArray();
		String y = "abcdefghi";
		String s1 = "jklmnopqr";
		String s2 = "stuvwxyz";
		String s3 = "";
		for (int i = 0; i < st.length; i++) {
			if (y.contains(st[i] + "")) {
				s3 += "1" + (y.indexOf(st[i]) + 1);
			} else if (s1.contains(st[i] + "")) {
				s3 += "2" + (s1.indexOf(st[i]) + 1);
			} else if (s2.contains(st[i] + "")) {
				s3 += "3" + (s2.indexOf(st[i]) + 1);

			}
		}
		return s3;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/decrip/{string}")
	public String decript(@PathParam("string") String a) {
		String a5 = a;
		String s1 = "abcdefghi";
		String s2 = "jklmnopqr";
		String s3 = "stuvwxyz";
		String sym = "!@#$&*()_-+={}[]:;',.?/<>0";
		String ssz = "";
		for (char c : a.toCharArray()) {
			if (sym.contains(c + ""))
				ssz += c;
		}
		StringTokenizer st = new StringTokenizer(a, sym);// created tokenizer to split into no of tokens
		int n = st.countTokens(); // counting tokens
		String ar[] = new String[n];// creating empty array with token size
		for (int i = 0; st.hasMoreTokens(); i++) // taking each token and adding to empty array
			ar[i] = st.nextToken();
		String op = ""; // to save output
		int j = 0; //
		for (String tok : ar) { // foreach : to ittarate each token and
			for (int i = 0; i < tok.length(); i++) { // it is to itarate the elements in the each token
				if (i % 2 == 0) {
					String pos = tok.charAt(i + 1) + "";
					int ind = new Integer(pos).intValue() - 1;
					if (tok.charAt(i) == '1')
						op += s1.charAt(ind);
					else if (tok.charAt(i) == '2')
						op += s2.charAt(ind);
					else if (tok.charAt(i) == '3')
						op += s3.charAt(ind);
				}
			}
			if(ssz.length()!=0) {
				char ch = ssz.charAt(j);
				if (ch == '0') {
					op += " ";
				} else {
					op += ch;
					j++;
				}
			}
			
			System.out.println(op);
		}

		return op;
	}
}
