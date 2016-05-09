package com.margotelmadi.jaifaim;

import android.app.AlertDialog;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.margotelmadi.jaifaim.common.listener.OnRecyclerItemClickListener;
import com.margotelmadi.jaifaim.factory.ListResto;
import com.margotelmadi.jaifaim.model.LieuResto;

import java.util.ArrayList;
import java.util.List;

public class ListRestoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, OnRecyclerItemClickListener {

    private List<LieuResto> mLieuResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recherche resto


        //Affichage liste
        mLieuResto = ListResto.getListRestoList();
        final ListView listView = (ListView) findViewById(R.id.my_list);
        final List<String> stringList = new ArrayList<>();
        for(int i = 0; i < mLieuResto.size(); i++){
            stringList.add(mLieuResto.get(i).getNomResto() + " : " + mLieuResto.get(i).getKmResto() + " Km");
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.list_item, R.id.resto, stringList);
        listView.setAdapter(adapter);


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
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View view, int position, boolean isLongClick) {

    }

    
}
