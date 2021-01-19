package com.chinju.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText editTextNumber, editTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
    }
    public void Addition(View v){
        double n1, n2, results;
        n1 = Double.parseDouble(editTextNumber.getText().toString());
        n2 = Double.parseDouble(editTextNumber2.getText().toString());
        results= n1+n2;
        result.setText(String.valueOf(results));
    }
}