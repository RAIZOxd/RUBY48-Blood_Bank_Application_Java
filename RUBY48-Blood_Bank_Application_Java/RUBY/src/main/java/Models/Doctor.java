package Models;

public class Doctor extends StaffMember {

    public int Experiance;

    public Doctor(int Experiance, String SID, String StaffName, String StaffAddress, long StaffPhone, String StaffEmail, String Username, String Password) {
        super(SID, StaffName, StaffAddress, StaffPhone, StaffEmail, Username, Password);
        this.Experiance = Experiance;
    }

}
