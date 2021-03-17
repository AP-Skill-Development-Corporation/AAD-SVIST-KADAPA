package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_label=findViewById(R.id.tv);
        tv_label.append("onCreate\n");
        Log.i("mainAcivity","onCreate()");
        Toast.makeText(this, "App is created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv_label.append("onStart\n");
        Log.i("mainAcivity","onStart()");
        Toast.makeText(this, "App is started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv_label.append("onResume()\n");
        Log.i("mainAcivity","onResume()");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv_label.append("onPause\n");
        Log.i("mainAcivity","onPauese()");
        Toast.makeText(this, "App is paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        tv_label.append("onStop()\n");
        Log.i("mainAcivity","onStop()");
        Toast.makeText(this, "App is Stopped", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv_label.append("onDestroy\n");
        Log.i("mainAcivity","onDestroy()");
        Toast.makeText(this, "App is destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv_label.append("onRestart()\n");
        Log.i("mainAcivity","onRestart()");
        Toast.makeText(this, "App is restarted", Toast.LENGTH_SHORT).show();
    }
}