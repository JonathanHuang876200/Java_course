package oo.abstruction;

public class PatientRecordTester {

	public static void main(String[] args) {

		PatientRecord[] patientrecords = new PatientRecord[3];
		patientrecords[0] = new PatientRecord(001, "F129968489", "Jonathan", "M", "19980602", "022219xxx", "093215xxxx",
				"New Taipei City");
		patientrecords[1] = new PatientRecord(002, "Fxxxxxxxxx", "vivian", "F", "20000416", "022219xxx", "093215xxxx",
				"Taichung");
		patientrecords[2] = new PatientRecord(003, "Jxxxxxxxxx", "IDK", "M", "123456789", "022219xxx", "093215xxxx",
				"America");
		for (int i = 0; i <= 2; i++) {
			System.out.println(patientrecords[i].ChartNumber);
		}

	}

}
