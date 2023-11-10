package Models;

public class BloodInventory {

    public String BloodType;
    public double Quantity;
    public int NumberOfRequests;

    public BloodInventory(String BloodType, double Quantity, int NumberOfRequests) {
        this.BloodType = BloodType;
        this.Quantity = Quantity;
        this.NumberOfRequests = NumberOfRequests;
    }

}
