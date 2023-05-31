package hospitalInformationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {

	private String name;
	private List<Medicine> currentMedicines;
	private List<Medicine> medicineHistory;
	private List<OperationRecord> operations;

	private HospitalRecord currentHospital;
	private List<HospitalRecord> hospitalHistory;

	public Patient(String name) {

		this.name = name;
		this.currentMedicines = new ArrayList<>();
		this.medicineHistory = new ArrayList<>();
		this.operations = new ArrayList<>();
		this.currentHospital = null;
		this.hospitalHistory = new ArrayList<>();

	}

	public String getName() {
		return name;
	}

	public void addMedicine(Medicine medicine) {
		currentMedicines.add(medicine);
	}

	public void addMedicineToHistory(Medicine medicine) {
		medicineHistory.add(medicine);
	}

	public void addOperation(OperationRecord operationRecord) {
		operations.add(operationRecord);
	}

	public void setCurrentHospital(HospitalRecord hospital) {

		currentHospital = hospital;

	}

	public void addHospitalToHistory(HospitalRecord hospital) {
		hospitalHistory.add(hospital);
	}

	public void displayPatientDetails() {
		System.out.println("Patient name: " + name);
		System.out.println("Current Medicines: ");
		
		for(Medicine medicine : currentMedicines) {
			System.out.println("< > " + medicine.getName());
		}
		
		System.out.println("Medicine History ****: ");
		for(Medicine medicine : medicineHistory) {
			System.out.println("# " + medicine.getName());
		}
		
		System.out.println("Operations: ");
		for(OperationRecord operation : operations) {
			operation.displayOperationDetails(); 
		}
		
		System.out.println("Current Hospital: " + (currentHospital != null ? currentHospital.getName() : "None")); 
		System.out.println("Hospital History: ");
		for (HospitalRecord hospital : hospitalHistory) {
			System.out.println("- " + hospital.getName());
		}
		
		
	}

	public List<Medicine> getMedicineHistory() {
		return medicineHistory;
	}

}
