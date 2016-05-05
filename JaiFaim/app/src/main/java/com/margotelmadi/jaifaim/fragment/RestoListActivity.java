package com.margotelmadi.jaifaim.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.model.LieuResto;
import com.margotelmadi.jaifaim.model.Restaurant;

public class RestoListActivity extends AppCompatActivity implements RestoListFragment.RestoListFragmentCallback {

    private boolean mTowPanes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(findViewById(R.id.resto_detail_container) != null){
            mTowPanes = true;
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onRestoSelected(LieuResto lieuRestaurant) {
        if(mTowPanes){
            RestoDetailFragment fragment = RestoDetailFragment.newInstance(lieuRestaurant);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.resto_detail_container, fragment)
                    .commit();
        }else{
            Intent intent = new Intent(this, RestoDetailActivity.class);
            intent.putExtra("resto", lieuRestaurant);
            startActivity(intent);
        }
    }
}
