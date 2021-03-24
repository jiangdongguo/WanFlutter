package com.jiangdg.myflutter

import android.content.Context
import com.jiangdg.myflutter.channel.CommonChannel
import com.jiangdg.myflutter.channel.NotificationChannel
import com.jiangdg.myflutter.channel.RouterChannel
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

/**
 * author: jiangdg
 * date: 2021/3/4 2:32 PM
 * description: Flutter初始化、通道批量注册
 */
object FlutterFactory {

    private const val ENGINE_ID = "communication"
    private lateinit var mFlutterEngine: FlutterEngine

    private var mFlutterActivity: FlutterActivity? = null

    private val mChannelList = arrayListOf(
        CommonChannel(),
        RouterChannel(),
        NotificationChannel()
    )

    @Synchronized
    fun initFlutter(context: Context) {
        // 初始化Flutter引擎
        mFlutterEngine = FlutterEngine(context)
        mFlutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )
        FlutterEngineCache.getInstance().put(ENGINE_ID, mFlutterEngine)
        // 批量注册通道
        mChannelList.forEach { channel ->
            channel.setBinaryMessenger(mFlutterEngine.dartExecutor)
        }
    }

    fun setFlutterActivity(activity: FlutterActivity) {
        this.mFlutterActivity = activity
    }

    fun getFlutterActivity() = this.mFlutterActivity
}