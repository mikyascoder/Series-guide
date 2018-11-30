package com.bingerdranch.android.series_guide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bingerdranch.android.series_guide.Database.Episode;

import java.util.List;


public class EpisodeListAdapter extends RecyclerView.Adapter<EpisodeListAdapter.ViewHolder>{

    private Context mContext;
    private List<Episode> mDataSet;


    public EpisodeListAdapter(
            List<Episode> dataset, Context context) {

        this.mDataSet = dataset;
        this.mContext = context;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_episode_item,parent,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Episode episode = mDataSet.get(position);
        //Glide.with(mContext).asBitmap().load(serie.getImageURL()).into(holder.image);
        holder.eptitle.setText(episode.getEpisode_name());
        holder.epreleasedate.setText(episode.getRelease_date());
        holder.episodenumber.setText(episode.getEpisode_number());




    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView episodenumber;
        TextView eptitle;
        TextView epreleasedate;
        LinearLayout epparentLayout;
        public ViewHolder(View itemView) {
            super(itemView);

            eptitle= itemView.findViewById(R.id.eptitle);
            epparentLayout = itemView.findViewById(R.id.ep_parentlayout);
            epreleasedate=itemView.findViewById(R.id.epreleasedate);
            episodenumber=itemView.findViewById(R.id.episode_numb);
        }
    }
}
