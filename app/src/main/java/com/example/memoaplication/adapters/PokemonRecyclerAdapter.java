package com.example.memoaplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memoaplication.R;
import com.example.memoaplication.models.Pokemon;
import java.util.ArrayList;
import java.util.List;

public class PokemonRecyclerAdapter extends RecyclerView.Adapter {
    private List<Pokemon> pokemons = new ArrayList<>();

    public PokemonRecyclerAdapter(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,
                        parent,
                        false);
        return new PokemonHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((PokemonHolder)holder).setPokemon(pokemons.get(position));
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }


    public class PokemonHolder extends RecyclerView.ViewHolder {

        //Se declaran todos los elementos del XML
        private TextView name;

        public PokemonHolder(@NonNull View itemView) {
            super(itemView);
            //Se inicilaizan todos los elementos del XML
            name = itemView.findViewById(R.id.name);
        }

        public void setPokemon(Pokemon pokemon){
            //Le asigna un valor a cada elemento del XML
            name.setText(pokemon.getName());
        }
    }
}
