package com.bingerdranch.android.series_guide.Database;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeasonEpisodewrapper {
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @SerializedName("Episodes")
    List<Episode> eplist;
    @SerializedName("totalSeasons")
    int totalseasons;
    @SerializedName("Title")
    String title;
    @SerializedName("Season")

    private String season;


    public List<Episode> getEplist() {
        return eplist;
    }

    public void setEplist(List<Episode> eplist) {
        this.eplist = eplist;
    }

    public int getSeasonno() {
        return totalseasons;
    }

    public void setSeasonno(int seasonno) {
        this.totalseasons = seasonno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "SeasepisosdeWrapper{" +
                "Title= " + title +" Total season: "+totalseasons+" no of Episodes: "+eplist.size()+"season: "+ season+
                '}';
    }
}
