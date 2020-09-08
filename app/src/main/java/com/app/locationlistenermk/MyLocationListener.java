package com.app.locationlistenermk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

public class MyLocationListener implements LocationListener {
    Context context;

    MyLocationListener(Context context){
        this.context = context;
    }

    @Override
    public void onLocationChanged(Location location) {
        Toast.makeText(context, (location.getLongitude()) + ", "
                + (location.getLatitude()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Toast.makeText(context, "Provider status changed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderDisabled(String provider) {
        Toast.makeText(context, "Gps turned off . you cannot follow your location", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderEnabled(String provider) {
        Toast.makeText(context, "Gps turned on . you can follow ur location", Toast.LENGTH_LONG).show();
    }
}