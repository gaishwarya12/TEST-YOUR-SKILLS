package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tdqn1 extends AppCompatActivity {
Button b92;
    RadioGroup rg49;
    static int total15 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdqn1);
        b92=(Button)findViewById(R.id.button66);
        b92.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tdqn1.this, tdqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg49= findViewById(R.id.radioGroup54);
        int radioId1 = rg49.getCheckedRadioButtonId();
        if (radioId1 == R.id.b46) {
            total15 = total15 + 1;

        } else {
            return total15;
        }
        return radioId1;
    }
}
