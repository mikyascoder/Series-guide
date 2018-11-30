package com.bingerdranch.android.series_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.bingerdranch.android.series_guide.Database.Episode;
import com.bingerdranch.android.series_guide.Database.Season;
import com.bingerdranch.android.series_guide.Database.SeasonEpisodewrapper;
import com.bingerdranch.android.series_guide.Database.Serie;
import com.bingerdranch.android.series_guide.util.MockFactory;
import com.bumptech.glide.Glide;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EpisodeList extends AppCompatActivity {

    private List<Episode> dataset;
    RecyclerView rv;
    Season sea;
    Serie se;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_list);

        sea=getIntent().getParcelableExtra("fromseaseontoepisode");

        dataset=sea.getEpisodeList();
        Log.d("check",sea.getTitle());
        Log.d("check",sea.getSeason_number());
        Log.d("check",sea.getEpisodes());



        rv= findViewById(R.id.episode_recycler_view);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        EpisodeListAdapter epadap=new EpisodeListAdapter(dataset,this);
        rv.setAdapter(epadap);

    }

}
