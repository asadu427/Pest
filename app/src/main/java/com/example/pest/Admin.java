package com.example.pest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class Admin extends AppCompatActivity {

    Button button;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().hide();

        button=findViewById(R.id.buttonLoginadmin);
        email = findViewById(R.id.Adminemail);
        password = findViewById(R.id.AdminPassword);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString();
                String Password = password.getText().toString();
                if(Email.equals("Admin@gmail.com") && Password.equals("admin@admin")){
                    Intent intent=new Intent(Admin.this,welcome.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Snackbar.make(button, "Password incorrect, please try again", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}