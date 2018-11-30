package com.bingerdranch.android.series_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bingerdranch.android.series_guide.Database.Constant;
import com.bingerdranch.android.series_guide.Database.Serie;
import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class SeriesListAdapter extends RecyclerView.Adapter<SeriesListAdapter.ViewHolder>{

    private Context mContext;
    private List<Serie> mDataSet;


    public SeriesListAdapter(
            List<Serie> dataset, Context context) {

        this.mDataSet = dataset;
        this.mContext = context;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_serie_listitem,parent,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Serie serie = mDataSet.get(position);
        Glide.with(mContext).asBitmap().load(serie.getImageURL()).into(holder.image);
        holder.title.setText(serie.getTitle());
        holder.released.setText(serie.getRelease());



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(mContext,Series_detail.class);
                intent.putExtra(Constant.SERIE, serie);

                mContext.startActivity(intent);
            }
        };

        holder.parentLayout.setOnClickListener(clickListener);

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView title;
        TextView released;
        RelativeLayout parentLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            title= itemView.findViewById(R.id.title);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            released=itemView.findViewById(R.id.release_date);
        }
    }
}