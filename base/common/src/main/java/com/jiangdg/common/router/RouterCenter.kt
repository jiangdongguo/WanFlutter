package com.jiangdg.common.router

import com.alibaba.android.arouter.launcher.ARouter

/**
 * author: jiangdg
 * date: 2021/3/18 3:49 PM
 * description:路由管理中心
 */
object RouterCenter {

    /**
     * 获取路由服务
     */
    fun <T> getService(serviceInterface: Class<T>): T? {
        return ARouter.getInstance().navigation(serviceInterface)
    }
}