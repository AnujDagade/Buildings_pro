package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // TODO - Put your code here.

    private Neighborhood() {

    }

    public static void print(Building[] buildings, String header, OutputInterface mOut) {
        mOut.println(header);
        mOut.println("----------");

        for(int i=0; i<buildings.length; i++) {
            mOut.println(buildings[i]);
        }

    }

    public static int calcArea(Building[] buildings) {
        int totalArea = 0;

        for(int i=0; i<buildings.length; i++) {
            totalArea += buildings[i].calcBuildingArea();
            totalArea += buildings[i].calcLotArea();
        }

        return totalArea;
    }
    
}
