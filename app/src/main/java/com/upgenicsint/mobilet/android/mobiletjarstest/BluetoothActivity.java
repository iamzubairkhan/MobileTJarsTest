/*
package com.upgenicsint.mobilet.android.mobiletjarstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.upgenicsint.mobilet.android.mobiletbluetooth.BluetoothManager;
import com.upgenicsint.mobilet.android.mobiletbluetooth.NearByBTdevice;

import java.util.ArrayList;
import java.util.List;

public class BluetoothActivity extends AppCompatActivity {

    private Button on, off, isEnabled, list;
    BluetoothManager bluetoothManager;
    TextView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        bluetoothManager = new BluetoothManager(this);
        listView = findViewById(R.id.listView);

        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        isEnabled = findViewById(R.id.isEnabled);
        list = findViewById(R.id.list);

        isEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BluetoothActivity.this, bluetoothManager.isEnabled().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetoothManager.turn(true);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetoothManager.turn(false);
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetoothManager.scanNearbyBTdevices();
            }
        });
        bluetoothManager.setCallBack(new BluetoothManager.SimpleResponse<List<NearByBTdevice>>() {
            @Override
            public void onResponse(List<NearByBTdevice> nearByBTdevices) {
                for (NearByBTdevice nearByBTdevice: nearByBTdevices){
                    Log.v("BT", "Name: " + nearByBTdevice.getDeviceName() + "Signal: " + nearByBTdevice.getSignalStrength());
                }
            }
        });
    }
}
*/
