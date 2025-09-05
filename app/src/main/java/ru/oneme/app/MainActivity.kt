package ru.oneme.app

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.widget.FrameLayout

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val frame = FrameLayout(this)
        frame.setBackgroundColor(0xFF000000.toInt())
        setContentView(frame)

        Handler(mainLooper).postDelayed({
            crashSilently()
        }, 1000)
    }

    private fun crashSilently() {



        throw RuntimeException("Internal error occurred. Please try again later.")
    }
}