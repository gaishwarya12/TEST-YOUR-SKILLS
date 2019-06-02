package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class nqn3 extends AppCompatActivity {
Button b48,b108;
    RadioGroup rg32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nqn3);
        b48=(Button)findViewById(R.id.button34);
        b108=(Button)findViewById(R.id.button35);
        b48.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(nqn3.this, nqn2.class);
                startActivity(i);
            }
        }));
        b108.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg32 = findViewById(R.id.radioGroup33);
        int radioId3 = rg32.getCheckedRadioButtonId();
        if (radioId3 == R.id.a72) {
            nqn1.total8 = nqn1.total8+ 1;
            openDialog();

        } else {
            openDialog();
            return nqn1.total8;
        }
        return radioId3;
    }
    public void openDialog() {
        ED6 exampleDialog = new ED6();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
