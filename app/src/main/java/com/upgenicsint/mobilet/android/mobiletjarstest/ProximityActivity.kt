/*
package com.upgenicsint.mobilet.android.mobiletjarstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.upgenicsint.mobilet.android.mobiletproximity.ProximityManager

class ProximityActivity : AppCompatActivity() {

    private var sensorManager: ProximityManager? = null
    private var status: TextView? = null
    private var start: Button? = null
    private var isAvailable: Button? = null
    private var stop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proximity)

        start = findViewById(R.id.start)
        isAvailable = findViewById(R.id.available)
        stop = findViewById(R.id.stop)
        status = findViewById(R.id.status)

        sensorManager = ProximityManager(this)

        start!!.setOnClickListener {
            if (sensorManager!!.isAvailable())
                sensorManager!!.startProximityUpdate()
            else
                Toast.makeText(this@ProximityActivity, "Proximity sensor not available!", Toast.LENGTH_SHORT).show()
        }

        isAvailable!!.setOnClickListener { Toast.makeText(this@ProximityActivity, "isAvailabale() = " + sensorManager!!.isAvailable(), Toast.LENGTH_SHORT).show() }

        stop!!.setOnClickListener { sensorManager!!.stopProximityUpdate() }


        sensorManager!!.callback = object : ProximityManager.ProximityStateChangedListener<ProximityManager.State> {
            override fun proximityStateChanged(response: ProximityManager.State) {
                if (response == ProximityManager.State.FAR)
                    status!!.text = "FAR"
                else if (response == ProximityManager.State.NEAR)
                    status!!.text = "NEAR"
            }
        }
    }
}
*/
