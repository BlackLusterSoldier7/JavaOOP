package ZooConsoleSystem;

import java.util.Arrays;

public class HairSalon {

	private String[] openingDays = { "Monday", "Tuesday" };

	public String[] getOpeningDay() {

		return openingDays;

	}

	public boolean isOpen(String weekDay) {

		if (!weekDay.endsWith("day")) {
			throw new IllegalArgumentException();
		}

		if (weekDay.equals("Monday") || weekDay.equals("Tuesday")) {

			return true;

		} else {
			return false;
		}

	}

}
