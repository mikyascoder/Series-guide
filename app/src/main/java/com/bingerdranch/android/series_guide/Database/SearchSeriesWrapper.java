package com.bingerdranch.android.series_guide.Database;

import com.google.gson.annotations.SerializedName;

public class SearchSeriesWrapper {

    @SerializedName("imdbID")
    public String imdbID;
    @SerializedName("Title")
    public String title;
    @SerializedName("Year")
    public String year;
    @SerializedName("Type")
    public String type;


    public SearchSeriesWrapper(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @Override
    public String toString() {
        return "SearchSeriesWrapper{" +
                "imdbID='" + imdbID + '\'' +
                '}';
    }
}
