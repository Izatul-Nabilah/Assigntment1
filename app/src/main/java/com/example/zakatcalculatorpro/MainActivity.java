package com.example.zakatcalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAbout).setOnClickListener(view -> {
            Intent intent=new Intent(this,AboutActivity.class);
            startActivity(intent);

        });
        findViewById(R.id.btnCalc).setOnClickListener(view -> {
            Intent intent = new Intent(this, Calculation.class);
            startActivity(intent);
        });
    }



}