package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView res;
    EditText n1,n2;
    Button add,sub,div,mul;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.txtn1);


        n2 = (EditText) findViewById(R.id.txtn2);
        res = (TextView) findViewById(R.id.txtresu);
        res.setEnabled(false); // for diable editing of edittext
        add = (Button) findViewById(R.id.txtadd);
        sub = (Button) findViewById(R.id.txtsub);
        mul = (Button) findViewById(R.id.txtmul);
        div = (Button) findViewById(R.id.txtdiv);

        Operation o = new Operation();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int a = o.add(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()));
                res.setText(Integer.toString(a));
                Toast.makeText(MainActivity.this,"Addition applied",Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = o.sub(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()));
                res.setText(Integer.toString(a));
                Toast.makeText(MainActivity.this,"Subtraction applied",Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = o.mul(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()));
                res.setText(Integer.toString(a));
                Toast.makeText(MainActivity.this,"Multiplication applied",Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = o.div(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()));
                res.setText(Integer.toString(a));
                Toast.makeText(MainActivity.this,"Division applied",Toast.LENGTH_SHORT).show();
            }
        });
    }
}