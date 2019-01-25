package com.example.toby.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etTotal;
    private Button fivePercent, tenPercent, fifteenPercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        intent();
    }

    public void init(){
        etTotal = (EditText) findViewById(R.id.editText);
        fivePercent = (Button) findViewById(R.id.button1);
        tenPercent = (Button) findViewById(R.id.button2);
        fifteenPercent = (Button) findViewById(R.id.button3);

        fivePercent.setOnClickListener(this);
        tenPercent.setOnClickListener(this);
        fifteenPercent.setOnClickListener(this);
    }/*
    @Override
    public void onClick(View view){
        String total = etTotal.toString();

        switch(view.getId()){
            case R.id.button1:
                itotal = Double.parseDouble(total) * .5;
                break;
        }
    }*/

}
