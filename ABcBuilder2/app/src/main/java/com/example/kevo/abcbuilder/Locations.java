package com.example.kevo.abcbuilder;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Locations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng car1 = new LatLng(-1.312004, 36.758324);
        mMap.addMarker(new MarkerOptions().position(car1).title("Car One"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(car1));

        LatLng car2 = new LatLng(-0.529608, 35.249297);
        mMap.addMarker(new MarkerOptions().position(car2).title("Car Two"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(car2));

        LatLng car3 = new LatLng(-0.152860, 34.825582);
        mMap.addMarker(new MarkerOptions().position(car3).title("Car Three"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(car3));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(car1,12.0f));
    }

}
