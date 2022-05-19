package com.watonlight.console

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.watonlight.aliyunpush.OssUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_test).setOnClickListener(View.OnClickListener {
            Toast.makeText(this, OssUtil.getSecretKey(), Toast.LENGTH_SHORT).show()
        })
    }
}