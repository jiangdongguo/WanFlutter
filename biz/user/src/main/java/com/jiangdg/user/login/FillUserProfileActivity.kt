package com.jiangdg.user.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.jiangdg.common.router.service.UserService


/**
 * author: jiangdg
 * date: 2021/3/15 4:20 PM
 * description:
 */
class FillUserProfileActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userService: UserService = ARouter.getInstance().navigation(UserService::class.java)
    }
}