package com.example.zakatcalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Output extends AppCompatActivity {
    private TextView tvg, tzp, tz;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);
        tvg= findViewById(R.id.tvg);
        tzp= findViewById(R.id.tzp);
        tz= findViewById(R.id.tz);

        Intent intent= getIntent();
        tvg. setText(intent.getStringExtra("TotalGoldValue"));
        tzp. setText(intent.getStringExtra("ZakatPayable"));
        tz. setText(intent.getStringExtra("TotalZakat"));
    }
}
