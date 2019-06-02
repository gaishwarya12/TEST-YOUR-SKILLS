package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class bsqn3 extends AppCompatActivity {
Button b75,b105;
    RadioGroup rg24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsqn3);
        b75=(Button)findViewById(R.id.button79);
        b105=(Button)findViewById(R.id.button80);
        b75.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bsqn3.this, bsqn2.class);
                startActivity(i);
            }
        }));
        b105.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg24 = findViewById(R.id.radioGroup14);
        int radioId3 = rg24.getCheckedRadioButtonId();
        if (radioId3 == R.id.a36) {
            bsqn1.total5 = bsqn1.total5 + 1;
            openDialog();

        } else {
            openDialog();
            return bsqn1.total5;

        }
        return radioId3;
    }
    public void openDialog() {
        ED3 exampleDialog = new ED3();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
