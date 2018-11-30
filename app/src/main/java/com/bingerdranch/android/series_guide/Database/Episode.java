package com.bingerdranch.android.series_guide.Database;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Episode implements Parcelable {


    @SerializedName("Title")
    String episode_name;
    @SerializedName("Released")
    String release_date;
    @SerializedName("Episode")
    String episode_number;

    public String getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(String episode_number) {
        this.episode_number = episode_number;
    }



    public Episode( String episode_name, String release_date, String episode_number){
        this.episode_number=episode_number;
        this.episode_name=episode_name;
        this.release_date=release_date;
    }






    public String getEpisode_name() {
        return episode_name;
    }

    public void setEpisode_name(String episode_name) {
        this.episode_name = episode_name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }






    protected Episode(Parcel in) {
        episode_number = in.readString();
        episode_name = in.readString();
        release_date = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(episode_number);
        dest.writeString(episode_name);
        dest.writeString(release_date);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Episode> CREATOR = new Parcelable.Creator<Episode>() {
        @Override
        public Episode createFromParcel(Parcel in) {
            return new Episode(in);
        }

        @Override
        public Episode[] newArray(int size) {
            return new Episode[size];
        }
    };
}
