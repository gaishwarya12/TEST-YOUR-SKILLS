package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class calqn1 extends AppCompatActivity {
Button b76;
    RadioGroup rg25;
    static int total6 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calqn1);
        b76=(Button)findViewById(R.id.button96);
        b76.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(calqn1.this, calqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg25= findViewById(R.id.radioGroup15);
        int radioId1 = rg25.getCheckedRadioButtonId();
        if (radioId1 == R.id.a37) {
            total6 = total6 + 1;

        } else {
            return total6;
        }
        return radioId1;
    }
}
