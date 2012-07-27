package it.unibs.ing.fp.traffic.fake;

import static org.junit.Assert.*;

import org.junit.Test;

public class JPositionTest {
	@Test
	public void differentXs() throws Exception {
		JPosition p = new JPosition(3, 5);
		JPosition q = new JPosition(4, 5);
		assertFalse(p.equals(q));
	}
	@Test
	public void differentYs() throws Exception {
		JPosition p = new JPosition(4, 7);
		JPosition q = new JPosition(4, 5);
		assertFalse(p.equals(q));
	}
	@Test
	public void differentXsAndYs() throws Exception {
		JPosition p = new JPosition(2, 7);
		JPosition q = new JPosition(4, 5);
		assertFalse(p.equals(q));
	}
	@Test
	public void identical() throws Exception {
		JPosition p = new JPosition(4, 7);
		JPosition q = new JPosition(4, 7);
		assertTrue(p.equals(q));
	}
}
