package com.margotelmadi.jaifaim.common.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.common.listener.OnRecyclerItemClickListener;
import com.margotelmadi.jaifaim.model.Restaurant;

import java.util.List;

/**
 * Created by dlevel on 24/01/2016.
 */
public class RestoClickableAdapter extends RecyclerView.Adapter<RestoClickableAdapter
        .ViewHolder> {
    private List<Restaurant> mRestoList;
    private static OnRecyclerItemClickListener mOnRecyclerItemClickListener;

    public RestoClickableAdapter(List<Restaurant> restoList, OnRecyclerItemClickListener
            onRecyclerItemClickListener) {
        mRestoList = restoList;
        mOnRecyclerItemClickListener = onRecyclerItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resto_small_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurant restaurant = mRestoList.get(position);
        holder.mImageView.setImageResource(restaurant.getImageResto());
        holder.mNomTxv.setText(restaurant.getNomResto());
    }

    @Override
    public int getItemCount() {
        return mRestoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View
            .OnClickListener, View.OnLongClickListener {
        private ImageView mImageView;
        private TextView mNomTxv;

        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView)v.findViewById(R.id.resto_img);
            mNomTxv = (TextView) v.findViewById(R.id.resto_name);
            v.setOnClickListener(this);
            v.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mOnRecyclerItemClickListener.onClick(view, getAdapterPosition(), false);
        }

        @Override
        public boolean onLongClick(View view) {
            mOnRecyclerItemClickListener.onClick(view, getAdapterPosition(), true);
            return true;
        }
    }
}
