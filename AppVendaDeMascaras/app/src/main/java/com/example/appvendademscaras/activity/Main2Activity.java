package com.example.appvendademscaras.activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebStorage;
import android.widget.EditText;
import android.widget.TextView;
import com.example.appvendademscaras.R;
import com.example.appvendademscaras.adapter.AdapterPostagens;
import com.example.appvendademscaras.model.ModelPostagem;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText editText;
    private TextView textView;
    private TextView txtView;

    int numero;

    private List<ModelPostagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerPostagens);
        txtView = findViewById(R.id.txtName);


        //Configurando Intent
        Intent OriginIntent = getIntent();
        if (OriginIntent.hasExtra(MainActivity.EXTRA_MESSAGE)) {

         txtView.setText("Olá " +OriginIntent.getStringExtra(MainActivity.EXTRA_MESSAGE)+" Escolha sua máscara e se Proteja!");
        }

        //Configurando o RecycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Configurando o Adapter
        preparandoPostagens();
        AdapterPostagens adapter = new AdapterPostagens(postagens);
        recyclerView.setAdapter(adapter);

    }
    public  void preparandoPostagens(){

        ModelPostagem post = new ModelPostagem(" Par de Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.image6);
        this.postagens.add(post);

        post = new ModelPostagem(" Conjunto de Máscaras Adulto ", "Descrição: Máscara Masculina e Femenina Adulto, Tecido Tricoline Lavável, ",R.drawable.image1);
        this.postagens.add(post);

        post = new ModelPostagem(" Conjunto de Máscara Adulto ", "Descrição: Máscara Masculina e Femenina Adulto, Tecido Tricoline Lavável",R.drawable.image2);
        this.postagens.add(post);

        post = new ModelPostagem(" Quatro Máscaras Adulto ", "Descrição: Máscara Unisex Adulto, Tecido Tricoline Lavável",R.drawable.image4);
        this.postagens.add(post);

        post = new ModelPostagem(" Conjunto de Máscaras Infantil ", "Descrição: Máscara Unisex Infantil, Tecido Tricoline Lavável",R.drawable.mascaras1);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscaras para Adolencente  ", "Descrição: Máscara Masculina , Tecido Tricoline Lavável",R.drawable.mascarasfeline);
        this.postagens.add(post);
    }


    public void clickAqui(View view) {
        editText = findViewById(R.id.edtQuantidade);
        textView = findViewById(R.id.txtResulte);

        numero = Integer.parseInt(editText.getText().toString());
        int soma = 5 * numero;

        if (numero >= 1 && numero <=9) {
            textView.setText("Valor é :R$" +soma);
        }
        else if (numero >= 10 && numero <=19) {
            textView.setText(" Total é :R$" +(soma - (soma *0.10)));

        }else if (numero >= 20 &&  numero <= 29) {
            textView.setText("Valor é :R$" + (soma - (soma *0.15)));

        }else if (numero >= 30 && numero <=49) {
            textView.setText("Valor é :R$" + (soma - (soma *0.20)));

        }else if (numero >= 50) {
            textView.setText("Valor é :R$" + (soma - (soma *0.25)));
        }
    }

    public void cclickAqui (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://saude.gov.br"));
        startActivity(intent);

    }

}
