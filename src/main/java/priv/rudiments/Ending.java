package priv.rudiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ending {

	public static void main(String[] args) throws java.lang.Exception {

		// use the following code to fetch input from console
		String line;
		List<String[]> list = new ArrayList<String[]>();

		boolean yes;
		int tests;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		tests = Integer.parseInt(inp.readLine());

		do {
			line = inp.readLine();
			if (line != null && !line.equals("")) {
				list.add(line.split(" "));
			}
		} while (line != null && !line.equals(""));

		for (int s = 0; s < list.size(); s++) {
			String arr[] = list.get(s);
			yes = false;

			for (int i = tests; i > 0; i--) {
				if (arr[0].length() == arr[1].length()) {
					System.out.println("YES");
					yes = true;
					break;
				} else if (arr[0].length() > arr[1].length()) {
					String aux = arr[0];
					arr[0] = arr[1];
					arr[1] = aux;
				} else {
					String arr0 = "", arr1 = "";
					for (int j = 0; j < arr[0].length(); j++) {
						arr0 += (arr[1].substring(j, j + 1) + arr[0].substring(j, j + 1));
					}
					arr1 = arr[1].substring(arr[0].length());

					arr[0] = arr0;
					arr[1] = arr1;
				}
			}

			if (!yes) {
				System.out.println("NO");
			}

		}
	}

}
