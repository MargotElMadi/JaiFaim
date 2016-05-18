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
        listResto.add(new LieuResto("Burger", "Speed Burger", 50.6287687, 3.0530392));
        listResto.add(new LieuResto("Burger", "Buffalo Burger", 50.636969, 3.0657086));
        listResto.add(new LieuResto("Burger", "Taxi Burger", 50.6307738, 3.0556791));
        listResto.add(new LieuResto("Pizza", "L'Emilepates", 50.628327, 3.0605309));
        listResto.add(new LieuResto("Pizza", "Pizza-jazz", 50.6305144, 3.0508304));
        listResto.add(new LieuResto("Pizza", "Masséna Pizza", 50.633464, 3.0549603));
        listResto.add(new LieuResto("Kebab", "Kebab & Co", 50.6315199, 3.0540235));
        listResto.add(new LieuResto("Kebab", "Snack Tigo", 50.6316441, 3.0494705));
        listResto.add(new LieuResto("Kebab", "Kebab GUR", 50.6326087, 3.0625664));
        return listResto;
    }
}
