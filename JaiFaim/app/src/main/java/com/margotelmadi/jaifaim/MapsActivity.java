package com.margotelmadi.jaifaim;

import android.*;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.margotelmadi.jaifaim.factory.ListResto;
import com.margotelmadi.jaifaim.factory.RestoFactory;
import com.margotelmadi.jaifaim.service.LocationService;

import java.text.DateFormat;
import java.util.Date;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSIONS_REQUEST_LOCATION = 1;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private Location mCurrentLocation;
    private String mLastUpdateTime;
    private String mTypeResto;

    private static LocationService sLocationService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        int position = Integer.parseInt(getIntent().getExtras().getString("positionClick"));
        mTypeResto = getTypeRestoClick(position);

        sLocationService = new LocationService(getApplicationContext());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
        Location location = sLocationService.getLocation();
        LatLng myLocation = new LatLng(location.getLatitude(), location.getLongitude());
        map.addMarker(new MarkerOptions().position(myLocation).title("VOUS ETES ICI"));

        for(int i = 0; i < ListResto.getListRestoList().size(); i++){
            if(ListResto.getListRestoList().get(i).getTypeResto() == mTypeResto){
                LatLng latLng = new LatLng(ListResto.getListRestoList().get(i).getLatitude(), ListResto.getListRestoList().get(i).getLongitude());
                map.addMarker(new MarkerOptions()
                        .position(latLng)
                        .title(ListResto.getListRestoList().get(i).getNomResto())
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            }
        }

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 13));
    }


    public String getTypeRestoClick( int position){
        String type = "";
        for(int i = 0; i < RestoFactory.getRestoList().size(); i ++){
            if(i == position){
                type = RestoFactory.getRestoList().get(i).getNomResto();
            }
        }
        return type;
    }
}