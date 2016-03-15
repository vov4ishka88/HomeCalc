package com.example.vlad.first_android_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import com.example.vlad.homecalc.R;


public class MyActivity extends Activity {

    TextView myText;
    Double display, number1, number2, number3;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        myText = (TextView)findViewById(R.id.textView2);
        display = 0.0;
        number1 = 0.0;
        number2 = 0.0;
        number3 = 0.0;
    }

    public void numberButtonClick(View v){
        display = display*10+Double.parseDouble(String.valueOf(((Button)v).getText()));
        myText.setText(display.toString());

    }

    public void operationButtonClick(View v){
        if (number1 == number3){
            operation = (String)((Button)v).getText();
        }else {
            number1 = display;
            operation = (String) ((Button) v).getText();
            display = 0.0;
        }
    }

    public void equalButtonClick(View v){
        number2 = display;

        //  if (!display.equals(null) && number1 == null){
        //      myText.setText("ERROR");
        //  }
        //  if (number1 == null){
        //      myText.setText(display.toString());
        //      myText.setText("ERROR");
        //  }
        //  if (number1 != null && number2 == null){myText.setText(number1.toString());}
        if(operation.equals("+")){
            number3 = number1 + number2;
        }
        if(operation.equals("-")){
            number3 = number1 - number2;
        }
        if(operation.equals("*")){
            number3 = number1 * number2;
        }
        if(operation.equals("/")){
            number3 = number1 / number2;
        }
        myText.setText(number3.toString());
        number1 = number3;
        display = 0.0;
    }

    public void deleteButtonClick(View v){

        display = 0.0;
        number1 = 0.0;
        number2 = 0.0;
        number3 = 0.0;
        myText.setText(display.toString());
    }
}
