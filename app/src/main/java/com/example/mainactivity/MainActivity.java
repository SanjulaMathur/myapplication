package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText SecondNumEditText =(EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1= Integer.parseInt(firstNumEditText.getText().toString());
                int num2= Integer.parseInt(SecondNumEditText.getText().toString());
                int result= num1 + num2;
                resultTextView.setText(result +"");

            }
        });

        }
    }

