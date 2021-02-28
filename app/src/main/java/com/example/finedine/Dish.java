package com.example.finedine;

public class Dish {
    private int dish_id;
    private int dish_image;
    private String dish_name;
    private String dish_name_hindi;
    private int dish_price;

    public Dish(int dish_id, int dish_image, String dish_name, String dish_name_hindi, int dish_price){
        this.dish_id = dish_id;
        this.dish_image = dish_image;
        this.dish_name = dish_name;
        this.dish_name_hindi = dish_name_hindi;
        this.dish_price = dish_price;
    }
    //getters
    public int getDish_id() {
        return dish_id;
    }
    public int getDish_image() {
        return dish_image;
    }
    public String getDish_name() {
        return dish_name;
    }
    public String getDish_name_hindi() {
        return dish_name_hindi;
    }
    public int getDish_price() {
        return dish_price;
    }
}
