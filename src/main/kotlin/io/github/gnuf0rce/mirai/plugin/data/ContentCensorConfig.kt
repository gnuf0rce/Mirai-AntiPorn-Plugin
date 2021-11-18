package io.github.gnuf0rce.mirai.plugin.data

import net.mamoe.mirai.console.data.*

object ContentCensorConfig : ReadOnlyPluginConfig("ContentCensor"), AipClientConfig, HandleConfig {
    @ValueName("app_id")
    @ValueDescription("百度AI客户端 APP_ID")
    override val appId: String by value("")

    @ValueName("api_key")
    @ValueDescription("百度AI客户端 API_KEY")
    override val apiKey: String by value("")

    @ValueName("secret_key")
    @ValueDescription("百度AI客户端 SECRET_KEY")
    override val secretKey: String by value("")

    @ValueName("connection_timeout_in_millis")
    @ValueDescription("百度AI客户端 连接超时 毫秒")
    override val connectionTimeoutInMillis: Int by value(3000)

    @ValueName("socket_timeout_in_millis")
    @ValueDescription("百度AI客户端 端口超时 毫秒")
    override val socketTimeoutInMillis: Int by value(3000)

    @ValueName("proxy")
    @ValueDescription("百度AI客户端 代理, 格式 http://127.0.0.1:8080 或 socket://127.0.0.1:1080")
    override val proxy: String by value("")

    @ValueName("mute")
    @ValueDescription("禁言时间，单位秒")
    override val mute: Int by value(60)

    @ValueName("plain")
    @ValueDescription("是否检查图片")
    override val plain: Boolean by value(true)

    @ValueName("image")
    @ValueDescription("是否检查图片")
    override val image: Boolean by value(true)

    @ValueName("audio")
    @ValueDescription("是否检查语音")
    override val audio: Boolean by value(false)
}