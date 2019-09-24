package priv.rudiments;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRudimentsTest {

	@Test
	public void sumTest01() {
		final ArrayRudiments ar = new ArrayRudiments();
		final Integer m[] = new Integer[] { 9, 3, 9 };
		final Integer n[] = new Integer[] { 6, 1 };
		final Integer s[] = new Integer[] { 1, 0, 0, 0 };

		this.printOp(m, n, ar);

		assertArrayEquals(s, ar.sum(m, n));
		assertArrayEquals(s, ar.sum(n, m));
	}

	@Test
	public void sumTest02() {
		final ArrayRudiments ar = new ArrayRudiments();
		final Integer m[] = new Integer[] { 2, 3 };
		final Integer n[] = new Integer[] { 6, 1 };
		final Integer s[] = new Integer[] { 8, 4 };

		this.printOp(m, n, ar);

		assertArrayEquals(s, ar.sum(m, n));
		assertArrayEquals(s, ar.sum(n, m));
	}

	@Test
	public void sumTest03() {
		final ArrayRudiments ar = new ArrayRudiments();
		final Integer m[] = new Integer[] { 9, 9, 9, 9, 9, 9, 3, 9 };
		final Integer n[] = new Integer[] { 9, 9, 9, 9, 6, 1 };
		final Integer s[] = new Integer[] { 1, 0, 0, 9, 9, 9, 9, 0, 0 };

		this.printOp(m, n, ar);

		assertArrayEquals(s, ar.sum(m, n));
		assertArrayEquals(s, ar.sum(n, m));
	}

	private void printOp(Integer m[], Integer n[], ArrayRudiments ar) {
		System.out.println("\n" + Arrays.toString(m));
		System.out.println("+");
		System.out.println(Arrays.toString(n));
		System.out.println("____________________");
		System.out.println(Arrays.toString(ar.sum(m, n)) + "\n");
	}

}
