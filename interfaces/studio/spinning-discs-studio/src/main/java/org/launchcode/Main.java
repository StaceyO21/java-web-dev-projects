package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD alanis = new CD(12.1f,12,"200 - 500");
        DVD movie = new DVD(24.3f,5,"570 - 1600");

        alanis.spinDisc();
        movie.spinDisc();
    }
}

/*

Shared behavior
-store data
-spin
-play tracks
-laser to read/write
-report info (properties like title, length, etc)
-can be formatted

Shared fields
-storage capacity
-compact in size and shape -- (same size??)
-Number of tracks/chapters


    CD Behavior
    -Only audio format (could be set by property?)
    -Can store image


    DVD Behavior
    -Can be Double sided
    -Can have BluRay -- (Would that be a different child class?)
    -Display a menu
    -play video media
    -Can be used for video games -- different kind of reader?

 */