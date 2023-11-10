package Models;

public class Patient {

    public String PID;
    public String PatientBloodType;
    public String PatientNIC;
    public String PatientName;
    private String PatientAddress;
    private long PatientPhone;
    private String PatientEmail;

    public Patient(String PID, String PatientBloodType, String PatientNIC, String PatientName, String PatientAddress, long PatientPhone, String PatientEmail) {
        this.PID = PID;
        this.PatientBloodType = PatientBloodType;
        this.PatientNIC = PatientNIC;
        this.PatientName = PatientName;
        this.PatientAddress = PatientAddress;
        this.PatientPhone = PatientPhone;
        this.PatientEmail = PatientEmail;
    }

}
