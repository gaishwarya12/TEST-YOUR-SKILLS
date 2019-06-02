package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cqn4 extends AppCompatActivity {
    Button b11, b12;
    int total;
    RadioGroup rg4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cqn4);
        b11 = (Button) findViewById(R.id.button28);
        b11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn4.this, cqn3.class);
                startActivity(i);

            }
        }));
        b12 = (Button) findViewById(R.id.button27);
        b12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn4.this, cqn5.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        }
    public int totalscore() {
        rg4 = findViewById(R.id.radioGroup);
            int radioId4 = rg4.getCheckedRadioButtonId();
            if (radioId4 == R.id.r13) {
                C.total = C.total + 1;
                //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();
            } else {
                return total;
            }
            return radioId4;
        }
    }
