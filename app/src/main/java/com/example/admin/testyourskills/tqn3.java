package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tqn3 extends AppCompatActivity {
Button b103,b116;
    RadioGroup rg54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tqn3);
        b103=(Button)findViewById(R.id.button74);
        b116=(Button)findViewById(R.id.button75);
        b103.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tqn3.this, tqn2.class);
                startActivity(i);
            }
        }));
        b116.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg54= findViewById(R.id.radioGroup57);
        int radioId2 = rg54.getCheckedRadioButtonId();
        if (radioId2 == R.id.b66) {
            tqn1.total16= tqn1.total16 + 1;
            openDialog();
        } else {
            openDialog();
            return tqn1.total16;
        }
        return radioId2;
    }
    public void openDialog() {
        ED14 exampleDialog = new ED14();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
