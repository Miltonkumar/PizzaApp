package com.example.milto.pizzaapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyOrder extends AppCompatActivity {
    EditText pSearch;
    Button searchBtn;
    Button delbtn;
    Button more;
    TextView viewName,viewPhone, viewNoP,viewCity;

    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        dataBaseHelper = new DataBaseHelper(this);

        pSearch = (EditText)findViewById(R.id.pSearch);
        searchBtn = (Button)findViewById(R.id.searchBtn);
        viewName = (TextView)findViewById(R.id.viewName);
        viewPhone = (TextView)findViewById(R.id.viewPhone);
        viewNoP = (TextView)findViewById(R.id.viewNoP);
        viewCity = (TextView)findViewById(R.id.viewCity);
        delbtn = (Button)findViewById(R.id.delbtn);
        more = (Button)findViewById(R.id.more);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Cursor cursor = dataBaseHelper.getData(pSearch.getText().toString());

                viewName.setText("   ");
               viewPhone.setText("   ");
                viewNoP.setText("   ");
                viewCity.setText(" No data found  ");

                while (cursor.moveToNext()){
                    viewName.setText(cursor.getString(1));
                    viewPhone.setText(cursor.getString(2));
                    viewNoP.setText(cursor.getString(3));
                    viewCity.setText(cursor.getString(4));
                }
            }
        });
    }
    public void delClick(View view){
        dataBaseHelper.mildel(pSearch.getText().toString());
        viewName.setText("   ");
        viewPhone.setText("   ");
        viewNoP.setText("   ");
        viewCity.setText("   ");
        Toast.makeText(this, "deleted", Toast.LENGTH_LONG).show();
    }
    public void moreadd(View view){
        Intent intent=new Intent(this, MenuItems.class);
        startActivity(intent);
    }
}



















