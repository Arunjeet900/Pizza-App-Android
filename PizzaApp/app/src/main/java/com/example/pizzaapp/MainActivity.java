package com.example.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spinner;
    RadioButton rbs,rbm,rbl,rbxl,rbpck,rbdel;
    CheckBox cbchk,cbbeef,cbpine,cbpepp,cbdrink;


    double prices[]= {9,10,8,8.5,9.5};
    static int i;
    EditText edTotal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbchk = findViewById(R.id.cb1);
        cbchk.setOnClickListener(this);

        cbbeef= findViewById(R.id.cb2);
        cbbeef.setOnClickListener(this);

        cbpine= findViewById(R.id.cb3);
        cbpine.setOnClickListener(this);

        cbpepp= findViewById(R.id.cb4);
        cbpepp.setOnClickListener(this);

        cbdrink= findViewById(R.id.cb5);
        cbdrink.setOnClickListener(this);

    }

    //on selectedItem method
    // i = position

    @Override
    public void onClick(View v) {

        double price = Double.parseDouble(edTotal.getText().toString());

        switch(v.getId()){
            case R.id.cb1:
                if(cbchk.isChecked())
                    price += 1;
                else price -= 1;
                        break;
            case R.id.cb2:
                if(cbbeef.isChecked())
                    price +=1;
                else price -=1;
                break;
            case R.id.cb3:
                if(cbpine.isChecked())
                    price +=1;
                else price -=1;
                break;
            case R.id.cb4:
                if(cbpepp.isChecked())
                    price +=1;
                else price -=1;
                break;
            case R.id.cb5:
                if(cbdrink.isChecked())
                    price +=3;
                else price -=3;
                break;
                }
        }
    }




















//    public void radioClicked(View view) {
//
//      boolean checked= (RadioButton) view).isChecked();
//
//     switch (view.getId()){
//         case R.id.rbs:
//             if(checked)
//                 pizza.setPizza_size_price(9);
//             break;
//         case R.id.rbm:
//             if(checked)
//                 pizza.setPizza_size_price(10);
//             break;
//         case R.id.rbl:
//             if(checked)
//                 pizza.setPizza_size_price(11);
//             break;
//         case R.id.rbxl:
//             if(checked)
//                 pizza.setPizza_size_price(12);
//             break;
//
//     }
//     total.setText("Total Price:" + pizza.getPizza_set_price());
//
//
//    }



