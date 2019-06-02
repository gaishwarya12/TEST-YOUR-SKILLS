package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class jqn2 extends AppCompatActivity {
Button b23,b24;
    RadioGroup rg12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jqn2);
        b23=(Button)findViewById(R.id.button20);
        b23.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(jqn2.this,Java.class);
                startActivity(i);
            }
        }));

        b24=(Button)findViewById(R.id.button19);
        b24.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jqn2.this, jqn3.class);
                startActivity(i);
                int totalscore = totalscore();

            }
        }));
    }
    public int totalscore() {
        rg12 = findViewById(R.id.radioGroup27);

        int radioId2 = rg12.getCheckedRadioButtonId();
        if (radioId2 == R.id.r27) {
            Java.total1= Java.total1 + 1;
            // Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return Java.total1;
        }
        return radioId2;
    }
}
