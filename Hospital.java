package hospitalInformationSystem;

import java.util.ArrayList;
import java.util.List;

import sem2.Patient0;

public class Hospital {

	private List<Patient> patients;

	public Hospital() {
		this.patients = new ArrayList<>();
	}

	public void addPatient(Patient patient) {
		patients.add(patient);

	}

	public void displayAllPatients() {
		System.out.println("Patients: ");
		for (Patient patient : patients) {
			System.out.println("- " + patient.getName());
		}
	}

	public Patient getPatientByName(String name) {

		for (Patient patient : patients) {
			return patient;
		}
		return null;

	}

}
