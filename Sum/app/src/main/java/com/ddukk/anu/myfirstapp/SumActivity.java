package com.ddukk.anu.myfirstapp;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    Button sum;
    EditText numberOne;
    EditText numberTwo;

    TextView resultText;

    int one,two,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        sum = (Button)findViewById(R.id.buttonSum);

        numberOne = (EditText)findViewById(R.id.editTextOne);
        numberTwo = (EditText)findViewById(R.id.editTextTwo);

        resultText = (TextView)findViewById(R.id.textViewResult);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                one = Integer.parseInt(numberOne.getText().toString());
                two = Integer.parseInt(numberTwo.getText().toString());

                result = one + two;

                resultText.setText(Integer.toString(result));


            }
        });



    }
}
