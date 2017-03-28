package com.example.milto.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NonVegList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void chillyClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void chickClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void festClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void floClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void mexiClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void barbClick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
}
