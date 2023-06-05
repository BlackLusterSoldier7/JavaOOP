package ZooConsoleSystem;

import java.util.*;

public class Habitat {

	private String name;
	private List<String> species;
	private int capacity;
	private int numAnimals;

	public Habitat(String name, int capacity) {

		this.name = name;
		this.species = new ArrayList<>();
		this.capacity = capacity;
		this.numAnimals = 0;

	}

	public String getName() {

		return name;

	}

	public int getCapacity() {

		return capacity;

	}

	public int getNumAnimals() {

		return numAnimals;

	}

	public boolean isFull() {

		return numAnimals >= capacity;

	}

	public void addAnimal(String speciesName) {

		if (isFull()) {

			System.out.println("Habitat '" + name + "' is already at full capacity. Can not add more animals. ");
			return;

		}

		species.add(speciesName);
		numAnimals++;
		System.out.println(speciesName + " has been added to the " + name + " habitat.");

	}

	public void displayAnimals() {

		System.out.println("Animals in the " + name + " habitat: ");

		for (String animal : species) {

			System.out.println(animal);

		}
		System.out.println("Total: " + numAnimals);

	}

}
