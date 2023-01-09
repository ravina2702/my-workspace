package module4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class R1Assert {
	// handled Assert class with all method to check its pass or fail
	
	
	@Test
	public void test()
	{
		assertEquals(10, 10);
		assertFalse(10>20);
		assertTrue(5<1);
		assertNull(null);
		assertNotNull(null);
		
		//array
				int a[]= {10,20,30,40,50};
				int b[]= {10,20,30,40,50,5};
				assertArrayEquals(a, b);
				
		
		
	}
}
