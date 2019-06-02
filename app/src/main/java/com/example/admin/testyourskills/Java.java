package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Java extends AppCompatActivity {
    Button b22;
    RadioGroup rg11;
    static int total1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        Button b22 = findViewById(R.id.button18);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Java.this, jqn2.class);
                startActivity(in);
                int totalscore = totalscore();
            }
        });
    }
    public int totalscore() {
        rg11 = findViewById(R.id.radioGroup26);
        int radioId1 = rg11.getCheckedRadioButtonId();
        if (radioId1 == R.id.r21) {
            total1 = total1 + 1;

        } else {
            return total1;
        }
        return radioId1;
    }
}
