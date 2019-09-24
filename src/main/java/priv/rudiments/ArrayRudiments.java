package priv.rudiments;

import java.util.Vector;

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
		int carry = 0, csum = 0;
		final Vector<Integer> solution = new Vector<Integer>();

		for (int msize = m.length - 1, nsize = n.length - 1; msize >= 0 || nsize >= 0; msize--, nsize--) {

			csum = (msize < 0 ? 0 : m[msize]) + (nsize < 0 ? 0 : n[nsize]) + carry;
			carry = csum / 10;

			solution.insertElementAt(csum % 10, 0);
		}

		if (carry > 0) {
			solution.insertElementAt(carry, 0);
		}

		return solution.toArray(new Integer[] {});
	}

}
