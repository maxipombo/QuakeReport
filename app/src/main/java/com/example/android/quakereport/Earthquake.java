package com.example.android.quakereport;

/**
 * Created by mpombos on 21/7/16.
 */
public class Earthquake {

    // Magnitude of the earthquake
    private String mMagnitude;

    // Earthquake location
    private String mLocation;

    // Earthquake date
    private String mDate;

    /*
    * Create a new Earthquake object.
    *
    * */
    public Earthquake(String vMagnitude, String vLocation, String vDate)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mDate = vDate;
    }

    /**
     * Get the Magnitude
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the Date
     */
    public String getDate() {
        return mDate;
    }
}
