package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class calqn3 extends AppCompatActivity {
Button b79,b106;
    RadioGroup rg27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calqn3);
        b79=(Button)findViewById(R.id.button99);
        b106=(Button)findViewById(R.id.button100);
        b79.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(calqn3.this, calqn2.class);
                startActivity(i);
            }
        }));
        b106.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));

    }


    public int totalscore() {
        rg27 = findViewById(R.id.radioGroup17);
        int radioId3 = rg27.getCheckedRadioButtonId();
        if (radioId3 == R.id.a48) {
            calqn1.total6= calqn1.total6+ 1;
            openDialog();

        } else {
            openDialog();
            return calqn1.total6;

        }
        return radioId3;
    }
    public void openDialog() {
        ED4 exampleDialog = new ED4();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}