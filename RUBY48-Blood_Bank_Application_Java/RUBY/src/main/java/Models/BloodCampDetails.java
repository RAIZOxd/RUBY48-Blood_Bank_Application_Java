package Models;

public class BloodCampDetails {

    public String Date;
    public String Time;
    public String Location;
    public int NumberOfGroups;
    public String GroupID;

    public BloodCampDetails(String Date, String Time, String Location, int NumberOfGroups, String GroupID) {
        this.Date = Date;
        this.Time = Time;
        this.Location = Location;
        this.NumberOfGroups = NumberOfGroups;
        this.GroupID = GroupID;
    }

}
