package org.launchcode;

import java.time.LocalDate;

public class CD extends BaseDisc implements OpticalDisc  {
    // TODO: Implement your custom interface.
    public CD (String spinDirection, Double spinSpeed, String mediaData, String mediaName, Double mediaLength, String mediaRelease){
        super (spinDirection, spinSpeed, mediaData, mediaName, mediaLength, mediaRelease);
    }

    @Override
    public void spinDisc() {
        System.out.println("This CD spins at: "+ getSpinSpeed());
    }
}