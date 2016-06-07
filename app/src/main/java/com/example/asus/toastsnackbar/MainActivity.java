package com.example.asus.toastsnackbar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //snackbar: adicionar antes dependência no arquivo build.gradle->ver versão do Supporte.Library no SDK Manager

        Snackbar.make(findViewById(android.R.id.content), "Mensagem!", Snackbar.LENGTH_LONG)
                .setAction("Açao", null)
                .show();

        Toast toast = Toast.makeText(MainActivity.this, "teste", Toast.LENGTH_LONG);
        toast.show();
        //ou
        Toast.makeText(this, "teste2", Toast.LENGTH_LONG);
        //ou
        Toast.makeText(MainActivity.this, "teste3", Toast.LENGTH_LONG);
        //ou
        Toast.makeText(getBaseContext(), "teste4", Toast.LENGTH_LONG);
        //ou
        Context contexto = getApplication();
        Toast.makeText(contexto, "teste5", Toast.LENGTH_LONG);

    }


}
