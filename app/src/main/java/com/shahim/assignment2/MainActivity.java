package com.shahim.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultView;
    String operator = "+";
    String oldNumber= "";
    boolean newOperator = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView=findViewById(R.id.resultViewBox);
    }
    public void onClickNumber(View view){
        if(newOperator)
            resultView.setText("");
        newOperator = false;
        String number = resultView.getText().toString();
        switch(view.getId()){
            case R.id.btn7:
                number += "7";
                break;
            case R.id.btn8:
                number += "8";
                break;
            case R.id.btn9:
                number += "9";
                break;
            case R.id.btn4:
                number += "4";
                break;
            case R.id.btn5:
                number += "5";
                break;
            case R.id.btn6:
                number += "6";
                break;
            case R.id.btn1:
                number += "1";
                break;
            case R.id.btn2:
                number += "2";
                break;
            case R.id.btn3:
                number += "3";
                break;
            case R.id.btn0:
                number += "0";
                break;
        }
        resultView.setText(number);
    }

    public void onClickClear(View view) {
        resultView.setText("0");
        newOperator = true;
    }

    public void onClickOperator(View view) {
        newOperator = true;
        oldNumber = resultView.getText().toString();
        switch (view.getId()){
            case R.id.btnPlus:
                operator = "+";
                break;
            case R.id.btnMinus:
                operator = "-";
                break;
            case R.id.btnMulti:
                operator = "x";
                break;
            case R.id.btnDiv:
                operator = "÷";
                break;
        }
    }

    public void onClickEqual(View view) {
        String newNumber = resultView.getText().toString();
        int result = 0;
        switch (operator){
            case "+":
                result = (int) (Double.parseDouble(oldNumber) + Double.parseDouble(newNumber));
                break;
            case "-":
                result = (int) (Double.parseDouble(oldNumber) - Double.parseDouble(newNumber));
                break;
            case "x":
                result = (int) (Double.parseDouble(oldNumber) * Double.parseDouble(newNumber));
                break;
            case "÷":
                result = (int) (Double.parseDouble(oldNumber) / Double.parseDouble(newNumber));
                break;
        }
        resultView.setText(result+"");
    }
}


