package com.example.conversornumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Conversiones c = new Conversiones();
    RadioButton rd, rb, ro, rh;
    CheckBox cb, co, ch;
    int error = 0;
    EditText caja_Num, caja_B, caja_O, caja_H;
    byte punto = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd = findViewById(R.id.radio_D);
        rb = findViewById(R.id.radio_B);
        ro = findViewById(R.id.radio_O);
        rh = findViewById(R.id.radio_H);
        cb = findViewById(R.id.check_B);
        co = findViewById(R.id.check_O);
        ch = findViewById(R.id.check_H);
        caja_Num = findViewById(R.id.caja_Numero);
        caja_B = findViewById(R.id.caja_Binario);
        caja_O = findViewById(R.id.caja_Octal);
        caja_H = findViewById(R.id.caja_Hexadecimal);
    }

    public boolean validar(String N){
        error = 0;
        if(rd.isChecked()){
            for (int i = 0; i<N.length(); i++){
                if(!(N.charAt(i)=='0' || N.charAt(i)=='1' || N.charAt(i)=='2' || N.charAt(i)=='3' || N.charAt(i)=='4' || N.charAt(i)=='5' || N.charAt(i)=='6' || N.charAt(i)=='7' || N.charAt(i)=='8' || N.charAt(i)=='9')){
                    error ++;
                }
            }
        } else if (rb.isChecked()) {
            for (int i = 0; i<N.length(); i++){
                if(!(N.charAt(i)=='0' || N.charAt(i)=='1')){
                    error ++;
                }
            }
        } else if (ro.isChecked()) {
            for (int i = 0; i<N.length(); i++){
                if(!(N.charAt(i)=='0' || N.charAt(i)=='1' || N.charAt(i)=='2' || N.charAt(i)=='3' || N.charAt(i)=='4' || N.charAt(i)=='5' || N.charAt(i)=='6' || N.charAt(i)=='7')){
                    error ++;
                }
            }
        } else if (rh.isChecked()) {
            for (int i = 0; i<N.length(); i++){
                if(!(N.charAt(i)=='0' || N.charAt(i)=='1' || N.charAt(i)=='2' || N.charAt(i)=='3' || N.charAt(i)=='4' || N.charAt(i)=='5' || N.charAt(i)=='6' || N.charAt(i)=='7' || N.charAt(i)=='8' || N.charAt(i)=='9' || N.charAt(i)=='A' || N.charAt(i)=='B' || N.charAt(i)=='C' || N.charAt(i)=='D' || N.charAt(i)=='E' || N.charAt(i)=='F')){
                    error ++;
                }
            }
        }

        if(error != 0)
            return false;
        else
            return true;
    }

    public void RadD(View v){
        if (validar(caja_Num.getText().toString())){
            if(cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(Integer.parseInt(caja_Num.getText().toString()))));

            if(co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(Integer.parseInt(caja_Num.getText().toString()))));

            if(ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(Integer.parseInt(caja_Num.getText().toString()))));
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void RadB(View v){
        if (validar(caja_Num.getText().toString())){
            if(cb.isChecked())
                caja_B.setText(caja_Num.getText().toString());

            if(co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(c.binarioADecimal(Integer.parseInt(caja_Num.getText().toString())))));

            if(ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(c.binarioADecimal(Integer.parseInt(caja_Num.getText().toString())))));
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void RadO(View v){
        if (validar(caja_Num.getText().toString())){
            if(cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(c.octalADecimal(Integer.parseInt(caja_Num.getText().toString())))));

            if(co.isChecked())
                caja_O.setText(caja_Num.getText().toString());

            if(ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(c.octalADecimal(Integer.parseInt(caja_Num.getText().toString())))));
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void RadH(View v){
        if (validar(caja_Num.getText().toString())){
            if(cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(c.hexadecimalADecimal(caja_Num.getText().toString()))));

            if(co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(c.hexadecimalADecimal(caja_Num.getText().toString()))));

            if(ch.isChecked())
                caja_H.setText(caja_Num.getText().toString());
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void CheckB(View v){
        if (validar(caja_Num.getText().toString())){
            if(rd.isChecked() && cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(Integer.parseInt(caja_Num.getText().toString()))));
            else if(rb.isChecked() && cb.isChecked())
                caja_B.setText(caja_Num.getText().toString());
            else if(ro.isChecked() && cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(c.octalADecimal(Integer.parseInt(caja_Num.getText().toString())))));
            else if(rh.isChecked() && cb.isChecked())
                caja_B.setText(String.valueOf(c.decimalABinario(c.hexadecimalADecimal(caja_Num.getText().toString()))));
            else
                caja_B.setText("");
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void CheckO(View v){
        if (validar(caja_Num.getText().toString())){
            if(rd.isChecked() && co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(Integer.parseInt(caja_Num.getText().toString()))));
            else if(rb.isChecked() && co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(c.binarioADecimal(Integer.parseInt(caja_Num.getText().toString())))));
            else if(ro.isChecked() && co.isChecked())
                caja_O.setText(caja_Num.getText().toString());
            else if(rh.isChecked() && co.isChecked())
                caja_O.setText(String.valueOf(c.decimalAOctal(c.hexadecimalADecimal(caja_Num.getText().toString()))));
            else
                caja_O.setText("");
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void CheckH(View v){
        if (validar(caja_Num.getText().toString())) {
            if (rd.isChecked() && ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(Integer.parseInt(caja_Num.getText().toString()))));
            else if (rb.isChecked() && ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(c.binarioADecimal(Integer.parseInt(caja_Num.getText().toString())))));
            else if (ro.isChecked() && ch.isChecked())
                caja_H.setText(String.valueOf(c.decimalAHexadecimal(c.octalADecimal(Integer.parseInt(caja_Num.getText().toString())))));
            else if(rh.isChecked() && ch.isChecked())
                caja_H.setText(caja_Num.getText().toString());
            else
                caja_H.setText("");
        }else{
            Toast.makeText(getBaseContext(),
                    "INGRESE UN NUMERO VALIDO PARA LA BASE"
                    ,Toast.LENGTH_LONG).show();
        }
    }
}