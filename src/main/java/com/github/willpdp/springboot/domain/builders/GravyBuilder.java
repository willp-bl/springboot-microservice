package com.github.willpdp.springboot.domain.builders;

import com.github.willpdp.springboot.domain.GravyDto;

public class GravyBuilder {

    private String food = "everything";

    private GravyBuilder() { }

    public static GravyBuilder aGravyBuilder() {
        return new GravyBuilder();
    }

    public GravyBuilder forFood(String food) {
        this.food = food;
        return this;
    }

    public GravyDto build() {
        return new GravyDto(food);
    }
}
