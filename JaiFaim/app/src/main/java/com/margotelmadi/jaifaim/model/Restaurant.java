package com.margotelmadi.jaifaim.model;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by margotelmadi on 19/04/2016.
 */
public class Restaurant implements Serializable {

    private String mNomResto;
    private int mImageResto;

    public Restaurant(String nomResto, int imageResto){
        this.mNomResto = nomResto;
        this.mImageResto = imageResto;
    }

    public String getNomResto() {
        return mNomResto;
    }

    public void setNomResto(String nomResto) {
        mNomResto = nomResto;
    }

    public int getImageResto() {
        return mImageResto;
    }

    public void setImageResto(int mimageResto) {
        this.mImageResto = mimageResto;
    }
}
