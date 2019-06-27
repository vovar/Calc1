package com.noname.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<IamgeButton> extends AppCompatActivity implements View.OnClickListener {

    // Declare our variables
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnC, btnPlusMinus, btnPercent, btnDivide, btnMultiply, btnMinus, btnPlus, btnEqual, btnDot;
    EditText display;
    double firstNum;
    double secondNum;
    String operator;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize our variables
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnC = findViewById(R.id.btn_c);
        btnPlusMinus = findViewById(R.id.btn_plus_minus);
        btnPercent = findViewById(R.id.btn_percent);
        btnDivide = findViewById(R.id.btn_divide);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnMinus = findViewById(R.id.btn_minus);
        btnPlus = findViewById(R.id.btn_plus);
        btnEqual = findViewById(R.id.btn_equal);
        btnDot = findViewById(R.id.btn_dot);
        display = findViewById(R.id.text_display);
        imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                view.getContext().startActivity(intent);}
        });


//        // First way to do onClick Listener
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                display.append("1");
//                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
//            }
//        });

        // Second way to do onClick Listener
            // first implements View.OnClickListener on the class
            // override the required onClick method
            // set the variables onClickListener to this
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onClick(View view) {
        String string = display.getText().toString();
        switch (view.getId()) {
            case R.id.btn_1:
                display.setText(string + btn1.getText());
                break;
            case R.id.btn_2:
                display.setText(string + btn2.getText());
                break;
            case R.id.btn_3:
                display.setText(string + btn3.getText());
                break;
            case R.id.btn_4:
                display.setText(string + btn4.getText());
                break;
            case R.id.btn_5:
                display.setText(string + btn5.getText());
                break;
            case R.id.btn_6:
                display.setText(string + btn6.getText());
                break;
            case R.id.btn_7:
                display.setText(string + btn7.getText());
                break;
            case R.id.btn_8:
                display.setText(string + btn8.getText());
                break;
            case R.id.btn_9:
                display.setText(string + btn9.getText());
                break;
            case R.id.btn_0:
                display.setText(string + btn0.getText());
                break;
            case R.id.btn_c:
                display.setText("");
                break;
            case R.id.btn_plus:
                operator = "+";
                firstNum = Double.parseDouble(display.getText().toString());
                display.setText("");
                break;
            case R.id.btn_minus:
                operator = "-";
                firstNum = Double.parseDouble(display.getText().toString());
                display.setText("");
                break;
            case R.id.btn_multiply:
                operator = "X";
                firstNum = Double.parseDouble(display.getText().toString());
                display.setText("");
                break;
            case R.id.btn_divide:
                operator = "/";
                firstNum = Double.parseDouble(display.getText().toString());
                display.setText("");
                break;
            case R.id.btn_equal:
                secondNum = Double.parseDouble(display.getText().toString());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstNum + secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    case "X":
                        result = firstNum * secondNum;
                        break;
                    case "/":
                        result = firstNum / secondNum;
                        break;
                }
                display.setText(result + "");
    }
}}
