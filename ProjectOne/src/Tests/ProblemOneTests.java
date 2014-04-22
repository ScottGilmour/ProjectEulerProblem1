package Tests;

import static org.junit.Assert.*;
import main.ProblemOne;
import org.junit.Test;

public class ProblemOneTests {

	@Test
	public void testSumOfMultiples() {
		int n, expected, result;
		
		n = 10;
		expected = 23;
		result = ProblemOne.sumOfMultiples(n);
		
		assertEquals(expected, result);
	}

}
