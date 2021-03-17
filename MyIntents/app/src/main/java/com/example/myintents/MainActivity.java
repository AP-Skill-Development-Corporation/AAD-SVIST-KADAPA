package com.example.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    et=findViewById(R.id.et_input);
    button1=findViewById(R.id.btn1);
    button2=findViewById(R.id.btn2);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String data=et.getText().toString();
        /*Explicit Intent Syntax*/
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("name",data);
            startActivity(i);
        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            String data=et.getText().toString();
        /*Implicit Intent*/

            Uri u=Uri.parse("https://www."+data+".in");
            Intent i=new Intent(Intent.ACTION_VIEW,u);
            startActivity(i);
        }
    });
    }
}