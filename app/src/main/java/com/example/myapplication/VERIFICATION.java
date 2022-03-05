package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class VERIFICATION extends AppCompatActivity {

    private EditText code1, code2, code3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        TextView textmobile = findViewById(R.id.mobile);
        textmobile.setText(String.format(
               "+44-%s" , getIntent().getStringExtra("mobile")
        ));


        code1 = findViewById(R.id.code1);
        code2 = findViewById(R.id.code2);
        code3 = findViewById(R.id.code3);

        setupOTPInputs();

    }

    private void setupOTPInputs(){
        code1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                       if(super.toString().trim().isEmpty()){
                           code2.requestFocus();
                       }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        code2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(super.toString().trim().isEmpty()){
                    code3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

}