package com.example.your_app_name;

import android.content.Context;
import androidx.multidex.MultiDex;
import io.flutter.app.FlutterApplication;

public class FlutterMultiDexApplication extends FlutterApplication {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
