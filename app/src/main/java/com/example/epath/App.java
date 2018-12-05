package com.example.epath;

import android.app.Application;

import com.shitu.epathmap.EpathMapSDK;

public class App extends Application {

    private static final String  EPATH_MAP_APP_KEY = "BXSxcuGq9c";

    @Override
    public void onCreate() {
        super.onCreate();
//        使用默认配置信息初始化SDK
        EpathMapSDK.init(this, EPATH_MAP_APP_KEY);
//        或者定制配置信息 ,使用微信分享功能请实现相关的接口
//        EpathMapSDK.init(new EpathMapSDK.Configuration.Builder(this)
//                .appKey(EPATH_MAP_APP_KEY)
//                .shareToWechatListener(this)
//                //正式版请关闭 默认是关闭的
//                .debug(false)
//                .build());
    }
}
