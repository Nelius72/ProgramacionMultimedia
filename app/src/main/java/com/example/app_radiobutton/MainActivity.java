package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private RadioButton sumar, restar;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.editTextNumber);
        num2=(EditText) findViewById(R.id.editTextNumber2);
        sumar=(RadioButton) findViewById(R.id.radioButtonSumar);
        restar=(RadioButton) findViewById(R.id.radioButtonRestar);
        resultado=(TextView) findViewById(R.id.textView);


    }

    //Metodo para calcular
    public void Calcular(View view){

        String numero1_string=num1.getText().toString();
        String numero2_string=num2.getText().toString();

        int num1_int=Integer.parseInt(numero1_string);
        int num2_int=Integer.parseInt(numero2_string);

        if(sumar.isChecked()==true){

            int suma=num1_int+num2_int;
            resultado.setText("El Resultado de la suma es: "+suma);

        }if(restar.isChecked()==true){

            int resta=num1_int-num2_int;
            resultado.setText("El Resultado de la resta es: "+resta);

        }




    }


}