package com.example.form;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class service extends Service {
    public IBinder onBind(Intent intent){
        return null;
    }
    public void onCreate(){
        super.onCreate();
        Log.e("home", "được khởi tạo");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.e("home","đã được hủy");
    }
}
