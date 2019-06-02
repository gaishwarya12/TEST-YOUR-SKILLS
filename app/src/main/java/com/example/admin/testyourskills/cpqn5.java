package com.example.admin.testyourskills;

import android.content.Intent;
import android.os.CpuUsageInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cpqn5 extends AppCompatActivity {
Button b21,b101;
    RadioGroup rg10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqn5);
        b21=(Button)findViewById(R.id.button16);
        b21.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cpqn5.this,cpqn4.class);
                startActivity(i);
            }
        }));
        b101 = (Button)findViewById(R.id.button17);
        b101.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg10 = findViewById(R.id.radioGroup24);
        int radioId5 = rg10.getCheckedRadioButtonId();
        if (radioId5 == R.id.ra17) {
            CPlus.total2= CPlus.total2 + 1;
           // Toast.makeText(getApplicationContext(),"total"+ CPlus.total2,Toast.LENGTH_LONG).show();
            openDialog();
        } else {
            openDialog();
            return CPlus.total2;

        }
        return radioId5;
    }
    public void openDialog() {
        ExampleDialog1 exampleDialog = new ExampleDialog1();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
