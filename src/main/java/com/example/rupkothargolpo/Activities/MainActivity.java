package com.example.rupkothargolpo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rupkothargolpo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
        startActivity(intent);
    }

    public void extra(View view) {
    }
}