package com.bingerdranch.android.series_guide.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.widget.EditText;

import com.bingerdranch.android.series_guide.Database.AppRepository;
import com.bingerdranch.android.series_guide.Database.Serie;
import com.bingerdranch.android.series_guide.R;
import com.bingerdranch.android.series_guide.util.MockFactory;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    public List<Serie> mserie;
    private AppRepository mrepository;
    EditText msearchbox;


    public MainViewModel(@NonNull Application application) {
        super(application);
        mrepository=AppRepository.getInstance();
        mserie=mrepository.mserie;
    }
}
