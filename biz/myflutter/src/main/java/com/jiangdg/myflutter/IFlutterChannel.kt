package com.jiangdg.myflutter

import io.flutter.plugin.common.BinaryMessenger

/**
 * author: jiangdg
 * date: 2021/3/4 2:34 PM
 * description: Channel抽象接口
 */
interface IFlutterChannel {
    fun setBinaryMessenger(binaryMessenger: BinaryMessenger)
}