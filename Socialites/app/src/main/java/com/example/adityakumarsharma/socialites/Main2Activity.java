package com.example.adityakumarsharma.socialites;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;


public class Main2Activity extends AppCompatActivity {

    String arrayName[] = {"Gmail", "Facebook", "Google", "Twitter", "Youtube", "Instagram", "Yahoo","whatscan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        CircleMenu cm = (CircleMenu) findViewById(R.id.circle_menu);
        CircleMenu cm1 = cm.setMainMenu(Color.parseColor("#cdcdcd"), R.drawable.b2, R.drawable.h7)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.gmail)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.face)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.google)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.twit)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.you)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.git)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.linkedin)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.yah)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {

                        if(i==0)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Gmail", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,mail.class);
                            startActivity(ip);
                        }
                        else if(i==1)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Facebook", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,facebook.class);
                            startActivity(ip);
                        }
                        else if(i==2)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Google", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,messenger.class);
                            startActivity(ip);
                        }
                        else if(i==3)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Twitter", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,twitter.class);
                            startActivity(ip);
                        }
                        else if(i==4)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Youtube", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,youtube.class);
                            startActivity(ip);
                        }
                        else if(i==5)
                        {
                            Toast.makeText(getApplicationContext(), "Opening GitHub", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,github.class);
                            startActivity(ip);
                        }
                        else if(i==6)
                        {
                            Toast.makeText(getApplicationContext(), "Opening LinkedIn", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,linkedin.class);
                            startActivity(ip);
                        }
                        else if(i==7)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Yahoo", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,yahoo.class);
                            startActivity(ip);
                        }
                     /*   else if(i==8)
                        {
                            Toast.makeText(getApplicationContext(), "Opening Messenger", Toast.LENGTH_SHORT).show();
                            Intent ip = new Intent(Main2Activity.this,mess.class);
                            startActivity(ip);
                        }*/


                    }
                });
    }}
