package priv.rudiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderLists {

	public static void main(String[] args) throws java.lang.Exception {
		
		// use the following code to fetch input from console
		String line;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

		List<String> ord = new ArrayList<String>();
		do {
			line = inp.readLine();
			if (line != null && !line.equals(""))
				ord.add(line.toLowerCase());

		} while (line != null && !line.equals(""));

		Comparator<String> comp = new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else if (s1.length() > s2.length()) {
					int subcomp = s2.compareTo(s1.substring(0, s2.length()));
					return subcomp == 0 ? -1 : s1.compareTo(s2);
				} else {
					int subcomp = s1.compareTo(s2.substring(0, s1.length()));
					return subcomp == 0 ? 1 : s1.compareTo(s2);
				}
			}
		};

		java.util.Collections.sort(ord, comp);
		// Use the following code to print output
		for (String l : ord) {
			System.out.println(l);
		}
	}

}
