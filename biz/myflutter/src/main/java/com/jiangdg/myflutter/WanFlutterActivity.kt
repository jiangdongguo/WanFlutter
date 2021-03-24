package com.jiangdg.myflutter

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

/**
 * author: jiangdg
 * date: 2021/3/4 2:51 PM
 * description:
 */
class WanFlutterActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FlutterFactory.setFlutterActivity(this)
    }
}