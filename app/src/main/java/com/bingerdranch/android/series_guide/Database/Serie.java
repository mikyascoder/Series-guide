package com.bingerdranch.android.series_guide.Database;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;


@Entity(tableName="series")
public class Serie implements Parcelable {
    public Serie(String title, String imageURL, String releasedt, int totalseasons, String id,String plot) {
        this.title = title;
        this.imageURL = imageURL;
        this.releasedt = releasedt;
        this.totalseasons = totalseasons;
        this.id = id;
        this.plot=plot;
    }
@NonNull
    @PrimaryKey
    @SerializedName("Title")
    private String title;
    @SerializedName("Poster")
    private String imageURL;
    @SerializedName("imdbID")
    String id;
    @SerializedName("Released")
    private String releasedt;
    @SerializedName("totalSeasons")
    int totalseasons;
    @SerializedName("Plot")
    private String plot;

    public String getReleasedt() {
        return releasedt;
    }


    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Ignore
    public Serie(String title, String imageURL, String release,String id,int totalseasons,String plot) {
        this.title = title;
        this.imageURL = imageURL;
        this.releasedt= release;
        this.id=id;
        this.totalseasons=totalseasons;
        this.plot=plot;
    }

    public int getTotalseasons() {
        return totalseasons;
    }

    public void setTotalseasons(int totalseasons) {
        this.totalseasons = totalseasons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getRelease(){
        return releasedt;
    }

    public void setRelease(String releasedate){
        this.releasedt=releasedate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", imageURL='" + imageURL + '\'' +"release date: "+releasedt+"total seasons"+ totalseasons
                +"id:"+id+"plot:"+plot+
                '}';
    }
    @Ignore
    protected Serie(Parcel in) {
        title = in.readString();
        imageURL = in.readString();
        releasedt = in.readString();
        id=in.readString();
        totalseasons=in.readInt();
        plot=in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(imageURL);
        dest.writeString(releasedt);
        dest.writeString(id);
        dest.writeInt(totalseasons);
        dest.writeString(plot);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Serie> CREATOR = new Parcelable.Creator<Serie>() {
        @Override
        public Serie createFromParcel(Parcel in) {
            return new Serie(in);
        }

        @Override
        public Serie[] newArray(int size) {
            return new Serie[size];
        }
    };
}
