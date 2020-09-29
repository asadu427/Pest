package com.example.pest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class totalin extends AppCompatActivity {
    String[] list = new String[]{"10000", "15000", "30000"};
    TextView ed,sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_totalin);

        getSupportActionBar().hide();
        ed = findViewById(R.id.number);
        sd = findViewById(R.id.sssss);

        int randomIndex = new Random().nextInt(list.length);
        String randomStr = list[randomIndex];
        ed.setText(randomStr);
        if(randomStr== "10000"){
            sd.setText("Spary\n200 mg - 300 mg");
        }
        if(randomStr== "30000"){
            sd.setText("Spary\n1000 mg");
        }
        if(randomStr== "15000"){
            sd.setText("Spary\n400 mg - 700 mg");
        }

    }
}