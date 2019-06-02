package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Apt_Topics extends AppCompatActivity {
ImageButton b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apt__topics);
        b30=(ImageButton)findViewById(R.id.imageButton2);
        b30.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,nqn1.class);
                startActivity(i);
            }
        }));

        b31=(ImageButton)findViewById(R.id.imageButton3);
        b31.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, scqn1.class);
                startActivity(i);
            }
        }));
        b32=(ImageButton)findViewById(R.id.imageButton4);
        b32.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,avqn1.class);
                startActivity(i);
            }
        }));

        b33=(ImageButton)findViewById(R.id.imageButton5);
        b33.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, agqn1.class);
                startActivity(i);
            }
        }));
        b34=(ImageButton)findViewById(R.id.imageButton8);
        b34.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,pqn1.class);
                startActivity(i);
            }
        }));

        b35=(ImageButton)findViewById(R.id.imageButton9);
        b35.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, plqn1.class);
                startActivity(i);
            }
        }));
        b36=(ImageButton)findViewById(R.id.imageButton10);
        b36.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,twqn1.class);
                startActivity(i);
            }
        }));

        b37=(ImageButton)findViewById(R.id.imageButton11);
        b37.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, tdqn1.class);
                startActivity(i);
            }
        }));
        b38=(ImageButton)findViewById(R.id.imageButton12);
        b38.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Apt_Topics.this,tqn1.class);
                startActivity(i);
            }
        }));

        b39=(ImageButton)findViewById(R.id.imageButton13);
        b39.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, bsqn1.class);
                startActivity(i);
            }
        }));
        b40=(ImageButton)findViewById(R.id.imageButton14);
        b40.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,siciqn1.class);
                startActivity(i);
            }
        }));

        b41=(ImageButton)findViewById(R.id.imageButton15);
        b41.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, pbqn1.class);
                startActivity(i);
            }
        }));
        b42=(ImageButton)findViewById(R.id.imageButton16);
        b42.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Apt_Topics.this,rpqn1.class);
                startActivity(i);
            }
        }));

        b43=(ImageButton)findViewById(R.id.imageButton17);
        b43.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, calqn1.class);
                startActivity(i);
            }
        }));
        b44=(ImageButton)findViewById(R.id.imageButton18);
        b44.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Apt_Topics.this, cloqn1.class);
                startActivity(i);
            }
        }));
    }
}
