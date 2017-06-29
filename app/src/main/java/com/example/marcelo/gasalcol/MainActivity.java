package com.example.marcelo.gasalcol;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double gas, alc, res, valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final EditText edt1 = (EditText)findViewById(R.id.campogas);
    final EditText edt2 = (EditText)findViewById(R.id.campoalc);
    final Button bt1 =(Button)findViewById(R.id.bt1);
       bt1.setOnClickListener(new Button.OnClickListener(){
       @Override
       public void onClick(View v) {
           gas = Double.parseDouble(edt1.getText().toString());
           alc = Double.parseDouble(edt2.getText().toString());
           res = gas*0.7;
           if(alc <= res){
               Toast.makeText(MainActivity.this,
                       "Álcool",
                       Toast.LENGTH_SHORT).show();
           }else{

               Toast.makeText(MainActivity.this,
                       "Gasolina",
                       Toast.LENGTH_SHORT).show();
           }

       }

        });

        final Button btlimpar = (Button)findViewById(R.id.btlimpar);
        btlimpar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
            }

        });


    }
}
