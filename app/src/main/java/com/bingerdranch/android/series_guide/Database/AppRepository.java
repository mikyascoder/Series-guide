package com.bingerdranch.android.series_guide.Database;

import com.bingerdranch.android.series_guide.util.MockFactory;

import java.util.List;

public class AppRepository {
    private static final AppRepository ourInstance = new AppRepository();

    public List<Serie> mserie;

    public static AppRepository getInstance() {
        return ourInstance;
    }

    private AppRepository() {
        mserie=MockFactory.getMockedSerieList();
    }
}
