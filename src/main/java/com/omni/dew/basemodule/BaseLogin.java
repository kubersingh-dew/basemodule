package com.omni.dew.basemodule;

import android.content.Intent;

public interface BaseLogin {
    int login();
    void onResponse(Intent data);
    boolean isLogin();
}
