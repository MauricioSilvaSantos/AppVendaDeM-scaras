package com.example.appvendademscaras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.appvendademscaras.Par1";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edtName);


    }

    public void OnClick (View view){

        //Adicionando Intent.
        Intent intentObj = new Intent(MainActivity.this, Main2Activity.class);
        intentObj.putExtra(EXTRA_MESSAGE, editText.getText().toString());
        startActivity(intentObj);
    }
}
