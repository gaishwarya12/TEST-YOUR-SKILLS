package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class cloqn2 extends AppCompatActivity {
Button b81,b82;
    RadioGroup rg29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloqn2);
        b81=(Button)findViewById(R.id.button103);
        b81.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cloqn2.this, cloqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b82=(Button)findViewById(R.id.button102);
        b82.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cloqn2.this, cloqn1.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg29 = findViewById(R.id.radioGroup19);
        int radioId2 = rg29.getCheckedRadioButtonId();
        if (radioId2 == R.id.a55) {
            cloqn1.total7 = cloqn1.total7 + 1;

        } else {
            return cloqn1.total7;
        }
        return radioId2;
    }
}
