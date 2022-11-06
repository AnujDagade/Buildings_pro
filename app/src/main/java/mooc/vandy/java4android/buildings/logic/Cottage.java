package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {

    // TODO - Put your code here.

    private  boolean mSecondFloor = false;

    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += super.toString();

        if(hasSecondFloor() == true) {
            msg += "; is a two story cottage";
        }
        else {
            msg += "; is a cottage";
        }



        return msg;
    }

}

