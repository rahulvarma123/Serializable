package com.example.employeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Third3Activity extends AppCompatActivity implements View.OnClickListener {
    TextView tvn,tvp,tvs;EditText edtt1,edtt2,edtt3;


    Button btn33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);
        tvn = findViewById(R.id.tv123);
        tvp = findViewById(R.id.tv456);
        tvs = findViewById(R.id.tv789);
        edtt1 = findViewById(R.id.edittext3);
        edtt2 = findViewById(R.id.edittext4);
        edtt3 = findViewById(R.id.edittext5);
        btn33 = findViewById(R.id.btn123);

        btn33.setOnClickListener(this);

        Intent i = getIntent();
       String name2 = i.getStringExtra("name");
       String position2 = i.getStringExtra("position");
       Float salary2 = i.getFloatExtra("salary",0);

        tvn.setText(name2);
        tvp.setText(position2);
        tvs.setText(salary2+"");


    }

    @Override
    public void onClick(View view) {

    }
}
