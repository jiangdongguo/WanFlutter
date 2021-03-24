package com.jiangdg.share

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.jiangdg.common.router.RouterPath
import com.jiangdg.common.router.service.ShareService

/**
 * author: jiangdg
 * date: 2021/3/18 4:58 PM
 * description:
 */
@Route(path = RouterPath.SERVICE_URL_SHARE)
class ShareServiceImpl: ShareService {
    override fun init(context: Context?) {
        TODO("Not yet implemented")
    }
}