package com.margotelmadi.jaifaim.fragment;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.common.adapter.RestoAdapter;
import com.margotelmadi.jaifaim.common.util.ItemClickSupport;
import com.margotelmadi.jaifaim.factory.RestoFactory;
import com.margotelmadi.jaifaim.model.Restaurant;

import java.util.List;

/**
 * Created by margotelmadi on 05/05/2016.
 */
public class RestoListFragment extends Fragment {

    private RestoListFragmentCallback mCallback;
    private List<Restaurant> mRestaurants;
    private RecyclerView mRecyclerView;
    private RestoAdapter mAdapter;

    public RestoListFragment() {

    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_resto_list, container, false);

        mRestaurants = RestoFactory.getRestoList();
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.resto_list_recycler);

        mRecyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new RestoAdapter(mRestaurants);
        mRecyclerView.setAdapter(mAdapter);


        ItemClickSupport.addTo(mRecyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                mCallback.onRestoSelected(mRestaurants.get(position));
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof RestoListFragmentCallback) {
            mCallback = (RestoListFragmentCallback) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

    public interface RestoListFragmentCallback {
        void onRestoSelected(Restaurant restaurant);
    }
}
