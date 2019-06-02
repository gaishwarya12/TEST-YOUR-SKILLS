package com.example.admin.testyourskills;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class jqn5 extends AppCompatActivity {
    Button b29,b102;
    RadioGroup rg15;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jqn5);
        b29 = (Button) findViewById(R.id.button25);
        b29.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jqn5.this, jqn4.class);
                startActivity(i);
            }
        }));
        b102=(Button)findViewById(R.id.button26);
        b102.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalscore = totalscore();

            }

        }));

    }
    public int totalscore() {
        rg15 = findViewById(R.id.radioGroup30);
        int radioId5 = rg15.getCheckedRadioButtonId();
        if (radioId5 == R.id.r33) {
            Java.total1= Java.total1 + 1;
            openDialog();
            }

        else {
            openDialog();
            return Java.total1;

        }
        return radioId5;
    }
    public void openDialog(){
        ExampleDialog exampleDialog= new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}