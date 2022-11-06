package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    private String  mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;


    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    // TODO - Put your code here.

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    public void setBusinessName(String name) {

        mBusinessName = name;

    }

    public void setParkingSpaces(int spaces) {
        mParkingSpaces = spaces;
    }

    @Override
    public String toString() {
        String msg = "Business: ";

        if(getBusinessName().equals(null)) {
            msg += "unoccupied";
        }
        else {
            msg += getBusinessName();
        }
        if(getParkingSpaces()>0) {
            msg += "; has " +getParkingSpaces()+ " parking spaces";
        }

        msg += " (total offices: " +getTotalOffices()+ ")";

        return msg;
    }

}
