package Models;

public class StaffMember {

    public String SID;
    public String StaffName;
    private String StaffAddress;
    private long StaffPhone;
    private String StaffEmail;
    protected String Username;
    protected String Password;

    public StaffMember(String SID, String StaffName, String StaffAddress, long StaffPhone, String StaffEmail, String Username, String Password) {
        this.SID = SID;
        this.StaffName = StaffName;
        this.StaffAddress = StaffAddress;
        this.StaffPhone = StaffPhone;
        this.StaffEmail = StaffEmail;
        this.Username = Username;
        this.Password = Password;
    }

}
