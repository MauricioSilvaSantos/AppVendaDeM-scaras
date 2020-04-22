package com.example.appvendademscaras.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.appvendademscaras.R;
import com.example.appvendademscaras.model.ModelPostagem;
import java.util.List;

public class AdapterPostagens extends RecyclerView.Adapter<AdapterPostagens.MyViewHolder> {

    private List<ModelPostagem> postagens;

    public AdapterPostagens(List<ModelPostagem> listaPostagem) {
        this.postagens = listaPostagem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhada, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModelPostagem postagem = postagens.get(position);
        holder.titulo.setText(postagem.getNome());
        holder.descricao.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImage());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView descricao;
        private EditText quantidade;
        private ImageView imagem;
        private Button button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txtTitulo);
            descricao = itemView.findViewById(R.id.txtDescricao);
            quantidade = itemView.findViewById(R.id.edtQuantidade);
            imagem= itemView.findViewById(R.id.imagePostagem);
            button = itemView.findViewById(R.id.btnCalculo);

        }

    }

}
