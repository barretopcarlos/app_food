package com.example.professor.aula4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends Activity {


    private String compraTotal = "";
    private double vcompraTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(getIntent().getExtras()!=null)
        {
            compraTotal = compraTotal + getIntent().getExtras().getString("compra");
            vcompraTotal = vcompraTotal + getIntent().getExtras().getDouble("vcompra");
        }
    }

    public void trocarTela2(View v)
    {
        Intent i=new Intent(this,Main3Activity.class);
        Integer teste=3;
        i.putExtra("bebida",teste);
        startActivity(i);
    }

    public void trocarTela3(View v)
    {
        Intent i=new Intent(this,Main4Activity.class);

        startActivity(i);
    }

    public void checkOut(View v)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Checkout");
        b.setMessage("compra: " + compraTotal + "Valor: " + "\n" + vcompraTotal);
        b.setNegativeButton("Cancelar Pedido", null);
        b.setPositiveButton("Enviar Pedido", null);
        b.create().show();
    }


}
