package com.example.asus.spame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Test Commit

    public Button buttonTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonTest = findViewById(R.id.buttonTest);
        buttonTest.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view == buttonTest){
            startActivity(new Intent(this, SignupActivity.class));
        }
    }
}
