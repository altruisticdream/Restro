package com.example.restro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
   Button btnLogout;
   private TextView yourTextView;
   FirebaseAuth mFirebaseAuth;
   private FirebaseAuth.AuthStateListener mAuthStateListner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intToSignUp = new Intent(Home.this, MainActivity.class);
                startActivity(intToSignUp);

            }
        });

        yourTextView = (TextView) findViewById(R.id.textView4);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();

            }
        });
    }
    public void openActivity7()

    {
         Intent intent=new Intent(Home.this,Restaurant.class);
        startActivity(intent);
    }}