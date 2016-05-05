package com.margotelmadi.jaifaim.factory;

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
        listResto.add(new LieuResto("Burger", "1,4Km"));
        listResto.add(new LieuResto("Pizza", "3,2Km"));
        return listResto;
    }
}
