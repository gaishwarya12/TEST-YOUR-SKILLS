package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectCategory extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);
        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SelectCategory.this,Apt_Topics.class);
                startActivity(i);
            }
        }));

                b2=(Button)findViewById(R.id.button3);
                b2.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(SelectCategory.this, LangTopics.class);
                        startActivity(i);
                    }
                }));
            }
        }


