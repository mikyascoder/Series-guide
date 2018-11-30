package com.bingerdranch.android.series_guide.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities={Serie.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DatabaseName="AppDatabase.db";
    private static volatile AppDatabase instance;
    private static final Object Lock=new Object();

    public abstract SeriesDao seriesDao();

    public static AppDatabase getInstance(Context context) {
        if (instance==null) {
            synchronized (Lock) {
                if (instance == null) {
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DatabaseName).build();
                }
            }
        }
        return instance;
    }


}
