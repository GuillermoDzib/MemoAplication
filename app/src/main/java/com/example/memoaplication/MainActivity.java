package com.example.memoaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.memoaplication.api.PokeApi;
import com.example.memoaplication.api.PokemonResponse;
import com.example.memoaplication.api.RetrofitClient;

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
        pokeApi.getPokemonById(146).enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                if(response.isSuccessful()){
                    Log.d("Pokemon", response.body().getName());
                }else{

                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {

            }
        });

    }
}