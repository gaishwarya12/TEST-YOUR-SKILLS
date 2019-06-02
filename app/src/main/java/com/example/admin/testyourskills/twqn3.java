package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class twqn3 extends AppCompatActivity {
Button b99,b117;
    RadioGroup rg57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twqn3);
        b99=(Button)findViewById(R.id.button65);
        b117=(Button)findViewById(R.id.button64);
        b99.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(twqn3.this, twqn2.class);
                startActivity(i);
            }
        }));
        b117.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg57 = findViewById(R.id.radioGroup58);
        int radioId2 = rg57.getCheckedRadioButtonId();
        if (radioId2 == R.id.b78) {
            openDialog();
            twqn1.total17 = twqn1.total17 + 1;

        } else {
            openDialog();
            return twqn1.total17;
        }
        return radioId2;
    }
    public void openDialog() {
        ED15 exampleDialog = new ED15();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
