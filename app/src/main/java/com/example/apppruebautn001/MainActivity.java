package com.example.apppruebautn001;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView lblMensaje;
    EditText txtNum1;
    EditText txtNum2;
    Button btnResultado;
    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDivision;
    float resultado;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblMensaje = findViewById(R.id.lblMensaje);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        btnResultado = findViewById(R.id.btnResultado);


    }

    public void btnSuma_OnClick(View v) {
        operacion = "suma";
    }

    public void btnResta_OnClick(View v) {
        operacion = "resta";
    }

    public void btnMultiplicacion_OnClick(View v) {
        operacion = "multiplicacion";
    }

    public void btnDivision_OnClick(View v) {
        operacion = "division";
    }

    public void btnResultado_OnClick(View v) {

            float num1 = Float.parseFloat(txtNum1.getText().toString());
            float num2 = Float.parseFloat(txtNum2.getText().toString());
           if(operacion=="suma"){
               resultado=num1+num2;
               lblMensaje.setText(resultado+"");
           }
           else if(operacion=="resta"){
               resultado=num1-num2;
               lblMensaje.setText(resultado+"");
           }
           else if(operacion=="multiplicacion"){


                   resultado=num1*num2;
                   lblMensaje.setText(resultado+"");

           }
           else if(operacion=="division"){

                   resultado=num1/num2;
                   lblMensaje.setText(resultado+"");

           }

        }

}