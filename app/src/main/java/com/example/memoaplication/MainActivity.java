package com.example.memoaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.memoaplication.api.ListPokemonResponse;
import com.example.memoaplication.api.PokeApi;
import com.example.memoaplication.api.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PokeApi pokeApi = RetrofitClient.getService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecycleView);

        pokeApi.getPokemonByLimit(151).enqueue(new Callback<ListPokemonResponse>() {
            @Override
            public void onResponse(Call<ListPokemonResponse> call, Response<ListPokemonResponse> response) {
                if(response.isSuccessful()){
                    for(ListPokemonResponse.Pokemon pokemon : response.body().getPokemons()){
                        Log.d("Pokemon: ", pokemon.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<ListPokemonResponse> call, Throwable t) {

            }
        });
    }
}