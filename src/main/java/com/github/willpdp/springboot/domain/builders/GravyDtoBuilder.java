package com.github.willpdp.springboot.domain.builders;

import com.github.willpdp.springboot.domain.GravyDto;

public class GravyDtoBuilder {

    private String food = "everything";
    private Boolean gravy = Boolean.TRUE;

    private GravyDtoBuilder() { }

    public static GravyDtoBuilder aGravyBuilder() {
        return new GravyDtoBuilder();
    }

    public GravyDtoBuilder forFood(String food) {
        this.food = food;
        return this;
    }

    public GravyDtoBuilder needsGravy(Boolean gravy) {
        this.gravy = gravy;
        return this;
    }

    public GravyDto build() {
        return new GravyDto(food, gravy);
    }

}
