package ZooConsoleSystem;

import static org.junit.Assert.*;

import org.junit.*;

public class ZooTest {

	@Test
	public void testDisplayHabitats() {
		fail("Not yet implemented");

	}

	@Test
	public void testGetTotalAnimals() {
		fail("Not yet implemented");
	}

	Zoo zoo = new Zoo(10);

	@Test
	public void testSum() {

		// test
		int expected = 3;

		int actual = zoo.sum(1, 2);
	}

	@Test
	public void testSubtract() {

		int expected = 3;

		int actual = zoo.subtract(5, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void testMultiply() {

		int expected = 6;

		int actual = zoo.multiply(2, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {

		int expected = 12;

		int actual = zoo.divide(24, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void testIsEven() {

		boolean expected = true;

		boolean actual = zoo.isEven(2);

		// assertEquals(expected, actual);
		assertTrue(actual);

	}

	@Test
	public void testIsOdd() {

		boolean actual = zoo.isEven(1);

		assertFalse(actual);

	}

	@Test
	public void testIncrementArray() {

		int[] expected = new int[] { 2, 3, 4 };

		int[] actual = zoo.incrementArray(new int[] { 1, 2, 3 });

		// met assertEquals werkt het dus niet
		// assertEquals(expected, actual);

		assertArrayEquals(expected, actual);

	}

	@Test
	public void testDivideByZero() {

		Exception exception = assertThrows(IllegalArgumentException.class, () -> zoo.divide(1, 0));

		String expected = "Ints can not be divided by zero";

		String actual = exception.getMessage();

		assertEquals(expected, actual);

	}

}
