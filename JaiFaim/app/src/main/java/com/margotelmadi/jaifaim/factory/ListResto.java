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
        listResto.add(new LieuResto("Burger", "Speed Burger", 50.6288, 3.0530));
        listResto.add(new LieuResto("Burger", "Buffalo Burger", 50.6369, 3.0657));
        listResto.add(new LieuResto("Pizza", "", , ));
        listResto.add(new LieuResto("Pizza", "", , ));
        listResto.add(new LieuResto("Kebab", "", , ));
        listResto.add(new LieuResto("Kebab", "", , ));
        return listResto;
    }
}
