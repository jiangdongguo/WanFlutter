package com.jiangdg.myflutter

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.jiangdg.common.router.RouterPath
import com.jiangdg.common.router.service.FlutterService

/**
 * author: jiangdg
 * date: 2021/3/18 4:53 PM
 * description:
 */
@Route(path = RouterPath.SERVICE_URL_FLUTTER)
class FlutterServiceImpl: FlutterService {
    override fun init(context: Context?) {
        TODO("Not yet implemented")
    }
}