package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class agqn1 extends AppCompatActivity {
Button b52;
    RadioGroup rg16;
    static int total3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agqn1);
        b52=(Button)findViewById(R.id.button46);
        b52.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(agqn1.this, agqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg16 = findViewById(R.id.radioGroup6);
        int radioId1 = rg16.getCheckedRadioButtonId();
        if (radioId1 == R.id.a1) {
            total3 = total3 + 1;

        } else {
            return total3;
        }
        return radioId1;
    }

}
