package com.margotelmadi.jaifaim.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.factory.ListResto;
import com.margotelmadi.jaifaim.model.LieuResto;

import java.util.List;

public class RestoViewPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private RestoPagerAdapter mAdapter;
    private List<LieuResto> mLieuRestos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto_view_pager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mLieuRestos = ListResto.getListRestoList();

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mAdapter = new RestoPagerAdapter(getSupportFragmentManager(), mLieuRestos);
        mViewPager.setAdapter(mAdapter);

    }

}
