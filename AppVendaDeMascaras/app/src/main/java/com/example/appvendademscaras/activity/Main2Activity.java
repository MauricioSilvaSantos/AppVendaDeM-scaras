package com.example.appvendademscaras.activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.appvendademscaras.R;
import com.example.appvendademscaras.adapter.AdapterPostagens;
import com.example.appvendademscaras.model.ModelPostagem;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<ModelPostagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerPostagens);

        Intent intent = new Intent();
        //Configurando o RecycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Configurando o Adapter
        preparandoPostagens();
        AdapterPostagens adapter = new AdapterPostagens(postagens);
        recyclerView.setAdapter(adapter);

    }
    public  void preparandoPostagens(){

        ModelPostagem post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.image6);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.image1);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.image2);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.image4);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.mascaras1);
        this.postagens.add(post);

        post = new ModelPostagem(" Máscara Adulto ", "Descrição: Máscara Masculina Adulto, Tecido Tricoline Lavável",R.drawable.mascarasfeline);
        this.postagens.add(post);
    }
    private EditText editText;
    private TextView textView;
    int numero;

    public void clickAqui(View view){
        editText = findViewById(R.id.edtQuantidade);
        textView = findViewById(R.id.txtResulte);

        numero = Integer.parseInt(editText.getText().toString());
        int soma = 5*numero;
        textView.setText("A Total é :R$"+soma);
    }

}
