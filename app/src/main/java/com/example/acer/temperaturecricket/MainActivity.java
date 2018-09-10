package com.example.acer.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPar;
    TextView tvResult;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       etPar = findViewById(R.id.etPar);
       tvResult = findViewById(R.id.tvResult);
       btnCal = findViewById(R.id.btnCal);

       btnCal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int tempNum = Integer.parseInt(etPar.getText().toString());
               double res = tempNum/3 +4;
               String text = "The approximate temperature outside is "+ res + " degree Celcius";
               tvResult.setText(text);
           }
       });

    }
}
