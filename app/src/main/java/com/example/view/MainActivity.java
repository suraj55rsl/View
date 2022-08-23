package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import  android.widget.*;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonA = findViewById(R.id.button1);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openTextView();
            }
        });

        //
        Button buttonB = findViewById(R.id.button2);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditView();
            }
        });
        //
        Button buttonC = findViewById(R.id.button3);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openButtonView();
            }
        });
        //
        Button buttonD = findViewById(R.id.button4);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImageView();
            }
        });

    }
    public  void openTextView(){
        Intent intent=new Intent(this,TextView.class);
        startActivity(intent);
    }
    public  void openEditView()
    {
        Intent intent=new Intent(this,EditView.class);
        startActivity(intent);

    }
    public  void openButtonView(){
        Intent intent=new Intent(this,ButtonView.class);
        startActivity(intent);

    }
    public  void openImageView(){
        Intent intent=new Intent(this,imageView.class);
        startActivity(intent);

    }



}