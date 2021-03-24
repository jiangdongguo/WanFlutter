package com.jiangdg.common.router.service

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 * author: jiangdg
 * date: 2021/3/15 4:08 PM
 * description: camera模块(组件)对外Service接口
 */
interface CameraService: IProvider {
    fun toCameraHomeActivity(context: Context)
}