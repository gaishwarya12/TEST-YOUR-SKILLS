package com.example.admin.testyourskills;

import android.content.Intent;
import android.os.CpuUsageInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class cpqn4 extends AppCompatActivity {
Button b19,b20;
    RadioGroup rg9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqn4);
        b19=(Button)findViewById(R.id.button14);
        b19.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cpqn4.this,cpqn5.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

        b20=(Button)findViewById(R.id.button15);
        b20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cpqn4.this, cpqn3.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg9 = findViewById(R.id.radioGroup25);

        int radioId4 = rg9.getCheckedRadioButtonId();
        if (radioId4 == R.id.ra13) {
            CPlus.total2= CPlus.total2 + 1;
            //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return CPlus.total2;
        }
        return radioId4;
    }
}
