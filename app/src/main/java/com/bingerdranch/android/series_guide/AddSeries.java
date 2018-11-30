package com.bingerdranch.android.series_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bingerdranch.android.series_guide.Database.Serie;
import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddSeries extends AppCompatActivity {
    EditText msearchbox;
    Button msearchseries;
    Button maddseries;
    ImageView msearchimage;
    Serie se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_series);

        msearchseries= findViewById(R.id.searchtoadd);
        maddseries =findViewById(R.id.addtolist);
        msearchbox=findViewById(R.id.searchbox);
        msearchimage=findViewById(R.id.searchimage);
        Glide.with(AddSeries.this)
                .asBitmap()
                .load("https://wallpapercave.com/wp/wp1945898.jpg")
                .into(msearchimage);

        msearchseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String query=msearchbox.getText().toString();
                Api api= RetrofitService.getOMDBClient().create(Api.class);
                Call<Serie> call=api.getSerieDetails(Api.API_KEY, query);
                String call_string = call.request().toString();
                Log.d("RETROFIT", call_string);
                call.enqueue(new Callback<Serie>() {
                    @Override
                    public void onResponse(Call<Serie> call, Response<Serie> response) {

                        Log.d("RETROFIT", response.body().toString());
                         se= response.body();
                        Glide.with(AddSeries.this)
                                .asBitmap()
                                .load(se.getImageURL())
                                .into(msearchimage);
                        Log.d("check",se.getTitle());
                        Log.d("check",se.getId());
                        Log.d("check",Integer.toString(se.getTotalseasons()));
                    }

                    @Override
                    public void onFailure(Call<Serie> call, Throwable t) {
                        call.cancel();
                        Log.e("RETROFIT_ERROR",
                                "TODO handle error <" + t.getMessage() + "> <" + t.toString() + ">");
                    }

                });

            }
        });
        maddseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddSeries.this,MainActivity.class);
                intent.putExtra("seriessearch",se);
                startActivity(intent);
            }
        });
    }
}
