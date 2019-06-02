package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cqn3 extends AppCompatActivity {
    Button b9, b10;
    RadioGroup rg3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cqn3);
        Button b9 = findViewById(R.id.button6);
        b9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn3.this, cqn4.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

        b10 = (Button) findViewById(R.id.button7);
        b10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cqn3.this, cqn2.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg3 = findViewById(R.id.radioGroup3);
        int radioId3 = rg3.getCheckedRadioButtonId();
        if (radioId3 == R.id.r11) {
            C.total = C.total + 1;
            //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();
        } else {
            return C.total;
        }
        return radioId3;
    }
}
