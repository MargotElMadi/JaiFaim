package com.margotelmadi.jaifaim.common.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.margotelmadi.jaifaim.model.LieuResto;
import com.margotelmadi.jaifaim.model.Restaurant;
import com.margotelmadi.jaifaim.R;
import java.util.List;

/**
 * Created by margotelmadi on 05/05/2016.
 */
    public class RestoAdapter extends RecyclerView.Adapter<RestoAdapter.ViewHolder> {

    private List<LieuResto> mRestoList;

    public RestoAdapter(List<LieuResto> restoList) {
        mRestoList = restoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resto_small_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LieuResto restaurant = mRestoList.get(position);

        holder.mNameTxv.setText(restaurant.getNomResto());
        holder.mKmTxv.setText(restaurant.getKmResto());
    }

    @Override
    public int getItemCount() {
        return mRestoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTxv;
        private TextView mKmTxv;

        public ViewHolder(View v) {
            super(v);
            mNameTxv = (TextView) v.findViewById(R.id.resto_name);
            mKmTxv = (TextView) v.findViewById(R.id.resto_name);
        }

        public void bind(Restaurant restaurant) {
            mNameTxv.setText(restaurant.getNomResto());
            mKmTxv.setText(restaurant.getNomResto());
        }
    }
}

