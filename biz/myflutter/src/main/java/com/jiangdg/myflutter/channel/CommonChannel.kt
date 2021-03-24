package com.jiangdg.myflutter.channel

import com.jiangdg.myflutter.FlutterChannelName
import com.jiangdg.myflutter.IFlutterChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodChannel
import io.reactivex.rxjava3.core.Single

/**
 * author: jiangdg
 * date: 2021/3/4 2:43 PM
 * description: 通用通道
 */
class CommonChannel: IFlutterChannel {
    private lateinit var mCommonChannel: MethodChannel

    override fun setBinaryMessenger(binaryMessenger: BinaryMessenger) {
        mCommonChannel = MethodChannel(binaryMessenger, FlutterChannelName.commonChannel)

        // Flutter调用原生回调
        // call： Flutter调用原生传递过来的信息（方法名method，参数argus）
        // result：原生通过它返回调用结果给Flutter
        mCommonChannel.setMethodCallHandler { call, result ->
            when(call.method) {
                NATIVE_FUNC_VERSION_CODE-> {
                    versionCode(result)
                }
            }
        }
    }

    /**
     * 打开Flutter相册页面
     * 返回选择的图片列表
     */
    fun openAlbum(category: String): Single<List<*>?> {
        return Single.create {
            mCommonChannel.invokeMethod(
                FLUTTER_FUNC_OPEN_ALBUM,
                category,
                object : MethodChannel.Result {
                    override fun notImplemented() {
                        it.onSuccess(null)
                    }

                    override fun error(errorCode: String?, errorMessage: String?, errorDetails: Any?) {
                        it.onSuccess(null)
                    }

                    override fun success(result: Any?) {
                        it.onSuccess(result as List<*>)
                    }
                })
        }
    }

    /**
     * Flutter从原生获取版本号码
     */
    private fun versionCode(result: MethodChannel.Result) {
        result.success("2021")
    }

    companion object {
        // Flutter调用原生的方法名
        const val NATIVE_FUNC_VERSION_CODE = "versionCode"
        const val NATIVE_FUNC_SHOW_TOAST = "showToast"

        // 原生调用Flutter的方法名
        const val FLUTTER_FUNC_OPEN_ALBUM = "openAlbum"
    }
}