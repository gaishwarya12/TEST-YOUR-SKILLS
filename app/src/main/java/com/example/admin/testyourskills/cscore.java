package com.example.admin.testyourskills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cscore extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cscore);
    }

    public int totalscore() {
        int total = 0;
        radioGroup1 = findViewById(R.id.radioGroup2);
        int radioId1 = radioGroup1.getCheckedRadioButtonId();
        if (radioId1 == R.id.r3) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup2 = findViewById(R.id.radioGroup5);
        int radioId2 = radioGroup2.getCheckedRadioButtonId();
        if (radioId2 == R.id.r5) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup3 = findViewById(R.id.radioGroup);
        int radioId3 = radioGroup3.getCheckedRadioButtonId();
        if (radioId3 == R.id.r11) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup4 = findViewById(R.id.radioGroup4);
        int radioId4 = radioGroup4.getCheckedRadioButtonId();
        if (radioId4 == R.id.r16) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup5 = findViewById(R.id.radioGroup5);
        int radioId5 = radioGroup5.getCheckedRadioButtonId();
        if (radioId5 == R.id.r19) {
            total = total + 1;
        } else {
            return total;
        }

        return total;
    }
    /*
    The Submit Score method is used to display the result of the Person in the Quiz using a Toast method
     */
    public void submit_score(View view) {
        int total_score = totalscore();
        EditText name = findViewById(R.id.editText);
        String thename = name.getText().toString();
        Toast.makeText(this, "Hey " + thename + "! Your score is :" + total_score, Toast.LENGTH_SHORT).show();

    }
}