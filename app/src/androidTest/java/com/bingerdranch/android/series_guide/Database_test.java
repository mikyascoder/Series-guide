package com.bingerdranch.android.series_guide;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.bingerdranch.android.series_guide.Database.AppDatabase;
import com.bingerdranch.android.series_guide.Database.SeriesDao;
import com.bingerdranch.android.series_guide.util.MockFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class Database_test {

    public static final String TAG="Junit";
    private AppDatabase mDb;
    private SeriesDao mDao;

    @Before
    public void createDb(){
        Context context = InstrumentationRegistry.getTargetContext();
        mDb= Room.inMemoryDatabaseBuilder(context,AppDatabase.class).build();
        mDao = mDb.seriesDao();
        Log.i(TAG,"createDb");
    }

    @After
    public void closeDb(){
        mDb.close();
        Log.i(TAG,"closeDb");

    }

    @Test
    public void createAndRetrieveNotes(){
        mDao.insertall((MockFactory.getMockedSerieListfordb()));
        int count= mDao.getcount();
        Log.i(TAG,"CreateAndRetrieveNotes: count="+ count);
        assertEquals(MockFactory.getMockedSerieListfordb().size(), count);

    }
}
