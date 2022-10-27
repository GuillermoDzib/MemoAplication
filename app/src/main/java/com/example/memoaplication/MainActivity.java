package com.example.memoaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.memoaplication.adapters.PokemonRecyclerAdapter;
import com.example.memoaplication.api.ListPokemonResponse;
import com.example.memoaplication.api.PokeApi;
import com.example.memoaplication.api.PokemonResponse;
import com.example.memoaplication.api.RetrofitClient;
import com.example.memoaplication.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PokeApi pokeApi = RetrofitClient.getService();

    private List<Pokemon> pokemons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecycleView);
        PokemonRecyclerAdapter adapter = new PokemonRecyclerAdapter(pokemons);
        recyclerView.setAdapter(adapter);

        pokeApi.getPokemonByLimit(151).enqueue(new Callback<ListPokemonResponse>() {
            @Override
            public void onResponse(Call<ListPokemonResponse> call, Response<ListPokemonResponse> response) {
                if(response.isSuccessful()){
                    for(ListPokemonResponse.Pokemon pokemon : response.body().getPokemons()){

                       pokeApi.getPokemonByName(pokemon.getName()).enqueue(new Callback<PokemonResponse>() {
                           @Override
                           public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                               if (response.isSuccessful()){
                                   pokemons.add(new Pokemon(response.body()));
                               }
                               adapter.notifyDataSetChanged();
                           }

                           @Override
                           public void onFailure(Call<PokemonResponse> call, Throwable t) {

                           }
                       });
                    }
                }
            }

            @Override
            public void onFailure(Call<ListPokemonResponse> call, Throwable t) {

            }
        });
    }
}