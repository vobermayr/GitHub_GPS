package com.example.vanessaobermayr.github_gps;

import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static LocationManager locman = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locman =(LocationManager) getSystemService(LOCATION_SERVICE);

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        //locman.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,0,this);
        //von Simon

        //VANESSA OBERMAYR


    }
}
