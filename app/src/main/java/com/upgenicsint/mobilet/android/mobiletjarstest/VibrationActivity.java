package com.upgenicsint.mobilet.android.mobiletjarstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.upgenicsint.mobilet.android.mobiletvibration.VibrationManager;

public class VibrationActivity extends AppCompatActivity {

    VibrationManager vibrationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        Button check = findViewById(R.id.check_permission);
        Button vibrateBtn = findViewById(R.id.vibrate);

        vibrationManager = new VibrationManager(getApplicationContext());

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VibrationActivity.this, "" + vibrationManager.checkForPermission(), Toast.LENGTH_SHORT).show();
            }
        });

        vibrateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrationManager.deviceVibrate(3);
            }
        });
    }
}
