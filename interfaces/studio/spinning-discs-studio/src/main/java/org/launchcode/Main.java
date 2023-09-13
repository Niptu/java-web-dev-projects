package org.launchcode;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        DVD theLittleMermaid = new DVD ("right", 15.0, "movie", "The Little Mermaid", 1.75, "11-30-1993" );
        CD redHotChiliPeppersAlbum = new CD ("left", 30.3, "music", "Red Hot Chili Peppers", 2.5, "04-15-1990");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        theLittleMermaid.infoReport();
    }
}