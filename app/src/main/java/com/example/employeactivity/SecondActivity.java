package com.example.employeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvv1,tvv2,tvv3;
    EditText edit21,edit22,edit23;
    Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvv1 = findViewById(R.id.tv1);
        tvv2 = findViewById(R.id.tv2);
        tvv3 = findViewById(R.id.tv3);
        edit21 = findViewById(R.id.et11);
        edit22 = findViewById(R.id.et12);
        edit23 = findViewById(R.id.et13);
        btn2 = findViewById(R.id.btn1);

        btn2.setOnClickListener(this);
        Intent i =getIntent();
        String name1 =i.getStringExtra("name");
        String position1 =i.getStringExtra("position");

        tvv1.setText(name1);
        tvv2.setText(position1);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Third3Activity.class);
        String name1=edit21.getText().toString();
        String position1=edit22.getText().toString();
        Float salary=Float.parseFloat(edit23.getText().toString());
        i.putExtra("name",name1);
        i.putExtra("position",position1);
        i.putExtra("salary",salary);
        startActivity(i);


    }
}
