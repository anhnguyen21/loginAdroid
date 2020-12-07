package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button textBt=(Button)findViewById(R.id.btclick);
        textBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, homepage.class);
                startActivity(intent);
            }
        });
//        Intent serviceIntent=new Intent(this, service.class);
//        serviceIntent.putExtra("key","value");
//        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
//        startService(intent);
    }
}