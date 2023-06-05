package ZooConsoleSystem;

import java.util.*;

public class Zoo {

	private List<Habitat> habitats;
	private int maxHabitats;

	public Zoo(int maxHabitats) {

		this.habitats = new ArrayList<>();
		this.maxHabitats = maxHabitats;

	}

	public void addHabitat(String name, int capacity) {

		habitats.add(new Habitat(name, capacity));

	}

	public void addAnimalToHabitat(String habitatName, String speciesName) {

		for (Habitat habitat : habitats) {

			if (habitat.getName().equals(habitatName)) {

				if (habitat.isFull()) {
					System.out.println("Habitat '" + habitatName + "' is already full. Can not add more animals.");

				} else {

					habitat.addAnimal(speciesName);

				}
				return;

			}

		}

		System.out.println("Habitat '" + habitatName + "' not found.");

	}

	public void displayHabitats() {

		System.out.println("Habitats in the zoo: ");
		for (Habitat habitat : habitats) {

			System.out.println(habitat.getName() + " . Animals: " + habitat.getNumAnimals());

		}

	}

	public void displayAnimalsInHabitat(String habitatName) {

		for (Habitat habitat : habitats) {

			if (habitat.getName().equals(habitatName)) {

				habitat.displayAnimals();
				return;

			}

		}
		System.out.println("Habitat '" + habitatName + "' not found.");

	}

	public int getTotalAnimals() {

		int totalAnimals = 0;

		for (Habitat habitat : habitats) {

			totalAnimals += habitat.getNumAnimals();

		}
		return totalAnimals;

	}

	public List<Habitat> getHabitats() {
		return habitats;

	}

	// Test method sum. JUnit
	public int sum(int x, int y) {
		return x + y;

	}

	// JUnit test
	public int subtract(int x, int y) {

		return x - y;

	}

	public int multiply(int x, int y) {

		return x * y;

	}

	public int divide(int x, int y) {

		if (y == 0) {

			throw new IllegalArgumentException("Ints can not be divided by zero");

		}

		return x / y;

	}

	public boolean isEven(int i) {
		return i % 2 == 0;
	}

	public int[] incrementArray(int[] values) {

		int[] newValues = new int[values.length];

		for (int i = 0; i < values.length; i++) {

			newValues[i] = values[i] + 1;

		}
		return newValues;

	}

}
