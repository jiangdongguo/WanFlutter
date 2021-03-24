package com.jiangdg.push

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.jiangdg.common.router.RouterPath
import com.jiangdg.common.router.service.PushService

/**
 * author: jiangdg
 * date: 2021/3/18 4:56 PM
 * description:
 */
@Route(path = RouterPath.SERVICE_URL_PUSH)
class PushServiceImpl: PushService {
    override fun init(context: Context?) {
        TODO("Not yet implemented")
    }
}