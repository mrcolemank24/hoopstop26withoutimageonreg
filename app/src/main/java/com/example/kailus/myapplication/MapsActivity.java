package com.example.kailus.myapplication;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final LatLng RoxburyCourts = new LatLng(34.062165,-118.4895525);
    private static final LatLng Hitch = new LatLng(34.0608483,-118.4978718);
    private static final LatLng Barrington = new LatLng(34.0608483,-118.4978718);
    private static final LatLng CollinsCourt = new LatLng(34.062165,-118.4895525);
    private static final LatLng Venice = new LatLng(34.0046897,-118.4896296);


    private Marker mRoxburyCourts;
    private Marker mHitch;
    private Marker mBarrington;
    private Marker mCollinsCourt;
    private Marker mVenice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng latLng = new LatLng(34.0274037,-118.49238749);
        mMap.addMarker(new MarkerOptions().position(latLng).title("Ocean View Park")
        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mBarrington = mMap.addMarker(new MarkerOptions()
        .position(Barrington)
        .title("Barrington"));
        mBarrington.setTag(0);

        mHitch = mMap.addMarker(new MarkerOptions()
        .position(Hitch)
        .title("Hitch")
         .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mHitch.setTag(0);

        mRoxburyCourts = mMap.addMarker(new MarkerOptions()
                .position(RoxburyCourts)
                .title("RoxburyCourts")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mHitch.setTag(0);

        mCollinsCourt = mMap.addMarker(new MarkerOptions()
                .position(CollinsCourt)
                .title("CollinsCourt")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mHitch.setTag(0);

        mVenice = mMap.addMarker(new MarkerOptions()
                .position(Venice)
                .title("Venice")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mHitch.setTag(0);

        ///// zoom animation/////
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12), 5000, null);
    }
}
