package com.example.professor.aula4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends Activity {

    private String compra = "";
    private double vcompra = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void voltarTela22(View v)
    {
        Intent i=new Intent(this,Main2Activity.class);

        i.putExtra("compra",compra);
        i.putExtra("vcompra",vcompra);

        startActivity(i);
    }

    public void comprar(View v)
    {
        if(v.getId() == R.id.imageView5)
        {
            compra = compra + "Beef Bacon" + "\n" ;
            vcompra = vcompra + 5.0;
        }
        else
        if(v.getId() == R.id.imageView7)
        {
            compra = compra + "BMT" + "\n";
            vcompra = vcompra + 3.0;
        }
        else
        if(v.getId() == R.id.imageView9)
        {
            compra = compra + "Frango" + "\n";
            vcompra = vcompra + 4.0;
        }
        else
        if(v.getId() == R.id.imageView12)
        {
            compra = compra + "Frango Ranch" + "\n";
            vcompra = vcompra + 4.0;
        }
        Toast.makeText(this,"compra: " + compra, Toast.LENGTH_LONG).show();
    }

}
