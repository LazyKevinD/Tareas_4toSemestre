package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    DecimalFormat decimalFormat = new DecimalFormat("#.######");
    EditText cajaResultados;
    double num1, num2;
    byte cpunto = 0, sim = 0, sim2 = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaResultados = findViewById(R.id.caja_Resultados);
    }

    public void Num0(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("0");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "0");
        }
    }

    public void Num1(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("1");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "1");
        }
    }

    public void Num2(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("2");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "2");
        }
    }

    public void Num3(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("3");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "3");
        }
    }

    public void Num4(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("4");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "4");
        }
    }

    public void Num5(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("5");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "5");
        }
    }

    public void Num6(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("6");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "6");
        }
    }

    public void Num7(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("7");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "7");
        }
    }

    public void Num8(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("8");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "8");
        }
    }

    public void Num9(View v) {
        if (cajaResultados.getText().toString().equals("") || cajaResultados.getText().toString().equals("0")) {
            cajaResultados.setText("9");
        } else {
            cajaResultados.setText(cajaResultados.getText() + "9");
        }
    }

    public void Punto(View v) {
        if (cpunto == 0) {
            cajaResultados.setText(cajaResultados.getText() + ".");
            cpunto = 1;
        }
    }

    public void Simbolo(View v) {
        num2 = Double.parseDouble(cajaResultados.getText().toString());
        num2 = num2 * -1;
        cajaResultados.setText(decimalFormat.format(num2));
    }

    public void Borrar(View v) {
        if(cajaResultados.getText().length() > 1 && cajaResultados.getText().toString() != "0") {
            cajaResultados.setText(cajaResultados.getText().toString().substring(0, cajaResultados.getText().length()-1));
        }else if(cajaResultados.getText().length() == 1){
            cajaResultados.setText("0");
        }
    }

    public void igual(View v) {
        if(sim != 0) {
            operBas();
            sim = 0;
        }
    }

    public void suma(View v) {
        operBas();
        sim = 1;
        cajaResultados.setText("0");
    }

    public void resta(View v) {
        operBas();
        sim = 2;
        cajaResultados.setText("0");
    }

    public void multi(View v) {
        operBas();
        sim = 3;
        cajaResultados.setText("0");
    }

    public void divi(View v) {
        operBas();
        sim = 4;
        cajaResultados.setText("0");
    }

    public void sqrt(View v) {
        sim2 = sim;
        sim = 6;
        operBas();
        sim = sim2;
    }

    public void pot2(View v) {
        sim2 = sim;
        sim = 7;
        operBas();
        sim = sim2;
    }

    public void potNeg(View v) {
        sim2 = sim;
        sim = 8;
        operBas();
        sim = sim2;
    }

    public void porcen(View v) {
        sim2 = sim;
        sim = 5;
        operBas();
        sim = sim2;
    }

    public void CE(View v) {
        cajaResultados.setText("0");
        sim = 0;
        sim2 = 0;
        cpunto = 0;
        num1 = 0.0;
        num2 = 0.0;
    }

    public void operBas() {
        switch(sim) {
            case 0:
                num1 = Double.parseDouble(cajaResultados.getText().toString());
                cajaResultados.setText("0");
                break;
            case 1:
                num2 = Double.parseDouble(cajaResultados.getText().toString());
                num1 = num1 + num2;
                cajaResultados.setText(decimalFormat.format(num1));
                break;
            case 2:
                num2 = Double.parseDouble(cajaResultados.getText().toString());
                num1 = num1 - num2;
                cajaResultados.setText(decimalFormat.format(num1));
                break;
            case 3:
                num2 = Double.parseDouble(cajaResultados.getText().toString());
                num1 = num1 * num2;
                cajaResultados.setText(decimalFormat.format(num1));
                break;
            case 4:
                if(cajaResultados.getText().toString().equals("0")) {
                    Toast.makeText(getBaseContext(),
                            "No se puede dividir entre 0"
                            ,Toast.LENGTH_LONG).show();
                }else {
                    num2 = Double.parseDouble(cajaResultados.getText().toString());
                    num1 = num1 / num2;
                    cajaResultados.setText(decimalFormat.format(num1));
                }
                break;
            case 5:
                cajaResultados.setText(decimalFormat.format(Double.parseDouble(cajaResultados.getText().toString())/100.0));
                break;
            case 6:
                if(cajaResultados.getText().toString().charAt(0)=='-') {
                    Toast.makeText(getBaseContext(),
                        "No existes las raices cuadradas de numeros negativos"
                        ,Toast.LENGTH_LONG).show();
                }else {
                    cajaResultados.setText(decimalFormat.format(Math.sqrt(Double.parseDouble(cajaResultados.getText().toString()))));
                }
                break;
            case 7:
                cajaResultados.setText(decimalFormat.format(Math.pow(Double.parseDouble(cajaResultados.getText().toString()),2)));
                break;
            case 8:
                if(cajaResultados.getText().toString().equals("0")) {
                    Toast.makeText(getBaseContext(),
                            "No se puede dividir entre cero"
                            ,Toast.LENGTH_LONG).show();
                }else {
                    cajaResultados.setText(decimalFormat.format(Math.pow(Double.parseDouble(cajaResultados.getText().toString()),-1)));
                }
                break;
        }
    }
}