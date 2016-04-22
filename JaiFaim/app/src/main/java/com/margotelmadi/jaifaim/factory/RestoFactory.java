package com.margotelmadi.jaifaim.factory;

import com.margotelmadi.jaifaim.R;
import com.margotelmadi.jaifaim.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by margotelmadi on 19/04/2016.
 */
public class RestoFactory {

    public static List<Restaurant> getRestoList(){
        List<Restaurant> listResto = new ArrayList<>();
        listResto.add(new Restaurant("Burger", R.mipmap.ic_burger));
        listResto.add(new Restaurant("Pizza", 0));
        listResto.add(new Restaurant("Kebab", 0));
        listResto.add(new Restaurant("Italien", 0));
        listResto.add(new Restaurant("Indien", 0));
        listResto.add(new Restaurant("Libanais", 0));
        listResto.add(new Restaurant("Chinois", 0));
        listResto.add(new Restaurant("Japonais", 0));
        listResto.add(new Restaurant("Taï", 0));
        listResto.add(new Restaurant("Oriental", 0));
        listResto.add(new Restaurant("Pâtes", 0));
        return listResto;
    }
}
