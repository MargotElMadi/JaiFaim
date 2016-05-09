package com.margotelmadi.jaifaim.factory;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.model.LieuResto;
import com.margotelmadi.jaifaim.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by margotelmadi on 05/05/2016.
 */
public class ListResto {

    public static List<LieuResto> getListRestoList(){
        List<LieuResto> listResto = new ArrayList<>();
        listResto.add(new LieuResto("Burger City", "1,4"));
        listResto.add(new LieuResto("Burger King", "3,2"));
        return listResto;
    }
}
