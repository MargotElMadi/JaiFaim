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

    private SensorManager mSensorManager;
    private Sensor mSensorAccelerometre;

    private final SensorEventListener mSensorEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            Sensor mySensor = event.sensor;

            if(mySensor.getType() ==  Sensor.TYPE_ACCELEROMETER){
                float x = event.values[0];
                float y = event.values[1];
                float z = event.values[2];
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recherche resto
        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mSensorAccelerometre = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


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

    @Override
    protected void onPause(){
        super.onPause();
        mSensorManager.unregisterListener(mSensorEventListener);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mSensorManager.registerListener(mSensorEventListener, mSensorAccelerometre, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void displayAllSensors(){
        List<Sensor> sensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getSensorListString(sensorList)).setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private String getSensorListString(List<Sensor> sensorList) {
        StringBuilder sensorListString = new StringBuilder();
        for (Sensor sensor : sensorList){
            sensorListString.append(sensor.getName()).append("\n");
            sensorListString.append(sensor.getVendor()).append("\n");
            sensorListString.append(sensor.getVersion()).append("\n");
        }
        return sensorListString.toString();
    }
}
