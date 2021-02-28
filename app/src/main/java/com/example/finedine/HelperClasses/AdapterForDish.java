package com.example.finedine.HelperClasses;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.finedine.Dish;
import com.example.finedine.R;

import java.util.ArrayList;

public class AdapterForDish extends ArrayAdapter<Dish> {

    public AdapterForDish(Activity context, ArrayList<Dish> dishes) {
        super(context, 0, dishes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View dish_card = convertView;

        if(dish_card == null) {
            dish_card = LayoutInflater.from(getContext()).inflate(R.layout.dish_card, parent, false);
        }

        Dish dish = getItem(position);

        TextView dish_name = dish_card.findViewById(R.id.dish_name);
        TextView dish_price = dish_card.findViewById(R.id.dish_price);
        ImageView dish_image = dish_card.findViewById(R.id.dish_image);

        dish_name.setText(dish.getDish_name());
        dish_price.setText("₹ " + Integer.toString(dish.getDish_price()));
        dish_image.setImageResource(dish.getDish_image());

        return dish_card;
    }
}
