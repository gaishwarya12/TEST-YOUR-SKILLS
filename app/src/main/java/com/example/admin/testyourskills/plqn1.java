package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class plqn1 extends AppCompatActivity {
Button b68;
    RadioGroup rg36;
    static int total10 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plqn1);
        b68=(Button)findViewById(R.id.button56);
        b68.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(plqn1.this, plqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg36= findViewById(R.id.radioGroup37);
        int radioId1 = rg36.getCheckedRadioButtonId();
        if (radioId1 == R.id.a86) {
            total10= total10 + 1;

        } else {
            return total10;
        }
        return radioId1;
    }
}
