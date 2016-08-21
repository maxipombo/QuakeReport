package com.example.android.quakereport;

/**
 * Created by mpombos on 21/7/16.
 */
public class Earthquake {

    // Magnitude of the earthquake
    private Double mMagnitude;

    // Earthquake location
    private String mLocation;

    // Earthquake date
    private long mTimeInMilliseconds;

    // Earthquake url
    private String mUrl;

    /*
    * Create a new Earthquake object.
    *
    * */
    public Earthquake(Double vMagnitude, String vLocation, Long vTimeInMilliseconds, String vUrl)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTimeInMilliseconds = vTimeInMilliseconds;
        mUrl = vUrl;
    }

    /**
     * Get the Magnitude
     */
    public Double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the Date time In Milliseconds
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the URL
     */
    public String getUrl() {
        return mUrl;
    }
}
