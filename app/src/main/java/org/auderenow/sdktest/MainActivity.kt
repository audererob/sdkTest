package org.auderenow.sdktest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.auderenow.sdktest.databinding.ActivityMainBinding
import org.auderenow.camerax.library.CaptureActivity

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.launchCameraButton.setOnClickListener {
            val myIntent = Intent(this, CaptureActivity::class.java)
            startActivity(myIntent)
        }

        viewBinding.showFragmentButton.setOnClickListener {
            val myIntent = Intent(this, CaptureFragmentActivity::class.java)
            startActivity(myIntent)
        }
    }
}
