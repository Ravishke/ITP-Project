package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move=findViewById(R.id.loginbtn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,OTP.class);
                startActivity(intent);
            }
        });

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        Button loginbtn= findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("10916176")) {
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}