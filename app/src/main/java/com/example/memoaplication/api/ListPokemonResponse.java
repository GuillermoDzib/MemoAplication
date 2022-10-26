package com.example.memoaplication.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ListPokemonResponse {

    @SerializedName("results")
    List<Pokemon> pokemons = new ArrayList<>();


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public class Pokemon {
        @SerializedName("name")
        String name;
        @SerializedName("url")
        String URL;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getURL() {
            return URL;
        }

        public void setURL(String URL) {
            this.URL = URL;
        }
    }
}



