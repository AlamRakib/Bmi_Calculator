package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edWeight, edfeet, edInch;
    Button buttonCalculate;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edWeight = findViewById(R.id.editWeightId);
        edfeet = findViewById(R.id.editfeetId);
        edInch = findViewById(R.id.editinchId);

        buttonCalculate = findViewById(R.id.ButtonId);
        textView = findViewById(R.id.tvresultId);



        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String SWeight = edWeight.getText().toString();
                String Sfeet = edfeet.getText().toString();
                String Sinch = edInch.getText().toString();

                float weight = Float.parseFloat(SWeight);
                float feet = Float.parseFloat(Sfeet);
                float inch = Float.parseFloat(Sinch);


                float height = (float) (feet*0.3048 + inch*0.0254);

                float bmiIndex = weight/(height*height);


                if(bmiIndex>=24)
                {
                    textView.setText("Your BMI INDEX: "+bmiIndex +"\n"+"You are overweight");

                }else if(bmiIndex>18)
                {
                    textView.setText("Your BMI INDEX: "+bmiIndex +"\n"+"You are perfect");
                }
                else{
                    textView.setText("Your BMI INDEX: "+bmiIndex +"\n"+"You are underweight");
                }







            }
        });

    }


}