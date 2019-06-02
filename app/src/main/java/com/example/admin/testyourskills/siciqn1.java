package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class siciqn1 extends AppCompatActivity {
Button b88;
    RadioGroup rg47;
    static int total14 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siciqn1);
        b88=(Button)findViewById(R.id.button81);
        b88.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(siciqn1.this, siciqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg47= findViewById(R.id.radioGroup49);
        int radioId1 = rg47.getCheckedRadioButtonId();
        if (radioId1 == R.id.b33) {
            total14 = total14+ 1;

        } else {
            return total14;
        }
        return radioId1;
    }
}
