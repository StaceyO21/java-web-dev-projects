package org.launchcode;

public class CD extends BaseDisc {
    // TODO: Implement your custom interface.


    public CD(float storageCapacity, int numOfTracks, String rpm) {
        super(storageCapacity, numOfTracks, rpm);
    }

    @Override
    public void readDisc() {

    }

    @Override
    public void writeDisc() {

    }

    @Override
    public void playTrack() {

    }

    @Override
    public void spinDisc() {
        System.out.println("CD spins at " + this.getRpm() + " rmp.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
