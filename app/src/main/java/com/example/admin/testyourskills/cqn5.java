package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cqn5 extends AppCompatActivity {
    Button b13, b100;
    RadioGroup rg5;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cqn5);
        b13 = (Button) findViewById(R.id.button29);
        b13.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(cqn5.this, cqn4.class);
                    startActivity(i);
                }
                }));
            b100 = (Button)findViewById(R.id.button30);
        b100.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int total_score = totalscore();
                }
                }));
        }
    public int totalscore() {
        rg5 = findViewById(R.id.radioGroup4);
        int radioId5 = rg5.getCheckedRadioButtonId();
        if (radioId5 == R.id.r17) {
            C.total = C.total + 1;
            //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();
            openDialog();
        } else {
            openDialog();
            return total;

        }
        return radioId5;

    }
    public void openDialog() {
        ExampleDialog2 exampleDialog = new ExampleDialog2();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}





