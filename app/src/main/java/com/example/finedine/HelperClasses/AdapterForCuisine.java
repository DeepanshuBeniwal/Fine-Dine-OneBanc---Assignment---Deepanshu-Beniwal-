package com.example.finedine.HelperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finedine.Cuisine;
import com.example.finedine.R;

import java.util.ArrayList;

public class AdapterForCuisine extends RecyclerView.Adapter<AdapterForCuisine.CuisineViewHold>  {

    ArrayList<Cuisine> cuisine;
    final private ListItemClickListener mOnClickListener;
    int num;

    public AdapterForCuisine(ArrayList<Cuisine> cuisine, ListItemClickListener listener, int num) {
        this.cuisine = cuisine;
        mOnClickListener = listener;
        this.num = num;
    }

    @NonNull

    @Override
    public CuisineViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuisine_card, parent, false);
        return new CuisineViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CuisineViewHold holder, int position) {
        Cuisine cuisine_object = cuisine.get(position);
        holder.cuisine_image.setImageResource(cuisine_object.getCuisine_image());
        if(num == 0){ //ENGLISH

            holder.cuisine_name.setText(cuisine_object.getCuisine_name());
            holder.top_dish_1_name.setText(cuisine_object.getDishes().get(0).getDish_name());
            holder.top_dish_2_name.setText(cuisine_object.getDishes().get(1).getDish_name());
            holder.top_dish_3_name.setText(cuisine_object.getDishes().get(2).getDish_name());

        }else if(num ==1){ // HINDI

            holder.cuisine_name.setText(cuisine_object.getCuisine_name_hindi());
            holder.top_dish_1_name.setText(cuisine_object.getDishes().get(0).getDish_name_hindi());
            holder.top_dish_2_name.setText(cuisine_object.getDishes().get(1).getDish_name_hindi());
            holder.top_dish_3_name.setText(cuisine_object.getDishes().get(2).getDish_name_hindi());

        }

        holder.top_dish_1.setImageResource(cuisine_object.getDishes().get(0).getDish_image());
        holder.top_dish_2.setImageResource(cuisine_object.getDishes().get(1).getDish_image());
        holder.top_dish_3.setImageResource(cuisine_object.getDishes().get(2).getDish_image());
        holder.top_dish_1_price.setText("₹ " + Integer.toString(cuisine_object.getDishes().get(0).getDish_price()));
        holder.top_dish_2_price.setText("₹ " + Integer.toString(cuisine_object.getDishes().get(1).getDish_price()));
        holder.top_dish_3_price.setText("₹ " + Integer.toString(cuisine_object.getDishes().get(2).getDish_price()));

    }

    @Override
    public int getItemCount() {
        return cuisine.size();
    }

    public interface ListItemClickListener {
        void onCuisineListClick(int clickedItemIndex);
    }

    public class CuisineViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView cuisine_image;
        TextView cuisine_name;
        ImageView top_dish_1;
        ImageView top_dish_2;
        ImageView top_dish_3;
        TextView top_dish_1_name;
        TextView top_dish_2_name;
        TextView top_dish_3_name;
        TextView top_dish_1_price;
        TextView top_dish_2_price;
        TextView top_dish_3_price;

        public CuisineViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            cuisine_image = itemView.findViewById(R.id.cuisine_image);
            cuisine_name = itemView.findViewById(R.id.cuisine_name);
            top_dish_1 = itemView.findViewById(R.id.top_dish_1_image);
            top_dish_2 = itemView.findViewById(R.id.top_dish_2_image);
            top_dish_3 = itemView.findViewById(R.id.top_dish_3_image);
            top_dish_1_name = itemView.findViewById(R.id.top_dish_1_name);
            top_dish_2_name = itemView.findViewById(R.id.top_dish_2_name);
            top_dish_3_name = itemView.findViewById(R.id.top_dish_3_name);
            top_dish_1_price = itemView.findViewById(R.id.top_dish_1_price);
            top_dish_2_price = itemView.findViewById(R.id.top_dish_2_price);
            top_dish_3_price = itemView.findViewById(R.id.top_dish_3_price);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onCuisineListClick(clickedPosition);

        }
    }
}
