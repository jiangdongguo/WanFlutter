# 项目开发规范 & 架构学习

## 1. 组件化开发

- 第一步：新增module library，配置settings.gradle，示例：

```shell
// camera module位于./biz目录下
include ':camera'
project(':camera').projectDir = new File("biz/camera")
```
&emsp;同时，需要在app module中依赖该module：

```shell
dependencies {
    runtimeOnly project(':camera')
}
```

- 第二步：配置新增module的build.gradle，引入路由基础库，示例：

```shell
apply plugin: 'kotlin-kapt'

android {
    ...
    // ARouter need
    kapt {
        arguments {
            arg("AROUTER_MODULE_NAME", project.getName())
        }
    }
}

dependencies {
    ...
    // 依赖router lib
    // 由于需要ARouter的注解，因此需要依赖其对应的注解处理器
    implementation project(':routerlib')
    kapt 'com.alibaba:arouter-compiler:1.5.1'
}
```

- 第三步：在routerlib中新增接口，用于其他组件通过它与新增module通信，示例：

```kotlin
interface CameraService: IProvider {
    fun toCameraHomeActivity(context: Context)
}
```

&emsp;然后，在新增module中创建其实现类，并使用@Route指定服务path，示例：

```kotlin
@Route(path= RouterPath.SERVICE_URL_CAMERA)
class CameraServiceImpl: CameraService {

    override fun toCameraHomeActivity(context: Context) {
        context.startActivity(Intent(context, CameraActivity::class.java))
    }

    override fun init(context: Context?) {
    }
}
```

- 最后，其他组件调用RouterCenter.getService()获取服务的示例，完成通信。

```kotlin
RouterCenter.getService(CameraService::class.java)?.toCameraHomeActivity(this)
```