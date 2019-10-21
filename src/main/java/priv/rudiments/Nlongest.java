package priv.rudiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Nlongest {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		int quantity = 0;
		List<String> sorted = new ArrayList<String>();
		while ((line = in.readLine()) != null) {
			if (quantity == 0) {
				quantity = Integer.parseInt(line);
			} else if (!line.equals("")) {
				sorted.add(line);
				Collections.sort(sorted, new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o2.length() - o1.length();
					}

				});
			} else if (sorted.size() >= quantity) {
				break;
			}
		}
		sorted = sorted.subList(0, quantity);
		for (String l : sorted) {
			System.out.println(l);
		}
	}

}
