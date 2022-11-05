package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    // TODO - Put your code here.

    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mPool = false;
    }


    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;

    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setmOwner(String owner) {
        mOwner = owner;
    }

    public void setPool(boolean pool) {
        mPool = pool;
    }

    @Override
    public String toString() {
        return
    }
    
}
