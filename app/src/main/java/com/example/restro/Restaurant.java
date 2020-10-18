package com.example.restro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Restaurant extends AppCompatActivity {
    private TextView yourtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        yourtextView=findViewById(R.id.res1);
        yourtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitynext();
            }
        });
    }
    public void openActivitynext()
    {
        Intent intent=new Intent(Restaurant.this,booktable.class);
        startActivity(intent);
    }
}