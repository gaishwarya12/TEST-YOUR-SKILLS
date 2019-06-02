package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LangTopics extends AppCompatActivity {
ImageButton b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_topics);
        b3=(ImageButton)findViewById(R.id.imageButton);
        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LangTopics.this,C.class);
                startActivity(i);
            }
        }));

        b4=(ImageButton)findViewById(R.id.imageButton6);
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LangTopics.this, CPlus.class);
                startActivity(i);
            }
        }));
        b5=(ImageButton)findViewById(R.id.imageButton7);
        b5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LangTopics.this, Java.class);
                startActivity(i);
            }
        }));
    }
}
