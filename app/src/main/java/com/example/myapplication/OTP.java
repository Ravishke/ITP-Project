package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.VerifiedInputEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OTP extends AppCompatActivity {
    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        move=findViewById(R.id.loginbtn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(OTP.this,VERIFICATION.class);
                startActivity(intent);
            }
        });

   final EditText inputMobile = findViewById(R.id.mobile);
   Button buttonGetOTP = findViewById(R.id.button);

   buttonGetOTP.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           if(inputMobile.getText().toString().trim().isEmpty()){
               Toast.makeText(OTP.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
               return;
           }

       }
   });

    }
}