package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tdqn3 extends AppCompatActivity {
Button b95,b115;
    RadioGroup rg51;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdqn3);
        b115 = (Button) findViewById(R.id.button70);

        b95 = (Button) findViewById(R.id.button69);
        b95.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tdqn3.this, tdqn2.class);
                startActivity(i);

            }
        }));
        b115.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();

            }
        }));
    }
        public int totalscore() {
            rg51 = findViewById(R.id.radioGroup52);
            int radioId2 = rg51.getCheckedRadioButtonId();
            if (radioId2 == R.id.b55) {
                tdqn1.total15 = tdqn1.total15 + 1;
                openDialog();
            } else {
                openDialog();
                return tdqn1.total15;

            }
            return radioId2;

}
    public void openDialog() {
        ED13 exampleDialog = new ED13();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    }