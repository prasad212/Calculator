package com.example.prasad.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText edita,editb,editfibo;
    TextView result;
    String avalue ;
    String bvalue ;
    String fibovalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edita = findViewById(R.id.edit1);
        editb =  findViewById(R.id.edit2);
        editfibo =findViewById(R.id.fibo);

    edita.setText(avalue);
    editb.setText(bvalue);


    }

    public void Fibo(View view)
    {
        fibovalue = editfibo.getText().toString();
        Float fibov=Float.parseFloat(fibovalue);
        float fibo = fibov -1+fibov-2;
        display(String.valueOf(fibo));

    }

    public void subtraction(View view) {
        int sub;
        avalue = edita.getText().toString();
        bvalue = editb.getText().toString();
        int a = Integer.parseInt(avalue);
        int b= Integer.parseInt(bvalue);
        sub=a-b;
        display(String.valueOf(sub));


    }

    public void addition(View view) {
        int  add;
        avalue = edita.getText().toString();
        bvalue = editb.getText().toString();
        int a = Integer.parseInt(avalue);
        int b= Integer.parseInt(bvalue);
        add=a+b;

        display(String.valueOf(add));
    }

    public void multi(View view) {
        int mul;
        avalue = edita.getText().toString();
        bvalue = editb.getText().toString();
        int a = Integer.parseInt(avalue);
        int b= Integer.parseInt(bvalue);
        mul= a* b;
        display(String.valueOf(mul));
    }


    public void division(View view) {

        float div;
        avalue = edita.getText().toString();
        bvalue = editb.getText().toString();
        Float a = Float.parseFloat(avalue);
        Float b= Float.parseFloat(bvalue);
        div=a/b;

       display(String.valueOf(div));
    }
    public void display(String s)
    {

TextView result = findViewById(R.id.resulttext);
result.setText(s);
    }
}

