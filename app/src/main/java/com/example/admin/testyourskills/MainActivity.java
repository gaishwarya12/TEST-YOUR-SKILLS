package com.example.admin.testyourskills;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button b;
 EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        b.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter Your Name",Toast.LENGTH_LONG).show();
                }
else
                {
                Intent i=new Intent(MainActivity.this,SelectCategory.class);
                startActivity(i);
            }}
        }));
    }
}
