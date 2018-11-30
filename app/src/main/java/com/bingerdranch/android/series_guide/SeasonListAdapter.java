package com.bingerdranch.android.series_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bingerdranch.android.series_guide.Database.Episode;
import com.bingerdranch.android.series_guide.Database.Season;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class SeasonListAdapter extends RecyclerView.Adapter<SeasonListAdapter.ViewHolder>{

    private Context mContext;
    private List<Season> mDataset;
    private ArrayList<Episode> mepisodes;


    public SeasonListAdapter(
            List<Season> dataset, ArrayList<Episode>episodes, Context context) {

        this.mDataset = dataset;
        this.mContext = context;
        this.mepisodes= episodes;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mDataset= sortdataset(mDataset);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_seasonitem,parent,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Season season = mDataset.get(position);


        holder.season_no.setText(season.getSeason_number());
        holder.episode_no.setText(season.getEpisodes());



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(mContext,EpisodeList.class);
                intent.putExtra("fromseaseontoepisode",season);



                mContext.startActivity(intent);
            }
        };

        holder.parentLayout.setOnClickListener(clickListener);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView season_no;
        TextView episode_no;
        LinearLayout parentLayout;
        public ViewHolder(View itemView) {
            super(itemView);

            season_no= itemView.findViewById(R.id.season_number);
            episode_no=itemView.findViewById(R.id.number_of_episodes);
            parentLayout = itemView.findViewById(R.id.season_parent_layout);

        }
    }
    private  List<Season> sortdataset(List<Season> dataset) {

        Log.d("sort", "sorting begin");
        int i, j;
        int  n=dataset.size();
        Log.d("sort", Integer.toString(n));
        for (i = 0; i < n-1; i++)


            for (j = 0; j < n-i-1; j++)
                if ( Integer.parseInt(dataset.get(j).getSeason_number()) > Integer.parseInt(dataset.get(j+1).getSeason_number()))
                {
                    Collections.swap(dataset, j, j+1);
                    Log.d("sort", "swapped");
                }
        return dataset;
    }
}