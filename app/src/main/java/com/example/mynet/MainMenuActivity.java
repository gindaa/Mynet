package com.example.mynet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);



        TextView welcomename = (TextView)findViewById(R.id.welcomename);
        Button listkaryawan = (Button)findViewById(R.id.listkaryawan);
        Button searchkaryawan = (Button)findViewById(R.id.searchkaryawan);
        Button addkaryawan = (Button)findViewById(R.id.addkaryawan);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        welcomename.setText(sharedPreferences.getString("nama","User"));

        listkaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this,ListKaryawanActivity.class);
                startActivity(intent);
            }
        });
        searchkaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this,SearchKaryawanActivity.class);
                startActivity(intent);
            }
        });
        addkaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this,AddKaryawanActivity.class);
                startActivity(intent);
            }
        });
    }
}