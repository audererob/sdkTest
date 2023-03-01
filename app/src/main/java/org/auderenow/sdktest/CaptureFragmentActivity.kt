package org.auderenow.sdktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class CaptureFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.addFragmentOnAttachListener { fragmentManager, fragment -> configureFragment(fragment) }
        setContentView(R.layout.activity_fragment)
    }

    private fun configureFragment(fragment: Fragment) {
        if (fragment.id == R.id.capture_fragment) {
            fragment.arguments = Bundle().apply {
                putString("rdtType", "Abbott PanBio")
                putFloat("rdtAspectRatio", 0.3f)
            }
        }
    }
}