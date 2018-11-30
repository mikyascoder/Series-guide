package com.bingerdranch.android.series_guide.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface SeriesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertnote(Serie note);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertall(List<Serie> notes);

    @Delete
    void deleteNote(Serie note);

    @Query("SELECT * from series WHERE id= :id")
    Serie getNoteBYId(int id);

    @Query("SELECT * from series ")
    LiveData<List<Serie> > getall();

    @Query("DELETE From series")
    int deleteAll();

    @Query ("SELECT COUNT(*) FROM series")
    int getcount();

}
