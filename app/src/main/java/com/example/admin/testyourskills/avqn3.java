package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class avqn3 extends AppCompatActivity {
Button b59,b104;
    RadioGroup rg21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avqn3);
        b59=(Button)findViewById(R.id.button44);
        b104=(Button)findViewById(R.id.button45);
        b59.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(avqn3.this, avqn2.class);
                startActivity(i);
            }
        }));
        b104.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg21 = findViewById(R.id.radioGroup11);
        int radioId3 = rg21.getCheckedRadioButtonId();
        if (radioId3 == R.id.a22) {
            avqn1.total4 = avqn1.total4 + 1;
            openDialog();

        } else {
            openDialog();
            return avqn1.total4;
        }
        return radioId3;
    }
    public void openDialog() {
        ED2 exampleDialog = new ED2();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
