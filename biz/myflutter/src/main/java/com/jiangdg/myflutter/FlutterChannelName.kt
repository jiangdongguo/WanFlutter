package com.jiangdg.myflutter

/**
 * author: jiangdg
 * date: 2021/3/4 2:26 PM
 * description: 原生与Flutter通信Channel(通道)名称
 *
 * 不同的数据交换，使用对应的Channel
 */
object FlutterChannelName {
    // 通用通道
    const val commonChannel = "com.jiangdg.wan/common"
    // 路由通道
    const val routerChannel = "com.jiangdg.wan/router"
    // 通知通道
    const val notificationChannel = "com.jiangdg.wan/notification"
}