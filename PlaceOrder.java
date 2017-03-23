package com.example.milto.pizzaapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlaceOrder extends AppCompatActivity {

    private DataBaseHelper dataBaseHelper;
    NotificationCompat.Builder notification;
    private static final int uniqueId=40101;

    EditText userno;
    EditText user_name,items_no,city_id;

    Button save_order;
    Button showOdr;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
          dataBaseHelper = new DataBaseHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userno =(EditText)findViewById(R.id.cust_pno);
        user_name=(EditText)findViewById(R.id.uname);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);

        //uname = (EditText)findViewById(R.id.uname);
       // cust_pno = (EditText)findViewById(R.id.cust_pno);
        items_no = (EditText)findViewById(R.id.items_no);
        city_id = (EditText)findViewById(R.id.city_id);
        save_order = (Button)findViewById(R.id.save_order);

        showOdr = (Button)findViewById(R.id.showOdr);
        showOdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PlaceOrder.this,MyOrder.class);
                startActivity(i);
            }
        });


    }

    public void orderClick(View view){
        SharedPreferences shpf= getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=shpf.edit();
       // editor.putString("username",user_name.getText().toString());
       // editor.putString("usernum", userno.getText().toString());
       // editor.apply();

        Toast.makeText(this," Your Order Placed!!!",Toast.LENGTH_LONG).show();

        notification.setSmallIcon(R.drawable.main);
        notification.setTicker("Pizza App notification");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Your Order Summary");
        notification.setContentText("This is an app made for educational purpose,so you are not going to get any pizza....enjoy usin app.thanks...");

        Intent intent=new Intent(this,MainActivity.class);

        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueId,notification.build());

       boolean result = dataBaseHelper.insertdata(user_name.getText().toString(),userno.getText().toString(),Integer.parseInt(items_no.getText().toString()),city_id.getText().toString());

    }

}

