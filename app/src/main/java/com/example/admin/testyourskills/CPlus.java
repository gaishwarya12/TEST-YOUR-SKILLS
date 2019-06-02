package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class CPlus extends AppCompatActivity {
Button b14;
    RadioGroup rg6;
    static int total2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus);
        Button b14 =findViewById(R.id.button9);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(CPlus.this,cpqn2.class);
                startActivity(in);
                int totalscore = totalscore();
            }
        });


    }
    public int totalscore() {
        rg6 = findViewById(R.id.radioGroup21);
        int radioId1 = rg6.getCheckedRadioButtonId();
        if (radioId1 == R.id.ra2) {
            total2 = total2 + 1;

        } else {
            return total2;
        }
        return radioId1;
    }
}
