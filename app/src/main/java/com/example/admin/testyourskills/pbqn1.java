package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pbqn1 extends AppCompatActivity {
Button b64;
    RadioGroup rg33;
    static int total9 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbqn1);
        b64=(Button)findViewById(R.id.button86);
        b64.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pbqn1.this, pbqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg33= findViewById(R.id.radioGroup34);
        int radioId1 = rg33.getCheckedRadioButtonId();
        if (radioId1 == R.id.a77) {
            total9 = total9 + 1;

        } else {
            return total9;
        }
        return radioId1;
    }
}
