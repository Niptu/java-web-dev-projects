package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD (String spinDirection, Double spinSpeed, String mediaData, String mediaName, Double mediaLength, String mediaReleaseDate) {
        super (spinDirection,spinSpeed, mediaData, mediaName, mediaLength, mediaReleaseDate);
    }

    @Override
    public void spinDisc() {
        System.out.println("Disc spins at: "+ getSpinSpeed());
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}