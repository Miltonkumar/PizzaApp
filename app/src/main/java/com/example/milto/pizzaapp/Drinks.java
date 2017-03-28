package com.example.milto.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void appleclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void teaclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void bullclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void sodaclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void cofeeclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void cokeclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
}
