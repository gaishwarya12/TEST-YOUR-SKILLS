package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class siciqn2 extends AppCompatActivity {
Button b89,b90;
    RadioGroup rg47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siciqn2);
        b89=(Button)findViewById(R.id.button82);
        b89.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(siciqn2.this, siciqn1.class);
                startActivity(i);
            }
        }));b90=(Button)findViewById(R.id.button83);
        b90.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(siciqn2.this, siciqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg47= findViewById(R.id.radioGroup50);
        int radioId2 = rg47.getCheckedRadioButtonId();
        if (radioId2 == R.id.b39) {
            siciqn1.total14 = siciqn1.total14 + 1;

        } else {
            return siciqn1.total14;
        }
        return radioId2;
    }
}
