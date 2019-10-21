package priv.rudiments;

import java.util.ArrayList;

public class ArrayRudiments {

	/**
	 * Add two integers represented by two arrays
	 * 
	 * NOTE: Integer as a natural number, not as a programming language data type.
	 * Thus, the integer can be as big as the array permits.
	 * 
	 * @param m first number as array
	 * @param n second number as array
	 * @return integer sum solution as array
	 */
	public Integer[] sum(Integer m[], Integer n[]) {
		int carry = 0, csum = 0, isize = Math.max(m.length, n.length) + 1;
		final ArrayList<Integer> solution = new ArrayList<Integer>(isize);
		
		System.out.println("------------"+solution.size());

		for (int msize = m.length - 1, nsize = n.length - 1; msize >= 0 || nsize >= 0; msize--, nsize--) {

			csum = (msize < 0 ? 0 : m[msize]) + (nsize < 0 ? 0 : n[nsize]) + carry;
			carry = csum / 10;

			solution.add(0, csum % 10);
		}

		if (carry > 0) {
			solution.add(0, carry);
		}

		return solution.toArray(new Integer[] {});
	}

}
