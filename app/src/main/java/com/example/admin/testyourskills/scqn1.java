package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class scqn1 extends AppCompatActivity {
Button b49;
    RadioGroup rg44;
    static int total13 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scqn1);
        b49=(Button)findViewById(R.id.button36);
        b49.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scqn1.this, scqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg44= findViewById(R.id.radioGroup46);
        int radioId1 = rg44.getCheckedRadioButtonId();
        if (radioId1 == R.id.b21) {
            total13 = total13 + 1;

        } else {
            return total13;
        }
        return radioId1;
    }
}
