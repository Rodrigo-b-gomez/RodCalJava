package com.example.rcaljava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bsum, bres, bmul, bdiv, bdot, bc, bigual;
    TextView resultado;
    double val1, val2;
    boolean suma, resta, multi, divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);
        b0 = findViewById(R.id.bt0);
        bsum = findViewById(R.id.btmas);
        bres = findViewById(R.id.btmenos);
        bmul = findViewById(R.id.btx);
        bdiv = findViewById(R.id.btdiv);
        bdot = findViewById(R.id.btpunto);
        bc = findViewById(R.id.btb);
        bigual = findViewById(R.id.btigual);

        resultado = findViewById(R.id.resultado);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultado.setText(resultado.getText()+".");
            }
        });
        bsum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val1=Double.parseDouble(resultado.getText()+"");
                suma=true;
                resultado.setText(null);
            }
        });
        bres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val1=Double.parseDouble(resultado.getText()+"");
                resta=true;
                resultado.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val1=Double.parseDouble(resultado.getText()+"");
                multi=true;
                resultado.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val1=Double.parseDouble(resultado.getText()+"");
                divi=true;
                resultado.setText(null);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
            }
        });
        bigual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val2=Double.parseDouble(resultado.getText()+"");
                    if (suma==true){
                        resultado.setText(val1+val2+"");
                        suma=false;
                    }
                    if (resta==true){
                        resultado.setText(val1-val2+"");
                        resta=false;
                    }
                    if (multi==true){
                        resultado.setText(val1*val2+"");
                        multi=false;
                    }
                    if (divi==true){
                        resultado.setText(val1/val2+"");
                        divi=false;
                    }
                }
            }
        );
    }
}
