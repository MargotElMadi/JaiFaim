package com.margotelmadi.jaifaim.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.margotelmadi.jaifaim.model.LieuResto;
import com.margotelmadi.jaifaim.model.Restaurant;

import java.util.List;

/**
 * Created by margotelmadi on 06/05/2016.
 */
public class RestoPagerAdapter extends FragmentStatePagerAdapter {

    private List<LieuResto> mLieuRestos;

    public RestoPagerAdapter(FragmentManager fm, List<LieuResto> lieuRestos){
        super(fm);
        mLieuRestos = lieuRestos;
    }

    @Override
    public Fragment getItem(int position) {
        return RestoDetailFragment.newInstance(mLieuRestos.get(position));
    }

    @Override
    public int getCount() {
        return mLieuRestos.size();
    }

    @Override
    public CharSequence getPageTitle(int position){return mLieuRestos.get(position).getNomResto();}
}
