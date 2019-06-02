package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class siciqn3 extends AppCompatActivity {
Button b91,b114;
    RadioGroup rg48;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siciqn3);
        b91=(Button)findViewById(R.id.button84);
        b114=(Button)findViewById(R.id.button85);
        b91.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(siciqn3.this, siciqn2.class);
                startActivity(i);
            }
        }));
        b114.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg48= findViewById(R.id.radioGroup51);
        int radioId2 = rg48.getCheckedRadioButtonId();
        if (radioId2 == R.id.b41) {
            siciqn1.total14 = siciqn1.total14 + 1;
            openDialog();
        } else {
            openDialog();
            return siciqn1.total14;
        }
        return radioId2;
    }
    public void openDialog() {
        ED12 exampleDialog = new ED12();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
