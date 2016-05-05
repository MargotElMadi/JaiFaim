package com.margotelmadi.jaifaim.model;

import java.io.Serializable;

/**
 * Created by margotelmadi on 05/05/2016.
 */
public class LieuResto implements Serializable {

    private String mNomResto;
    private String mkmResto;

    public LieuResto(String nomResto, String kmResto){
        this.mNomResto = nomResto;
        this.mkmResto = kmResto;
    }

    public String getNomResto() {
        return mNomResto;
    }

    public void setNomResto(String nomResto) {
        mNomResto = nomResto;
    }

    public String getKmResto() {
        return mkmResto;
    }

    public void setKmResto(String mkmResto) {
        this.mkmResto = mkmResto;
    }
}
