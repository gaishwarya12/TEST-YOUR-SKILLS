package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class cloqn3 extends AppCompatActivity {
Button b83,b107;
    RadioGroup rg30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloqn3);
        b83=(Button)findViewById(R.id.button104);
        b107=(Button)findViewById(R.id.button105);
        b83.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cloqn3.this, cloqn2.class);
                startActivity(i);
            }
        }));
        b107.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg30= findViewById(R.id.radioGroup20);
        int radioId2 = rg30.getCheckedRadioButtonId();
        if (radioId2 == R.id.a58) {
            cloqn1.total7 = cloqn1.total7 + 1;
            openDialog();
        } else {
            openDialog();
            return cloqn1.total7;

        }
        return radioId2;
    }
    public void openDialog() {
        ED5 exampleDialog = new ED5();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
