package com.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Bimal extends AppCompatActivity implements View.OnClickListener {

    private EditText etNumber;
    private Button btnConvert;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber =findViewById(R.id.etNumber);
        btnConvert =findViewById(R.id.btnConvert);
        tvResult = findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.btnConvert)
        {
            tvResult.setText(new NumberToWords_Bimal(Integer.parseInt(etNumber.getText().toString())).convert());
        }
    }
}
