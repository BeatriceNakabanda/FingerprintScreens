package com.example.fingureprinttest

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_capture_fingerprint.*


class CaptureFingerprint : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_capture_fingerprint)

        Handler().postDelayed({
            progressBar.visibility = View.GONE
            val builder =
                AlertDialog.Builder(this)
            builder.setMessage("Scan successful, fingerprint matches")

            builder.setCancelable(false)

            builder
                .setPositiveButton(
                    "OK"
                ) { dialog, which ->
                    finish()
                }

            // Create the Alert dialog
            val alertDialog: AlertDialog = builder.create()
            // Show the Alert Dialog box
            alertDialog.show()
        }, 3000)
    }
}


