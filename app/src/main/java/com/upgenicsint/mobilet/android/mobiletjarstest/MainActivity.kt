package com.upgenicsint.mobilet.android.mobiletjarstest

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.wifi.WifiManager
import android.widget.Button
import android.content.pm.PackageManager
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.ScanResult
import android.util.Log
import android.support.v4.app.ActivityCompat
class MainActivity : AppCompatActivity() {

    var PERMISSIONS_CODE = 1
    var PERMISSIONS = arrayOf(android.Manifest.permission.ACCESS_WIFI_STATE,
            android.Manifest.permission.CHANGE_WIFI_STATE,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION)

    lateinit var scanResult: MutableList<ScanResult>
    lateinit var wifiManager:WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        val enableButton = findViewById<Button>(R.id.button1)
        val disableButton = findViewById<Button>(R.id.button2)

        enableButton.setOnClickListener {
            TurnWIFI(true)
            scanNearbySSID()
        }

        disableButton.setOnClickListener {
            TurnWIFI(false)
        }

        if (hasPermissions(this, PERMISSIONS))
            Log.v("Permissions", "All permissions are granted")
        else{
            Log.v("Permissions", "Some permissions are not granted")
            ActivityCompat.requestPermissions(this as Activity, PERMISSIONS, PERMISSIONS_CODE)
        }

        if (isWIFIEnabled())
            Log.v("PermissionsState","isWIFIEnabled()" + isWIFIEnabled())
        else
            Log.v("PermissionsState","isWIFIEnabled()" + isWIFIEnabled())

    }

    private fun scanNearbySSID() {
        registerReceiver(wifiReceiver, IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
        wifiManager.startScan()
    }

    var wifiReceiver = object: BroadcastReceiver() {

        override fun onReceive(context: Context?, intent: Intent?) {
            unregisterReceiver(this)
            scanResult = wifiManager.scanResults

            for (result in scanResult){
                Log.v("PermissionResults", "SSID: ${result.SSID} strengthRSSI: ${result.level} calculateSignalLevel ${WifiManager.calculateSignalLevel(result.level, 100)}")
            }
        }
    }
    private fun hasPermissions(context: Context, permissions: Array<String>): Boolean {
        for (perm in permissions) {
            if (ActivityCompat.checkSelfPermission(context, perm) != PackageManager.PERMISSION_GRANTED){
                return false
            }
        }
        return true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (requestCode == PERMISSIONS_CODE) {
            for (i in 0..permissions.size - 1) {
                val permission = permissions[i]
                val grantResult = grantResults[i]

                if (permission in PERMISSIONS) {
                    if (grantResult == PackageManager.PERMISSION_GRANTED) {
                        Log.v("PermissionsGranted", permission)
                    } else{
                        Log.v("PermissionsNotGranted", permission)
                    }
                }
            }
        }
    }

    private fun isWIFIEnabled(): Boolean{
        return wifiManager.isWifiEnabled
    }

    private fun TurnWIFI(OnOrOff: Boolean){
        wifiManager.isWifiEnabled = OnOrOff
    }
}
