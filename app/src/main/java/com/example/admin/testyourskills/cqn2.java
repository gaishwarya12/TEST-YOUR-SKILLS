package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cqn2 extends AppCompatActivity {

    Button b7, b8;
    RadioGroup rg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cqn2);
        b7 = (Button) findViewById(R.id.button5);
        b7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn2.this, cqn3.class);
                startActivity(i);
                int totalscore = totalscore();

            }
        }));

        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn2.this, C.class);
                startActivity(i);
            }
        }));
    }

    public int totalscore() {
        rg2 = findViewById(R.id.radioGroup5);

        int radioId2 = rg2.getCheckedRadioButtonId();
        if (radioId2 == R.id.r6) {
            C.total= C.total + 1;
           // Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return C.total;
        }
        return radioId2;
    }
}
