package priv.rudiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rotation {

	public static void main(String[] args) throws java.lang.Exception {

		// use the following code to fetch input from console
		int count = 0;
		String line;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		line = inp.readLine();

		for (int i = 1; i < line.length(); i++) {
			if (rotation(line, i).equals(line)) {
				count++;
			}
		}

		// Use the following code to print output
		System.out.println(count);
	}

	public static String rotation(String rota, int times) {
		return rota.substring(times) + rota.substring(0, times);
	}

}
