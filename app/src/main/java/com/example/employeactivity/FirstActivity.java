package com.example.employeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ett1,ett2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ett1 = findViewById(R.id.et1);
        ett2 = findViewById(R.id.et2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,SecondActivity.class);
        String name = ett1.getText().toString();
        String position = ett2.getText().toString();
        i.putExtra("name",name);
        i.putExtra("position",position);
        startActivity(i);

    }
}
