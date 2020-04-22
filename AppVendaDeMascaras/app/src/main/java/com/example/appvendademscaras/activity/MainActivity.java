package com.example.appvendademscaras.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.appvendademscaras.R;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.appvendademscaras.Par1";
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edtName);
        textView =  findViewById(R.id.txtErro);

    }

    public void OnClick(View view) {

        String nome = editText.getText().toString();

        //Verificando se campos foram preenchidos.
        Boolean validandoCampo = ValidarCampos(nome);
        if (validandoCampo) {

            //Adicionando Intent.
            Intent intentObj = new Intent(MainActivity.this, Main2Activity.class);
            intentObj.putExtra(EXTRA_MESSAGE, nome);
            startActivity(intentObj);

        } else {
            textView.setText("Esqueceu seu Nome!");
        }
    }

    public Boolean ValidarCampos(String nome) {

        Boolean validarCampo = true;
        if (nome == null || nome.equals("")) {
            validarCampo = false;

        }
        return validarCampo;
    }
}




