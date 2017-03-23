package com.example.milto.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class VegList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void margclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void capsclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void goldclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void bgpclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void sliceclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
    public void soyaclick(View view){
        Intent i=new Intent(this,PlaceOrder.class);
        startActivity(i);
    }
}
