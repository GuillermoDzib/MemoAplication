package com.example.memoaplication.models;

import com.example.memoaplication.api.PokemonResponse;
import com.google.gson.annotations.SerializedName;

public class Pokemon {
    int id;
    String name;
    int baseExperience;
    int height;
    boolean isDefault;
    int order;
    int weight;

    public Pokemon(String name) {
        this.name = name;
    }

    public Pokemon(PokemonResponse response) {
        this.name = response.getName();
        this.id = response.getId();
        this.baseExperience = response.getBaseExperience();
        this.height = response.getHeight();
        this.isDefault = response.isDefault();
        this.order = response.getOrder();
        this.weight = response.getWeight();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
