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
        listResto.add(new Restaurant("Pizza", R.mipmap.ic_pizza));
        listResto.add(new Restaurant("Kebab", R.mipmap.ic_kebab));
        /*listResto.add(new Restaurant("Italien", R.mipmap.ic_italien));
        listResto.add(new Restaurant("Indien", R.mipmap.ic_indien));
        listResto.add(new Restaurant("Chinois", R.mipmap.ic_chinois));
        listResto.add(new Restaurant("Japonais", R.mipmap.ic_japonais));
        listResto.add(new Restaurant("Thaï", R.mipmap.ic_thai));
        listResto.add(new Restaurant("Oriental", R.mipmap.ic_oriental));
        listResto.add(new Restaurant("Pâtes", R.mipmap.ic_pates));*/
        return listResto;
    }
}
