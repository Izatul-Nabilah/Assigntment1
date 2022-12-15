package com.example.zakatcalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculation extends AppCompatActivity {
    private EditText etGoldValue, etWeight;
    private CheckBox ckeep, cwear;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculation);
        etGoldValue= findViewById(R.id.etgoldvalue);
        etWeight= findViewById(R.id.etweight);
        ckeep= findViewById(R.id.ckeep);
        cwear= findViewById(R.id.cwear);
        findViewById(R.id.btnsubmit).setOnClickListener(view -> {
            if (ckeep.isChecked())calculate(true);
            if (cwear.isChecked())calculate(false);
        });
    }
    private void calculate(boolean keep){
        float payAmount=200;
        float GoldValue= Float.parseFloat(etGoldValue.getText().toString());
        float GoldWeight= Float.parseFloat(etWeight.getText().toString());
        if(keep) payAmount=85;

        float WeightPayable= GoldWeight - payAmount;
        if(WeightPayable<0) WeightPayable=0;
        float TotalGoldValue= GoldValue * GoldWeight;
        float ZakatPayable= WeightPayable * GoldValue;
        float TotalZakat= ZakatPayable * 0.025f;

        Intent intent= new Intent(this,Output.class);
        intent.putExtra("TotalGoldValue",String.format("%.2f",TotalGoldValue) );
        intent.putExtra("ZakatPayable",String.format("%.2f",ZakatPayable) );
        intent.putExtra("TotalZakat",String.format("%.2f",TotalZakat) );

        startActivity(intent);
    }
}
