package com.github.willpdp.springboot.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GravyDto {

    private Boolean gravy;
    private String food;

    @JsonCreator
    public GravyDto(@JsonProperty("food") String food, @JsonProperty("gravy") Boolean gravy) {
        this.gravy = gravy;
        this.food = food;
    }

    public GravyDto(String food) {
        this(food, Boolean.TRUE);
        this.food = food;
    }

    public Boolean getGravy() {
        return gravy;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "GravyDto{" +
                "gravy=" + gravy +
                ", food='" + food + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GravyDto gravyDto = (GravyDto) o;

        if (getGravy() != null ? !getGravy().equals(gravyDto.getGravy()) : gravyDto.getGravy() != null) return false;
        return getFood() != null ? getFood().equals(gravyDto.getFood()) : gravyDto.getFood() == null;
    }

}
