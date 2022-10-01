package com.example.memoaplication.api;

import com.google.gson.annotations.SerializedName;

public class PokemonResponse {

    @SerializedName("id")
    int id;

    @SerializedName("name")
    String name;

    @SerializedName("base_experience")
    int baseExperience;

    @SerializedName("height")
    int height;

    @SerializedName("is_default")
    boolean isDefault;

    @SerializedName("order")
    int order;

    @SerializedName("weight")
    int weight;

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
