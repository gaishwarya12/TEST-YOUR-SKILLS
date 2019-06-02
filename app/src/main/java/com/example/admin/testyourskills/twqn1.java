package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class twqn1 extends AppCompatActivity {
Button b96;
    RadioGroup rg55;
    static int total17 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twqn1);
        b96=(Button)findViewById(R.id.button61);
        b96.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(twqn1.this, twqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg55= findViewById(R.id.radioGroup60);
        int radioId1 = rg55.getCheckedRadioButtonId();
        if (radioId1 == R.id.b70) {
            total17 = total17 + 1;

        } else {
            return total17;
        }
        return radioId1;
    }
}
