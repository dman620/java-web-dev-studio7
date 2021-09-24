package org.launchcode.studio7;

public class DVD extends BaseDisc{
    private int maxRPM;
    private static int maxPossibleRPM = 5400;

    public DVD(){
        super();
        maxRPM = 4200;
    }

    public DVD(String name, String contents, int maxRPM, int maxBytes, int numSides){
        super(name, contents, maxRPM, maxBytes, numSides);
        if(maxRPM > maxPossibleRPM) this.maxRPM = maxPossibleRPM;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
