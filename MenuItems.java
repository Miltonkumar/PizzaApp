package com.example.milto.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void vegclick(View view){
        Intent i=new Intent(this,VegList.class);
        startActivity(i);
    }
    public void nonvgclick(View view){
        Intent i=new Intent(this,NonVegList.class);
        startActivity(i);
    }
    public void drinkClick(View view){
        Intent i=new Intent(this,Drinks.class);
        startActivity(i);
    }

}
