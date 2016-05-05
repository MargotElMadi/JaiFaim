package com.margotelmadi.jaifaim.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.model.Restaurant;

/**
 * Created by margotelmadi on 05/05/2016.
 */
public class RestoDetailFragment extends Fragment {
    private static final String ARG_RESTO = "resto";

    private Restaurant mRestaurant;


    public RestoDetailFragment() {
        // Required empty public constructor
    }

    public static RestoDetailFragment newInstance(Restaurant restaurant) {
        RestoDetailFragment fragment = new RestoDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_RESTO, restaurant);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mRestaurant = (Restaurant) getArguments().getSerializable(ARG_RESTO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_resto_detail, container, false);

        TextView firstNameTxv = (TextView) rootView.findViewById(R.id.resto_name);
        TextView lastNameTxv = (TextView) rootView.findViewById(R.id.resto_detail_km);

        firstNameTxv.setText(mRestaurant.getNomResto());
        lastNameTxv.setText("12Km");

        return rootView;
    }

}
