package com.jiangdg.camera

import android.content.Context
import android.content.Intent
import com.alibaba.android.arouter.facade.annotation.Route
import com.jiangdg.common.router.RouterPath
import com.jiangdg.common.router.service.CameraService

/**
 * author: jiangdg
 * date: 2021/3/18 2:56 PM
 * description:
 */
@Route(path= RouterPath.SERVICE_URL_CAMERA)
class CameraServiceImpl: CameraService {

    override fun toCameraHomeActivity(context: Context) {
        context.startActivity(Intent(context, CameraActivity::class.java))
    }

    override fun init(context: Context?) {
    }
}