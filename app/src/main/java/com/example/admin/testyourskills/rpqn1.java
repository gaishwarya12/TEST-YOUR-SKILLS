package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class rpqn1 extends AppCompatActivity {
Button b84;
    RadioGroup rg41;
    static int total12 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpqn1);
        b84=(Button)findViewById(R.id.button91);
        b84.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rpqn1.this, rpqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg41= findViewById(R.id.radioGroup43);
        int radioId1 = rg41.getCheckedRadioButtonId();
        if (radioId1 == R.id.b11) {
            total12 = total12 + 1;

        } else {
            return total12;
        }
        return radioId1;
    }
}
