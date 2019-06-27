package com.noname.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnShowToast = findViewById(R.id.btn_show_toast);

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button works fine", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                v.getContext().startActivity(intent);}


        });
    }
}
