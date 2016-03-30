package jUnitSimpleInterest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		simpleinterest s= new simpleinterest();
		int sm= s.amount(500);
		assertEquals(500, sm);
	}

}
