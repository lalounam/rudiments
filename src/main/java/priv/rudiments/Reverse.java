package priv.rudiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse {

	public static void main(String[] args) throws java.lang.Exception {

		// use the following code to fetch input from console
		String n, elements, response = "";
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		n = inp.readLine();
		elements = inp.readLine();

		if(elements!=null) {
		String elementsArray[] = elements.split(" ");

		if(elementsArray!=null && elementsArray.length>0)
		for (int i = Integer.parseInt(n)-1; i >= 0; i--) {
			response += elementsArray[i] + "";
		}
		}
		// Use the following code to print output
		System.out.println(response.trim());
	}

}
