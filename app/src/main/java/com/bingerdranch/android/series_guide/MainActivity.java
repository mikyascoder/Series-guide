package com.bingerdranch.android.series_guide;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.bingerdranch.android.series_guide.Database.SeasonEpisodewrapper;
import com.bingerdranch.android.series_guide.Database.Serie;
import com.bingerdranch.android.series_guide.ViewModel.MainViewModel;
import com.bingerdranch.android.series_guide.util.MockFactory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    private List<Serie> dataset;
    RecyclerView rv;

    private MainViewModel mViewModel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviewmodel();
        Serie searchseries= getIntent().getParcelableExtra("seriessearch");


        dataset=mViewModel.mserie;
        if (searchseries != null) {
         dataset.add(0,searchseries);
        }

        rv = findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        SeriesListAdapter adapter = new SeriesListAdapter(dataset, this);
        rv.setAdapter(adapter);

        Button bn= findViewById(R.id.search_button);
           bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent intent=new Intent(MainActivity.this, AddSeries.class);
                 startActivity(intent);



            }

        });



    }

    private void initviewmodel() {
        mViewModel=ViewModelProviders.of(this)
                .get(MainViewModel.class);
    }


}
