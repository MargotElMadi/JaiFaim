package com.margotelmadi.jaifaim.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.model.LieuResto;

public class RestoDetailFragment extends Fragment {
    private static final String ARG_RESTO = "resto";

    private LieuResto mLieuResto;


    public RestoDetailFragment() {
        // Required empty public constructor
    }

    public static RestoDetailFragment newInstance(LieuResto lieuResto) {
        RestoDetailFragment fragment = new RestoDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_RESTO, lieuResto);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLieuResto = (LieuResto) getArguments().getSerializable(ARG_RESTO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_resto_detail, container, false);

        TextView nameTxv = (TextView) rootView.findViewById(R.id.resto_detail_name);
        TextView kmTxv = (TextView) rootView.findViewById(R.id.resto_detail_km);

        nameTxv.setText(mLieuResto.getNomResto());
        kmTxv.setText(mLieuResto.getKmResto());

        return rootView;
    }

}
