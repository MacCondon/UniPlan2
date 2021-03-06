package com.example.uniplan2;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import java.util.Calendar;
import java.text.NumberFormat;


public class AddClass extends AppCompatActivity implements View.OnClickListener{

    EditText fromTimePicker1, toTimePicker1, fromTimePicker2, toTimePicker2, fromTimePicker3, toTimePicker3, fromTimePicker4, toTimePicker4, fromTimePicker5, toTimePicker5;
    private int mHour, mMinute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        fromTimePicker1 = (EditText) findViewById(R.id.fromTimeEdit1);
        toTimePicker1 = (EditText) findViewById(R.id.toTimeEdit1);
        fromTimePicker2 = (EditText) findViewById(R.id.fromTimeEdit2);
        toTimePicker2 = (EditText) findViewById(R.id.toTimeEdit2);
        fromTimePicker3 = (EditText) findViewById(R.id.fromTimeEdit3);
        toTimePicker3 = (EditText) findViewById(R.id.toTimeEdit3);
        fromTimePicker4 = (EditText) findViewById(R.id.fromTimeEdit4);
        toTimePicker4 = (EditText) findViewById(R.id.toTimeEdit4);
        fromTimePicker5 = (EditText) findViewById(R.id.fromTimeEdit5);
        toTimePicker5 = (EditText) findViewById(R.id.toTimeEdit5);
        NumberFormat nf = NumberFormat.getInstance();

        Spinner daySpinner1 = (Spinner) findViewById(R.id.classDay1Spinner);
        Spinner daySpinner2 = (Spinner) findViewById(R.id.classDay2Spinner);
        Spinner daySpinner3 = (Spinner) findViewById(R.id.classDay3Spinner);
        Spinner daySpinner4 = (Spinner) findViewById(R.id.classDay4Spinner);
        Spinner daySpinner5 = (Spinner) findViewById(R.id.classDay5Spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dayOfWeek, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daySpinner1.setAdapter(adapter);
        daySpinner2.setAdapter(adapter);
        daySpinner3.setAdapter(adapter);
        daySpinner4.setAdapter(adapter);
        daySpinner5.setAdapter(adapter);


        fromTimePicker1.setOnClickListener(this);
        toTimePicker1.setOnClickListener(this);
        fromTimePicker2.setOnClickListener(this);
        toTimePicker2.setOnClickListener(this);
        fromTimePicker3.setOnClickListener(this);
        toTimePicker3.setOnClickListener(this);
        fromTimePicker4.setOnClickListener(this);
        toTimePicker4.setOnClickListener(this);
        fromTimePicker5.setOnClickListener(this);
        toTimePicker5.setOnClickListener(this);

        FloatingActionButton addClassDoneButton = findViewById(R.id.addClassDoneButton);
        addClassDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainActivity.class );
                startActivity(i);
            }
        });

    }

    @Override
    public void onClick(View v) {

        if(v == fromTimePicker1){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    fromTimePicker1.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == toTimePicker1){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    toTimePicker1.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == fromTimePicker2){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    fromTimePicker2.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == toTimePicker2){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    toTimePicker2.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == fromTimePicker3){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    fromTimePicker3.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == toTimePicker3){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    toTimePicker3.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == fromTimePicker4){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    fromTimePicker4.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == toTimePicker4){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    toTimePicker4.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == fromTimePicker5){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    fromTimePicker5.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

        if(v == toTimePicker5){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String AM_PM ;
                    if(hourOfDay < 12) {
                        AM_PM = "AM";
                    } else {
                        hourOfDay = hourOfDay-12;
                        AM_PM = "PM";
                    }
                    toTimePicker5.setText(String.format("%01d:%02d", hourOfDay, minute) + AM_PM);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }

    }
}
