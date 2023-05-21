package com.example.talkhow;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class TalkHow extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this, "64778d7ee456fec12f58f12150a92a8a");
    }
}
