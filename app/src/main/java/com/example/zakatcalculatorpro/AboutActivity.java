package com.example.zakatcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;


public class AboutActivity extends AppCompatActivity {

    ImageView github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutme);

        github = findViewById(R.id.githubView);

        github.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                gotoUrl("https://github.com/Izatul-Nabilah/Assigntment1");
            }

        });
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
