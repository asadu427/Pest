package com.example.pest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class welcome extends AppCompatActivity {

    Button btnvall, btnupdate, btndelete, logout;
    EditText editName, editSurname, editMarks, editTextId;
    SqliteHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();

        myDb = new SqliteHelper(this);
        btnvall = findViewById(R.id.btn1);
        myDb = new SqliteHelper(this);
        editName = (EditText) findViewById(R.id.Na);
        editSurname = (EditText) findViewById(R.id.ema);
        editMarks = (EditText) findViewById(R.id.Passwor);
        editTextId = (EditText) findViewById(R.id.Id);
        btnupdate = (Button) findViewById(R.id.btnup);
        btndelete = (Button) findViewById(R.id.btndel);
        logout = (Button) findViewById(R.id.logout);
        viewAll();
        UpdateData();
        DeleteData();
        Log();
    }

    public void viewAll() {
        btnvall.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if (res.getCount() == 0) {
                            showMessage("Error", "Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("UserName :" + res.getString(1) + "\n");
                            buffer.append("Email :" + res.getString(2) + "\n");
                            buffer.append("Password :" + res.getString(3) + "\n\n");
                        }

                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void DeleteData() {
        btndelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                        if (deletedRows > 0)
                            Toast.makeText(welcome.this, "Data Deleted Successfully", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(welcome.this, "Enter Correct Information to Delete", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void UpdateData() {
        btnupdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(
                                editTextId.getText().toString(),
                                editName.getText().toString(),
                                editSurname.getText().toString(),
                                editMarks.getText().toString()
                        );
                        if (isUpdate)
                            Toast.makeText(welcome.this, "Data Update Successfully", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(welcome.this, "Enter Correct Information to Update", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    public void Log() {
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(welcome.this, Admin.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}


