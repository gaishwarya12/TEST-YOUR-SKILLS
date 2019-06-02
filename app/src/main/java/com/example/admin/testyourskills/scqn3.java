package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class scqn3 extends AppCompatActivity {
Button b52,b113;
    RadioGroup rg46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scqn3);
        b52=(Button)findViewById(R.id.button40);
        b113=(Button)findViewById(R.id.button39);
        b52.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scqn3.this, scqn2.class);
                startActivity(i);
            }
        }));
        b113.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg46 = findViewById(R.id.radioGroup48);
        int radioId2 = rg46.getCheckedRadioButtonId();
        if (radioId2 == R.id.b29) {
            scqn1.total13 = scqn1.total13 + 1;
            openDialog();
        } else {
            openDialog();
            return scqn1.total13;
        }
        return radioId2;
    }
    public void openDialog() {
        ED11 exampleDialog = new ED11();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
