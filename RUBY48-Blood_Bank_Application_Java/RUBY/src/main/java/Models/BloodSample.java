package Models;

public class BloodSample extends Donor {

    public String BloodBagType;
    public String BloodStatus;
    public String ExpiryDate;
    public double HBCount;

    public BloodSample(String BloodBagType, String BloodStatus, String ExpiryDate, double HBCount, String DonorIN, String DonorBloodType, String DonorNIC, String DonorName, String DonorGender, int DonorAge, double DonorWeight, String DonorAddress, long DonorPhone, String DonorEmail) {
        super(DonorIN, DonorBloodType, DonorNIC, DonorName, DonorGender, DonorAge, DonorWeight, DonorAddress, DonorPhone, DonorEmail);
        this.BloodBagType = BloodBagType;
        this.BloodStatus = BloodStatus;
        this.ExpiryDate = ExpiryDate;
        this.HBCount = HBCount;
    }

}
