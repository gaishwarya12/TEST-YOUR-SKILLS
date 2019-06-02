package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tqn1 extends AppCompatActivity {
Button b100;
    RadioGroup rg52;
    static int total16 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tqn1);
        b100=(Button)findViewById(R.id.button71);
        b100.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tqn1.this, tqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg52= findViewById(R.id.radioGroup55);
        int radioId1 = rg52.getCheckedRadioButtonId();
        if (radioId1 == R.id.b60) {
            total16 = total16+ 1;

        } else {
            return total16;
        }
        return radioId1;
    }
}
