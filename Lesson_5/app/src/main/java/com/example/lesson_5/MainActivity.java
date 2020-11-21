package com.example.lesson_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();
        /*
        btn = new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
        */
    }

    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hourFormat = new SimpleDateFormat("hh:mm");
        String strHour = hourFormat.format(date);
        String strDate = dateFormat.format(date);
        btn.setText(strDate + " " + strHour);
    }
}