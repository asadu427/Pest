package com.example.pest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Random;

import static android.content.DialogInterface.*;

public class Leafss extends AppCompatActivity {
    String[] list = new String[]{"2000", "4000", "6000"};
    VideoView vid;
    Button b1,bt2,bt3,bt4,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_leafss);
        getSupportActionBar().hide();
        vid = (VideoView)findViewById(R.id.videoView);
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        b1 = findViewById(R.id.search);
        bt2 = findViewById(R.id.med4);
        bt3 = findViewById(R.id.med3);
        bt4 = findViewById(R.id.med2);
        bt5 = findViewById(R.id.med1);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);
        vid.setVideoURI(uri);
        vid.start();vid.start();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomIndex = new Random().nextInt(list.length);
                String randomStr = list[randomIndex];
                if(randomStr== "2000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Spray not Needed");
                    alert.setMessage("Wheat\nNumber of Leafs 2000\n2 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "4000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("chlorphyrifos methyl Spray Needed ");
                    alert.setMessage("Wheat\nNumber of Leafs 4000\n15 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "6000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("chlorphyrifos methyl Spray Needed ");
                    alert.setMessage("Wheat\n Number of Leafs 6000\n20 Insects on a leaf");
                    alert.show();

                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomIndex = new Random().nextInt(list.length);
                String randomStr = list[randomIndex];
                if(randomStr== "2000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Spray not Needed");
                    alert.setMessage("Sugarcane\nNumber of Leafs 2000\n5 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "4000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Chlorpyrifos Spray Needed ");
                    alert.setMessage("Sugarcane\nNumber of Leafs 4000\n15 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "6000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Chlorpyrifos Spray Needed ");
                    alert.setMessage("Sugarcane\n Number of Leafs 6000\n20 Insects on a leaf");
                    alert.show();

                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randomIndex = new Random().nextInt(list.length);
                String randomStr = list[randomIndex];
                if(randomStr== "2000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Spray not Needed");
                    alert.setMessage("Rice\nNumber of Leafs 2000\n6 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "4000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Chlorfenvinphos Spray Needed ");
                    alert.setMessage("Rice\nNumber of Leafs 4000\n18 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "6000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Chlorfenvinphos Spray Needed ");
                    alert.setMessage("Rice\n Number of Leafs 6000\n22 Insects on a leaf");
                    alert.show();

                }
            }
        });bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomIndex = new Random().nextInt(list.length);
                String randomStr = list[randomIndex];
                if(randomStr== "2000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Spray not Needed");
                    alert.setMessage("Potatto\nNumber of Leafs 2000\n6 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "4000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Maize Spray Needed ");
                    alert.setMessage("Potatto\nNumber of Leafs 4000\n16 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "6000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Maize Spray Needed ");
                    alert.setMessage("Potatto\n Number of Leafs 6000\n27 Insects on a leaf");
                    alert.show();

                }
                }


        });bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomIndex = new Random().nextInt(list.length);
                String randomStr = list[randomIndex];
                if(randomStr== "2000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Spray not Needed");
                    alert.setMessage("Cotton\nNumber of Leafs 2000\n2 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "4000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Acephate Spray Needed ");
                    alert.setMessage("Cotton\nNumber of Leafs 4000\n15 Insects on a leaf");
                    alert.show();

                }
                if(randomStr== "6000"){

                    AlertDialog alert = new AlertDialog.Builder(Leafss.this).create();
                    alert.setTitle("Acephate or maize Spray Needed ");
                    alert.setMessage("Cotton\n Number of Leafs 6000\n20 Insects on a leaf");
                    alert.show();

                }

            }
        });

    }

}

