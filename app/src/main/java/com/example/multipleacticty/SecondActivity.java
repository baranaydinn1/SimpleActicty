package com.example.multipleacticty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void getBack(View view){

       /* Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);*/
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        //int age = intent.getIntExtra("age",0);
        String name  = intent.getStringExtra("name");
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();


        //Toast.makeText(this,Integer.toString(age), Toast.LENGTH_SHORT).show(); //showed toast message that we have already given on main activity
        }
}