package org.mgn.compeet.service;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

import org.mgn.compeet.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by peta on 8.2.15.
 */
public class OurLocationListener implements LocationListener{

    private TextView text;

    public OurLocationListener(TextView text){
        this.text = text;
    }

    @Override
    public void onLocationChanged(Location location) {
        double lat = location.getLatitude();
        double lng = location.getLongitude();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  dd-MM-yyyy");
        text.setText("The time is - " + sdf.format(new Date()));
        text.append("\n" + "Latitude      - " + lat);
        text.append("\n" + "Longitude  - " + lng);

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {
        text.setText("You are connected to GPS.");

    }

    @Override
    public void onProviderDisabled(String provider) {
        text.setText("You are disconnected from GPS.");
    }
}
