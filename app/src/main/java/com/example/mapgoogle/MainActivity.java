package com.example.mapgoogle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng punelocation = new LatLng(18.520430, 73.856743);
        mMap.addMarker(new MarkerOptions().position(punelocation).title("Pune"));


        LatLng mumbai = new LatLng(19.075983, 72.877655);
        mMap.addMarker(new MarkerOptions().position(mumbai).title("mumbai"));

        LatLng nashik = new LatLng(19.997454, 73.789803);
        mMap.addMarker(new MarkerOptions().position(nashik).title("nashik"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(nashik));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mumbai));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(nashik));

    }
}
