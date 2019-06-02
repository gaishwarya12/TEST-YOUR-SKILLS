package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class cpqn2 extends AppCompatActivity {
Button b15,b111;
    RadioGroup rg7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqn2);
        b15=(Button)findViewById(R.id.button11);
        b15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cpqn2.this,CPlus.class);
                startActivity(i);
            }
        }));
        b111=(Button)findViewById(R.id.button10);
        b111.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cpqn2.this,cpqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg7 = findViewById(R.id.radioGroup22);

        int radioId2 = rg7.getCheckedRadioButtonId();
        if (radioId2 == R.id.ra8) {
            CPlus.total2= CPlus.total2 + 1;
            //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return CPlus.total2;
        }
        return radioId2;
    }
}
