package com.example.professor.aula4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends Activity {

    private String compra = "";
    private double vcompra = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void voltarTela2(View v)
    {
        Intent i=new Intent(this,Main2Activity.class);

        i.putExtra("compra",compra);
        i.putExtra("vcompra",vcompra);
        //i.puExtra: função pegas as informações armazenadas na tela 3 e volta para a tela 2 com a função voltarTela2

        startActivity(i);
    }

    public void comprar(View v)
    {
        if(v.getId() == R.id.imageView5)
            {
                compra = compra + "coca-cola" + "\n" ;
                vcompra = vcompra + 5.0;
            }
        else
            if(v.getId() == R.id.imageView7)
            {
                compra = compra + "agua" + "\n";
                vcompra = vcompra + 3.0;
            }
        else
            if(v.getId() == R.id.imageView9)
            {
                compra = compra + "suco" + "\n";
                vcompra = vcompra + 4.0;
            }
        Toast.makeText(this,"compra: " + compra, Toast.LENGTH_LONG).show();
    }


}
