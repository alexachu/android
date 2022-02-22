package com.example.sjcet.simcal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText opr1,opr2;
    Button btnadd,btnsub,btnmu,btndiv;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText) findViewById(R.id.et1);
        opr2 = (EditText) findViewById(R.id.et2);
        btnadd = (Button) findViewById(R.id.bt1);
        btnsub = (Button) findViewById(R.id.bt2);
        btnmu = (Button) findViewById(R.id.bt3);
        btndiv = (Button) findViewById(R.id.bt4);
        txtresult= (TextView) findViewById(R.id.tv1);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));

            }
        });
        btnmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double oper1 = Double.parseDouble(opr1.getText().toString());
                double oper2 = Double.parseDouble(opr2.getText().toString());
                double result = oper1 * oper2;
                txtresult.setText(Double.toString(result));

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double oper1 = Double.parseDouble(opr1.getText().toString());
                double oper2 = Double.parseDouble(opr2.getText().toString());
                double result = oper1 / oper2;
                txtresult.setText(Double.toString(result));

            }
        });
    }
}
