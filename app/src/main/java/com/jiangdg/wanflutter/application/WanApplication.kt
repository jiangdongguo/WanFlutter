package com.jiangdg.wanflutter.application

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * author: jiangdg
 * date: 2021/3/4 3:42 PM
 * description:
 */
class WanApplication: Application() {
    private val isDebug: Boolean = true

    override fun onCreate() {
        super.onCreate()

        // 初始化ARouter
        if (isDebug) {
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }
}