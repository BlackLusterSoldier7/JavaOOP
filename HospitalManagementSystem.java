package hospitalInformationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagementSystem {

	public static void main(String[] agrs) {

		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();

		while (true) {

			System.out.println("1. Add patient ");
			System.out.println("2. Display all patients");
			System.out.println("3. Display patient details");
			System.out.println("4. Add medicine to a patient");

			System.out.println("5. Display medicine history for a patient");
			System.out.println("6. Add operation to a patient");
			System.out.println("7. Update current hospital for a patient");
			System.out.println("8. Update hospital history for a patient");
			System.out.println("9. Exit");

			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			input.nextLine(); // consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter patient name: ");
				String patientName = input.nextLine();
				Patient patient = new Patient(patientName);
				hospital.addPatient(patient);
				System.out.println("Patient added successfully!!!");
				break;
			case 2:
				hospital.displayAllPatients();
				break;
			case 3:
				System.out.print("Enter patient name: ");
				String searchName = input.nextLine();
				Patient foundPatient = hospital.getPatientByName(searchName);

				if (foundPatient != null) {
					foundPatient.displayPatientDetails();
				} else {
					System.out.println("Patient not found!");
				}

				break;

			case 4:

				System.out.println("Enter patient name: ");
				String patientNameToAddMedicine = input.nextLine();
				Patient patientToAddMedicine = hospital.getPatientByName(patientNameToAddMedicine);

				if (patientToAddMedicine != null) {

					System.out.println("Enter medicine name: ");
					String medicineName = input.nextLine();
					Medicine medicine = new Medicine(medicineName);
					patientToAddMedicine.addMedicine(medicine);
					patientToAddMedicine.addMedicineToHistory(medicine);

					System.out.println("Medicine added to the patient successfully ");

				} else {
					System.out.println("Patient not found!");
				}
				break;

			case 5:

				System.out.print("Enter patient name: ");
				String patientNameToDisplayMedicineHistory = input.nextLine();

				Patient patientToDisplayMedicineHistory = hospital
						.getPatientByName(patientNameToDisplayMedicineHistory);

				if (patientToDisplayMedicineHistory != null) {
					System.out.println("Medicine history for patient: " + patientToDisplayMedicineHistory.getName());
					List<Medicine> medicineHistory = patientToDisplayMedicineHistory.getMedicineHistory();

					if (medicineHistory.isEmpty()) {
						System.out.println("No medicine history found for the patient.");
					} else {
						for (Medicine medicine : medicineHistory) {
							System.out.println("- " + medicine.getName());
						}
					}

				} else {
					System.out.println("Patient not found!");
				}
				break;

			case 6:

				System.out.print("Enter patient name: ");
				String patientNameToAddOperation = input.nextLine();

				Patient patientToAddOperation = hospital.getPatientByName(patientNameToAddOperation);

				if (patientToAddOperation != null) {

					System.out.println("Enter operation date: ");
					String operationDate = input.nextLine();

					System.out.print("Enter operation room number: ");
					String operationRoomNumber = input.nextLine();

					System.out.print("Enter ailment: ");
					String ailment = input.nextLine();

					System.out.print("Enter purpose: ");
					String purpose = input.nextLine();

					OperationRecord operationRecord = new OperationRecord(operationDate, operationRoomNumber, ailment,
							purpose);
					patientToAddOperation.addOperation(operationRecord);

					System.out.println("Operation added to the patient successfully!");

				} else {
					System.out.println("Patient not found");
				}
				break;

			case 7:
				System.out.print("Enter patient name: ");
				String patientNameToUpdateCurrentHospital = input.nextLine();
				Patient patientToUpdateCurrentHospital = hospital.getPatientByName(patientNameToUpdateCurrentHospital);

				if (patientToUpdateCurrentHospital != null) {

					System.out.print("Enter current hospital name: ");
					String currentHospitalName = input.nextLine();

					HospitalRecord currentHospital = new HospitalRecord(currentHospitalName);
					patientToUpdateCurrentHospital.setCurrentHospital(currentHospital);

					System.out.println("Current hospital updated successfully!");

				} else {

					System.out.println("Current hospital updated successfully!");

				}
				break;

			case 8:
				System.out.println("Enter patient name: ");
				String patientNameToUpdateHospitalHistory = input.nextLine();
				Patient patientToUpdateHospitalHistory = hospital.getPatientByName(patientNameToUpdateHospitalHistory);

				if (patientToUpdateHospitalHistory != null) {

					System.out.print("Enter hospital name: ");
					String hospitalName = input.nextLine();

					HospitalRecord hospitalRecord = new HospitalRecord(hospitalName);
					patientToUpdateHospitalHistory.addHospitalToHistory(hospitalRecord);

					System.out.println("Hospital added to the patient's history successfully");

				} else {
					System.out.println("Patient not found!");
				}
				break;

			case 9:

				System.out.println("Exiting the program. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice! Please try again. ");
				break;

			}

		}

	}

}
