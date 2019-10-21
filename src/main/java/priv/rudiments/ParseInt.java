package priv.rudiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParseInt {

	public static void main(String[] args) throws java.lang.Exception {

		// use the following code to fetch input from console
		String num1, num2;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

		num1 = inp.readLine();
		num2 = inp.readLine();
		int n1 = Integer.parseInt(num1 == null || num1.equals("") ? "0" : num1);
		int n2 = Integer.parseInt(num2 == null || num2.equals("") ? "0" : num2);

		// Use the following code to print output
		System.out.println(n1 + n2);
	}

}
