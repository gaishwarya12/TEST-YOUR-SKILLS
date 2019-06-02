package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class bsqn1 extends AppCompatActivity {
Button b72;
    RadioGroup rg22;
    static int total5 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsqn1);
    b72=(Button)findViewById(R.id.button76);
        b72.setOnClickListener((new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(bsqn1.this, bsqn2.class);
            startActivity(i);
            int totalscore = totalscore();
        }
    }));
}
    public int totalscore() {
        rg22= findViewById(R.id.radioGroup12);
        int radioId1 = rg22.getCheckedRadioButtonId();
        if (radioId1 == R.id.a27) {
            total5 = total5 + 1;

        } else {
            return total5;
        }
        return radioId1;
    }
    }

