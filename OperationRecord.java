package hospitalInformationSystem;

public class OperationRecord {

	private String operationDate;
	private String operationRoomNumber;
	private String ailment;
	private String purpose;

	public OperationRecord(String operationDate, String operationRoomNumber, String ailment, String purpose) {
		this.operationDate = operationDate;
		this.operationRoomNumber = operationRoomNumber;
		this.ailment = ailment;
		this.purpose = purpose;
	}

	public void displayOperationDetails() {
		System.out.println("Operation Date: " + operationDate);
		System.out.println("Operation room number: " + operationRoomNumber);
		System.out.println("Ailment: " + ailment);
		System.out.println("Purpose: " + purpose);
		System.out.println();
	}

}
