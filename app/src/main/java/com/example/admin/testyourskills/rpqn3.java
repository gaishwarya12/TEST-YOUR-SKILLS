package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class rpqn3 extends AppCompatActivity {
Button b87,b112;
    RadioGroup rg43;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpqn3);
        b87=(Button)findViewById(R.id.button94);
        b112=(Button)findViewById(R.id.button95);
        b87.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rpqn3.this, rpqn2.class);
                startActivity(i);
            }
        }));
        b112.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg43 = findViewById(R.id.radioGroup45);
        int radioId2 = rg43.getCheckedRadioButtonId();
        if (radioId2 == R.id.b19) {
            rpqn1.total12 = rpqn1.total12 + 1;
            openDialog();

        } else {
            openDialog();
            return rpqn1.total12;

        }
        return radioId2;
    }
    public void openDialog() {
        ED10 exampleDialog = new ED10();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
