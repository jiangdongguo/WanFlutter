package com.jiangdg.user

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.jiangdg.common.router.RouterPath
import com.jiangdg.common.router.service.UserService

/**
 * author: jiangdg
 * date: 2021/3/15 4:18 PM
 * description: user模块对外提供服务接口具体实现
 */
@Route(path = RouterPath.SERVICE_URL_USER)
class UserServiceImpl: UserService {
    override fun toFillUserProfileActivity(context: Context) {
        TODO("Not yet implemented")
    }

    override fun toLoginActivity(context: Context) {
        TODO("Not yet implemented")
    }

    override fun getUserName(): String {
        TODO("Not yet implemented")
    }

    override fun init(context: Context?) {

    }
}