package priv.rudiments.collection;

import static org.junit.Assert.assertTrue;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;
import org.junit.Test;

public class CacheTest {

	@Test
	public void weakReferenceAwaitFTest() {
		final WeakHashMap<Integer, String> map = new WeakHashMap<Integer, String>();
		Integer key = new Integer(1);
		String value = "value";

		map.put(key, value);
		assertTrue(map.containsKey(key));
		assertTrue("value" == value);

		key = null;
		System.gc();

		Awaitility.await().atMost(10, TimeUnit.SECONDS).until(map::isEmpty);
	}

	@Test
	public void weakReferenceSleepTest() {
		final WeakHashMap<Integer, String> map = new WeakHashMap<Integer, String>();
		Integer key = new Integer(1);
		String value = "value";

		map.put(key, value);
		assertTrue(map.containsKey(key));
		assertTrue("value" == value);

		key = null;
		System.gc();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(map.isEmpty());
	}

}
