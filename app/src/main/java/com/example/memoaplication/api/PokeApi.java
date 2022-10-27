package com.example.memoaplication.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeApi {
    @GET("pokemon/{id}/")
    Call<PokemonResponse> getPokemonById(@Path("id") int id);

    @GET("pokemon/{name}/")
    Call<PokemonResponse> getPokemonByName(@Path("name") String name);

    @GET("pokemon")
    Call<ListPokemonResponse> getPokemonByLimit(@Query("limit") int limit);
}
