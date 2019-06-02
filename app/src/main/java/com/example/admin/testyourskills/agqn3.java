package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class agqn3 extends AppCompatActivity {
Button b55,b103;
    RadioGroup rg18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agqn3);
        b55=(Button)findViewById(R.id.button49);
        b103=(Button)findViewById(R.id.button50);
        b55.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(agqn3.this, agqn2.class);
                startActivity(i);
            }
        }));
        b103.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
        }

    }));
    }
    public int totalscore() {
        rg18 = findViewById(R.id.radioGroup8);
        int radioId3 = rg18.getCheckedRadioButtonId();
        if (radioId3 == R.id.a12) {
            agqn1.total3 = agqn1.total3 + 1;
            openDialog();
        } else {
            openDialog();
            return agqn1.total3;
            }
        return radioId3;
    }
    public void openDialog() {
        ED1 exampleDialog = new ED1();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
