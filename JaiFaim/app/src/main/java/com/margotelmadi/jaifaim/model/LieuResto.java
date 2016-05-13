package com.margotelmadi.jaifaim.model;

import java.io.Serializable;

/**
 * Created by margotelmadi on 05/05/2016.
 */
public class LieuResto implements Serializable {

    private String mNomResto;
    private String mTypeResto;
    private double mLatitude;
    private double mLongitude;

    public LieuResto(String typeResto, String nomResto, double latitude, double longitude){
        this.mTypeResto = typeResto;
        this.mNomResto = nomResto;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
    }


    public String getTypeResto() {
        return mTypeResto;
    }

    public void setTypeResto(String typeResto) {
        mTypeResto = typeResto;
    }

    public String getNomResto() {
        return mNomResto;
    }

    public void setNomResto(String nomResto) {
        mNomResto = nomResto;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }
}
