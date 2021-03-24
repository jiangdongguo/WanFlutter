package com.jiangdg.wanflutter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jiangdg.common.router.RouterCenter
import com.jiangdg.common.router.service.CameraService

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToCameraHome(view: View) {
        RouterCenter.getService(CameraService::class.java)?.toCameraHomeActivity(this)
    }
}
