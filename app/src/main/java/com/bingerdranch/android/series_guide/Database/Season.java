package com.bingerdranch.android.series_guide.Database;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;




public class Season implements Parcelable {

    private String season_number;
    private String episodes;
    private String title;
    private List<Episode> episodeList = null;



    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }



    public Season(String title, String season_number, String episodes, List<Episode> episodelist) {

        this.season_number = season_number;
        this.episodes = episodes;
        this.title=title;
        this.episodeList=episodelist;

    }






    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getSeason_number() {
        return season_number;
    }

    public void setSeason_number(String season_number) {
        this.season_number = season_number;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }



    protected Season(Parcel in) {
        season_number = in.readString();
        episodes = in.readString();
        title = in.readString();
        if (in.readByte() == 0x01) {
            episodeList = new ArrayList<Episode>();
            in.readList(episodeList, Episode.class.getClassLoader());
        } else {
            episodeList = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(season_number);
        dest.writeString(episodes);
        dest.writeString(title);
        if (episodeList == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(episodeList);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Season> CREATOR = new Parcelable.Creator<Season>() {
        @Override
        public Season createFromParcel(Parcel in) {
            return new Season(in);
        }

        @Override
        public Season[] newArray(int size) {
            return new Season[size];
        }
    };
}