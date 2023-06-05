package ZooConsoleSystem;

import static org.junit.Assert.*;

import org.junit.*;

public class HairSalonTest {

	HairSalon hairSalon = new HairSalon();

	@Test
	public void testGetOpeningDays() {

		String[] expected = new String[] { "Monday", "Tuesday" };

		String[] actual = hairSalon.getOpeningDay();

		assertArrayEquals(expected, actual);

	}

	@Test
	public void testSalonIsOpenOnMonday() {
		assertTrue(hairSalon.isOpen("Monday"));

	}

	@Test
	public void testSalonClosedOnWednesday() {

		assertFalse(hairSalon.isOpen("Wednesday"));

	}

	@Test
	public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {

		assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("Hello Kity?"));

	}

}
