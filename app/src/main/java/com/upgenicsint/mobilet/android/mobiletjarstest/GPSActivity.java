/*
package com.upgenicsint.mobilet.android.mobiletjarstest;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.upgenicsint.mobilet.android.mobiletgps.GPSManager;

public class GPSActivity extends AppCompatActivity {

    private Button on, off, isEnabled, latlng;
    GPSManager gpsManager;
    TextView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        gpsManager = new GPSManager(getApplicationContext());
        listView = findViewById(R.id.listView);

        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        isEnabled = findViewById(R.id.isEnabled);
        latlng = findViewById(R.id.latlng);

        isEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GPSActivity.this, "" + gpsManager.isEnabled(), Toast.LENGTH_SHORT).show();
            }
        });

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gpsManager.turn(true);
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gpsManager.turn(false);
            }
        });

        latlng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gpsManager.requestCurrentLocation();
            }
        });

        gpsManager.setCallBack(new GPSManager.SimpleResponse<Location>() {
            @Override
            public void onResponse(Location response) {
                String msg = "Current Location: (" + response.getLatitude() + "," + response.getLongitude() + ")";
                Toast.makeText(GPSActivity.this, msg, Toast.LENGTH_SHORT).show();
                Log.v("GPSActivity", msg);
            }
        });
    }
}
*/
