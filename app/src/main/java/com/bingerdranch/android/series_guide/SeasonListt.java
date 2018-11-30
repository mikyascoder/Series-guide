package com.bingerdranch.android.series_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bingerdranch.android.series_guide.Database.Episode;
import com.bingerdranch.android.series_guide.Database.Season;
import com.bingerdranch.android.series_guide.Database.SeasonEpisodewrapper;
import com.bingerdranch.android.series_guide.Database.Serie;
import com.bingerdranch.android.series_guide.util.MockFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeasonListt extends AppCompatActivity {

    private  ImageView mive;
    private List<Season> dataset;
    RecyclerView rv;
    String title;
    Serie cs;
    ArrayList<Season> season = new ArrayList<>();
    Season tempseason;
    SeasonEpisodewrapper tempseasonepi;
    List<Episode> episodelist = new ArrayList<>();
    ArrayList<Episode> episodesList = new ArrayList<>();

    int i;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("RETROFIT2", "On create");
        setContentView(R.layout.activity_season_list);

        mive=(ImageView) findViewById(R.id.imageee);
         cs=getIntent().getParcelableExtra("titleseason");
             getIncomingIntent();
        Log.d("check",cs.getTitle());
        Log.d("check",cs.getId());
        Log.d("check",Integer.toString(cs.getTotalseasons()));

      getseasonsepisode();

            }

    private  void getseasonsepisode() {
        Log.d("check","Season epi function");

        Api api= RetrofitService.getOMDBClient().create(Api.class);
        int n= cs.getTotalseasons();
        Log.d("check",Integer.toString(n));

        for(  i=1;i<=n;i++)
        {
            Log.d("Loop:",Integer.toString(i));
            Log.d("check",cs.getTitle());

            Call<SeasonEpisodewrapper> call=api.getSeasonepisode(Api.API_KEY, cs.getId(),i);
            String call_string = call.request().toString();
            Log.d("RETROFITT", call_string);
            call.enqueue(new Callback<SeasonEpisodewrapper>() {


                @Override
                public void onResponse(Call<SeasonEpisodewrapper> call, Response<SeasonEpisodewrapper> response) {
                               c=c+1;
                    Log.d("RETROFIT2", Integer.toString(c));
                    Log.d("RETROFIT2", response.body().toString());

                    tempseasonepi= response.body();

                    addseason(tempseasonepi);


            initadapter(season,episodesList);
                }

                @Override
                public void onFailure(Call<SeasonEpisodewrapper> call, Throwable t) {
                    call.cancel();
                    Log.e("RETROFIT_ERROR","TODO handle error");
                }
            });
            Log.d("i value", Integer.toString(i));

        }

    }

    private void addseason(SeasonEpisodewrapper tep) {
        episodesList=(ArrayList<Episode>) tep.getEplist();
        tempseason= new Season(tep.getTitle(),tep.getSeason(),Integer.toString(tep.getEplist().size()),tep.getEplist());
        season.add(tempseason);
    }

    private void initadapter(List<Season> dataset,ArrayList<Episode> episodes) {

        rv = findViewById(R.id.season_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        SeasonListAdapter adapter = new SeasonListAdapter(dataset, episodes,this);
        rv.setAdapter(adapter);

    }




    private void getIncomingIntent(){


             title=cs.getTitle();


        }

    }

