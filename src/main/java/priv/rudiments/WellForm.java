package priv.rudiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WellForm {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(wellForm(line) ? "True" : "False");
		}
	}

	static boolean wellForm(String str) {
		if (str == null || str.equals("")) {
			return true;
		}
		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return wellForm(str.substring(1, str.length() - 1));
		} else if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
			return wellForm(str.substring(1, str.length() - 1));
		}
		if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
			return wellForm(str.substring(1, str.length() - 1));
		} else {
			return str.length() % 2 == 0 ? wellForm(str.substring(0, str.length() / 2))
					&& wellForm(str.substring((str.length() / 2), str.length())) : false;
		}
	}

}
