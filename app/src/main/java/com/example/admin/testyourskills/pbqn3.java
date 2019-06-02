package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pbqn3 extends AppCompatActivity {
Button b67,b109;
    RadioGroup rg35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbqn3);
        b67=(Button)findViewById(R.id.button89);
        b109=(Button)findViewById(R.id.button90);
        b67.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pbqn3.this, pbqn2.class);
                startActivity(i);
            }
        }));
        b109.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg35 = findViewById(R.id.radioGroup36);
        int radioId2 = rg35.getCheckedRadioButtonId();
        if (radioId2 == R.id.a82) {
            pbqn1.total9 = pbqn1.total9 + 1;
            openDialog();

        } else {
            openDialog();
            return pbqn1.total9;
        }
        return radioId2;
    }
    public void openDialog() {
        ED7 exampleDialog = new ED7();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
