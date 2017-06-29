package com.adammcneilly.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

/**
 * Displays detailed information for a Brand.
 */
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Get View references
        val imageView = findViewById(R.id.my_image_view) as ImageView
        val button = findViewById(R.id.my_button) as Button

        // Get extras from intent
        val logoResource = intent.getIntExtra(BRAND_LOGO_KEY, R.drawable.apple)
        val name = intent.getStringExtra(BRAND_NAME_KEY)

        // Set values
        imageView.setImageResource(logoResource)
        button.text = name
    }

    companion object {
        /**
         * A string key for the brand logo to be passed from one activity to another.
         */
        val BRAND_LOGO_KEY = "brandLogo"

        /**
         * A string key for the brand name to be passed from one activity to another.
         */
        val BRAND_NAME_KEY = "brandName"
    }
}