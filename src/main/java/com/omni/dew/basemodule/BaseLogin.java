package com.omni.dew.basemodule;

import android.app.Activity;
import android.content.Intent;

public interface BaseLogin {
    void init(Activity activity, LoginResponse loginResponse);
    int login();
    void onResponse(Intent data);
    boolean isLogin();
}
