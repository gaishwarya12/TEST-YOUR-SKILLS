package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class jqn3 extends AppCompatActivity {
Button b25,b26;
    RadioGroup rg13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jqn3);
        b25=(Button)findViewById(R.id.button22);
        b25.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(jqn3.this,jqn2.class);
                startActivity(i);
            }
        }));

        b26=(Button)findViewById(R.id.button21);
        b26.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jqn3.this, jqn4.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    } public int totalscore() {
        rg13= findViewById(R.id.radioGroup28);

        int radioId3= rg13.getCheckedRadioButtonId();
        if (radioId3 == R.id.r38) {
            Java.total1= Java.total1 + 1;
            // Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return Java.total1;
        }
        return radioId3;
    }

}
