package com.example.memoaplication.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApi {
    @GET("pokemon/{id}/")
    Call<PokemonResponse> getPokemonById(@Path("id") int id);

    @GET("pokemon/{id}/")
    Call<PokemonResponse> getPokemonByName(@Path("name") String name);

}
