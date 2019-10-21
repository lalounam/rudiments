package priv.rudiments;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("test1: " + formatTime(0));
		System.out.println("test2: " + formatTime(999));
		System.out.println("test3: " + formatTime(1000));
		System.out.println("test4: " + formatTime(60000));
		System.out.println("test5: " + formatTime(1330001));
		System.out.println("test6: " + formatTime(3660000));
		System.out.println("test7: " + formatTime(172800000));
	}

	static String formatTime(int millis) {
		int segsNum = segs(millis);
		return mins(millis) + ":" + (segsNum < 10 ? "0" + segsNum : segsNum);
	}

	static int segs(int millis) {
		return ((millis % 60000) / 1000);
	}

	static String mins(int millis) {
		return (millis / 60000) + "";
	}
}
