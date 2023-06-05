package ZooConsoleSystem;

import java.util.*;

public class ZooApplication {

	public static void main(String[] args) {

		Zoo zoo = new Zoo(10);
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Zoo Console System");

		// Add habitats to the zoo
		System.out.print("Enter the number of habitats in the zoo: ");
		int numHabitats = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= numHabitats; i++) {

			System.out.println("\nHabitat " + i + ":");
			System.out.println("Enter the habitat name: ");

			String habitatName = input.nextLine();
			System.out.println("Enter the habitat capacity: ");
			int habitatCapacity = input.nextInt();
			input.nextLine();

			zoo.addHabitat(habitatName, habitatCapacity);

		}

		// Add animals to habitats
		System.out.println("\nEnter the animals for each habitat: ");

		for (Habitat habitat : zoo.getHabitats()) {

			System.out.println("\n" + habitat.getName() + ":");
			System.out.println("Enter the number of animals in " + habitat.getName() + ": ");
			int numAnimals = input.nextInt();
			input.nextLine();

			for (int i = 1; i <= numAnimals; i++) {

				System.out.print("Enter the name of animal " + i + ": ");
				String animalName = input.nextLine();
				habitat.addAnimal(animalName);

			}

		}

		// Display all habitats
		System.out.println("\nHabitats in the zoo: ");
		zoo.displayHabitats();

		// Display animals in a specific habitat
		System.out.println("\nEnter the name of the habitat to display animals:");
		String habitatName = input.nextLine();
		zoo.displayAnimalsInHabitat(habitatName);

		System.out.println("\nTotal number of animals in the zoo: " + zoo.getTotalAnimals());

		input.close();

	}

}
