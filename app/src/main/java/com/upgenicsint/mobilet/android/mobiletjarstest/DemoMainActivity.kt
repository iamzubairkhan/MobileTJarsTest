/*
package com.upgenicsint.mobilet.android.mobiletjarstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.upgenicsint.mobilet.android.mobiletwifi.NearByWifi
import com.upgenicsint.mobilet.android.mobiletwifi.WiFiManager

class DemoMainActivity : AppCompatActivity() {

    lateinit var wiFiManager: WiFiManager
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_main)

        wiFiManager = WiFiManager(applicationContext)
        listView = findViewById(R.id.list_view)

        var enablebtn = findViewById<Button>(R.id.button1)
        var disablebtn = findViewById<Button>(R.id.button2)
        var listNearbyBtn = findViewById<Button>(R.id.button3)

        enablebtn.setOnClickListener { wiFiManager.TurnWIFI(true) }
        disablebtn.setOnClickListener { wiFiManager.TurnWIFI(false) }

        listNearbyBtn.setOnClickListener {
            val nearByWifiList = wiFiManager.ListNearbySSID()

            for (nearbySSID in nearByWifiList) {
                Log.v("SSID", "SSID: ${nearbySSID.SSID} SignalStrength: ${nearbySSID.signalStrength}")
            }
//            val arrayAdapter:ArrayAdapter<NearByWifi> = ArrayAdapter(this, R.layout.nearby_wifi_layout, nearByWifiList)
//            listView.adapter = arrayAdapter
        }
    }
}
*/
