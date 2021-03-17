package com.example.userregistration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
SeekBar seek;
RatingBar ratingBar;
TextView result;
Spinner sp;
RadioButton r1,r2;
String gender="";
int date,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    seek=findViewById(R.id.sb);
    ratingBar=findViewById(R.id.rb);
    result=findViewById(R.id.tv_rating);
    sp=findViewById(R.id.spin);
    r1=findViewById(R.id.male);
    r2=findViewById(R.id.female);
    seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           result.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
   ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
       @Override
       public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
           result.setText(String.valueOf(rating));
       }
   });
    }

    public void showAlert(View view) {
        String selectedbranch=sp.getSelectedItem().toString();
        result.setText(selectedbranch);
        if (r1.isChecked()){
            result.setText("male");
        }
        else{
            result.setText("Female");
        }
        /*for alert dialog
        * title
        * text/msg
        * positive button
        * Icon
        * negetive button..etc*/
       /* AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert..!");
        builder.setMessage("do you want close the app..!");
        builder.setIcon(R.drawable.ic_baseline_warning_24);
        builder.setCancelable(false);
        builder.setPositiveButton("okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();*/
    }

    public void showTime(View view) {
    }

    public void showDate(View view) {
        Calendar c=Calendar.getInstance();
        date=c.get(Calendar.DATE);
        month=c.get(Calendar.MONTH);
        year=c.get(Calendar.YEAR);
        DatePickerDialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String a=year+"-"+(month+1)+"-"+dayOfMonth;
               result.setText(a);
                // result.setText(String.valueOf(month,dayOfMonth));
            }
        },year,month,date);
        dialog.show();
    }
}