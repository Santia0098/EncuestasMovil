package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button inicio;
    private EditText correo;
    private EditText contrasena;
    private TextView registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registro = (TextView) findViewById(R.id.lbl_registro);
        inicio = (Button) findViewById(R.id.btn_iniciar);
        correo = (EditText) findViewById(R.id.tv_correo);
        contrasena = (EditText) findViewById(R.id.tv_pass);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, registro.class);
                startActivity(i);
            }
        });
    }
}