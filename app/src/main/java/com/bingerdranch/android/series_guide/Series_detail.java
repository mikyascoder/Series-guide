package com.bingerdranch.android.series_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bingerdranch.android.series_guide.Database.Constant;
import com.bingerdranch.android.series_guide.Database.Serie;

import com.bumptech.glide.Glide;

public class Series_detail extends AppCompatActivity {


ImageView imv;
Serie currentSerie;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seriesdetail);

        currentSerie = getIntent().getParcelableExtra(Constant.SERIE);
        getIncomingIntent();

        imv=findViewById(R.id.imageee);
        imv.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent intent=new Intent(Series_detail.this,SeasonListt.class);
                                       intent.putExtra("titleseason",currentSerie);
                                       startActivity(intent);
                                   }
                               }
        );



    }





    private void getIncomingIntent(){

        if (currentSerie != null) {

            setSeries(currentSerie.getImageURL(),currentSerie.getPlot());
        }
    }

        private void setSeries(String imageurl,String title){
            TextView name=findViewById(R.id.image_description);
            name.setText(title);
            ImageView image= findViewById(R.id.imageee);
            Glide.with(this)
                    .asBitmap()
                    .load(imageurl)
                    .into(image);
        }
}
