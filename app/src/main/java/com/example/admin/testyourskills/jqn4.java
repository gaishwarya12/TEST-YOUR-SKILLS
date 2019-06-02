package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class jqn4 extends AppCompatActivity {
Button b27,b28;
    RadioGroup rg14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jqn4);
        b27=(Button)findViewById(R.id.button23);
        b27.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(jqn4.this,jqn5.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

        b28=(Button)findViewById(R.id.button24);
        b28.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jqn4.this, jqn3.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg14= findViewById(R.id.radioGroup29);

        int radioId4 = rg14.getCheckedRadioButtonId();
        if (radioId4 == R.id.r36) {
            Java.total1= Java.total1 + 1;
            // Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return Java.total1;
        }
        return radioId4;
    }
}
