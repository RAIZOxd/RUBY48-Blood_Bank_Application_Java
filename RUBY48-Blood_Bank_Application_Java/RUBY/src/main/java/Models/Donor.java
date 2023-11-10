package Models;

public class Donor {

    public String DonorIN;
    public String DonorBloodType;
    private String DonorNIC;
    private String DonorName;
    private String DonorGender;
    private int DonorAge;
    private double DonorWeight;
    private String DonorAddress;
    private long DonorPhone;
    private String DonorEmail;

    public Donor(String DonorIN, String DonorBloodType, String DonorNIC, String DonorName, String DonorGender, int DonorAge, double DonorWeight, String DonorAddress, long DonorPhone, String DonorEmail) {
        this.DonorIN = DonorIN;
        this.DonorBloodType = DonorBloodType;
        this.DonorNIC = DonorNIC;
        this.DonorName = DonorName;
        this.DonorGender = DonorGender;
        this.DonorAge = DonorAge;
        this.DonorWeight = DonorWeight;
        this.DonorAddress = DonorAddress;
        this.DonorPhone = DonorPhone;
        this.DonorEmail = DonorEmail;
    }

}
