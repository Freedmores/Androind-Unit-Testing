package com.sidume.freedmores.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    private EditText text;
    private RadioButton btnCelsius,btnFahrenheit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.editTextInputValue);
        btnCelsius = (RadioButton) findViewById(R.id.radio0);
        btnFahrenheit = (RadioButton) findViewById(R.id.radio1);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                if(TextUtils.isEmpty(text.getText().toString())){
                    text.setError("Please Enter A valid Number");
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if(btnCelsius.isChecked()){
                    text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelcius(inputValue)));
                    btnCelsius.setChecked(false);
                    btnFahrenheit.setChecked(true);
                }else {
                    text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                    btnCelsius.setChecked(true);
                    btnFahrenheit.setChecked(false);
                }
                break;
        }
    }
}
