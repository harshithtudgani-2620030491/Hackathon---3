class Appointment {
    private String patientName;
    private String patientID;
    private String doctorName;
    private String appointmentType;
    private double consultationFee;
    private String status;

    public Appointment(String patientName, String patientID, String doctorName, String appointmentType, double consultationFee) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.doctorName = doctorName;
        this.appointmentType = appointmentType;
        this.consultationFee = consultationFee;
        this.status = "Confirmed";
    }

    public Appointment(String patientName, String patientID, String doctorName, double consultationFee) {
        this(patientName, patientID, doctorName, "GENERAL", consultationFee);
    }

    public Appointment(String patientName, String patientID) {
        this(patientName, patientID, "DR. DEFAULT", "GENERAL", 300.0);
    }

    public void displayAppointment() {
        System.out.println("Patient Name : " + patientName.toUpperCase());
        System.out.println("Patient ID   : " + patientID);
        System.out.println("Doctor Name  : " + doctorName.toUpperCase());
        System.out.println("Appointment Type : " + appointmentType);
        System.out.printf("Consultation Fee : Rs. %.2f%n", consultationFee);
        System.out.println("Appointment Status : " + status);
    }

    public boolean verifyPatient(String otherName) {
        return this.patientName.equalsIgnoreCase(otherName);
    }

    public double getConsultationFee() {
        return consultationFee;
    }
}

public class ClinicSystem {
    public static void main(String[] args) {
        System.out.println("========== CLINIC APPOINTMENT SYSTEM ==========");

        Appointment a1 = new Appointment("Priya Sharma", "P101", "Dr. Kumar", "GENERAL", 500.0);
        Appointment a2 = new Appointment("Rahul Verma", "P102", "Dr. Meena", "SPECIALIST", 800.0);

        a1.displayAppointment();
        a2.displayAppointment();

        System.out.println("---------- APPOINTMENT SUMMARY ----------");
        int totalAppointments = 2;
        double totalConsultation = a1.getConsultationFee() + a2.getConsultationFee();
        System.out.println("Total Appointments : " + totalAppointments);
        System.out.printf("Total Consultation : Rs. %.2f%n", totalConsultation);

        if (a1.verifyPatient("Priya Sharma")) {
            System.out.println("Patient Verification: Names Match");
        } else {
            System.out.println("Patient Verification: Names Do Not Match");
        }

        System.out.println("=============================================");
    }
}
