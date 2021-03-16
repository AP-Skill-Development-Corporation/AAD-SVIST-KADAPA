package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;
int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv_id);
        if (savedInstanceState!=null&&savedInstanceState.containsKey("mykey")){
            c=savedInstanceState.getInt("mykey");
            tv.setText(String.valueOf(c));

        }
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast ", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        c++;
        tv.setText(String.valueOf(c));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        /*here data will store the form of KEY And VALUE Pair*/
        outState.putInt("mykey",c);
    }
}