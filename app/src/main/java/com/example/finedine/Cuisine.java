package com.example.finedine;

import java.util.ArrayList;

public class Cuisine {
    private int cuisine_id;
    private int cuisine_image;
    private String cuisine_name;
    private String cuisine_name_hindi;
    private ArrayList<Dish> dishes;

    public Cuisine(int cuisine_id, int cuisine_image, String cuisine_name, String cuisine_name_hindi, ArrayList<Dish> dishes){
        this.cuisine_id = cuisine_id;
        this.cuisine_image = cuisine_image;
        this.cuisine_name = cuisine_name;
        this.cuisine_name_hindi = cuisine_name_hindi;
        this.dishes = dishes;
    }
    // getters
    public int getCuisine_id() {
        return cuisine_id;
    }
    public int getCuisine_image() {
        return cuisine_image;
    }
    public String getCuisine_name() {
        return cuisine_name;
    }
    public String getCuisine_name_hindi() {
        return cuisine_name_hindi;
    }
    public ArrayList<Dish> getDishes() {
        return dishes;
    }
}
