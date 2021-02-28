package com.example.finedine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finedine.HelperClasses.AdapterForCuisine;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterForCuisine.ListItemClickListener{

    private View decorView;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<Cuisine> cuisine;
    ArrayList<Dish> dishes_1;
    ArrayList<Dish> dishes_2;
    ArrayList<Dish> dishes_3;
    ArrayList<Dish> dishes_4;
    ArrayList<Dish> dishes_5;
    ArrayList<Dish> dishes_6;
    ArrayList<Dish> dishes_7;
    ArrayList<Dish> dishes_8;
    ArrayList<Dish> dishes_9;

    Button cart, language;

    int quantity1 = 0;
    int quantity2 = 0;
    int quantity3 = 0;

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i == 0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });


        dishes_1 = new ArrayList<>();
        dishes_1.add(new Dish(11,R.drawable.image_11,"Arancini","ारांकिनी",100));
        dishes_1.add(new Dish(12,R.drawable.image_12,"Lasagne","लसगने",125));
        dishes_1.add(new Dish(13,R.drawable.image_13,"Ribollita","रिबोलिता",150));
        dishes_1.add(new Dish(14,R.drawable.image_14,"Saltim Bocca","सलतीम बोक्सा",175));
        dishes_1.add(new Dish(15,R.drawable.image_15,"Gelato","गेलाटो",200));
        dishes_1.add(new Dish(16,R.drawable.image_16,"Torrone","टर्राने",225));
        dishes_1.add(new Dish(17,R.drawable.image_17,"Tiramisu","तिरामिसू",250));
        dishes_1.add(new Dish(18,R.drawable.image_18,"Prosciutto","प्रॉसियततो",275));
        dishes_1.add(new Dish(19,R.drawable.image_19,"Ossobuco Alla Milanese","ोसबुको अल्ला मिलनेसे",300));

        dishes_2 = new ArrayList<>();
        dishes_2.add(new Dish(21,R.drawable.image_21,"Sinchuan Pork","सिचुआन पोर्क",100));
        dishes_2.add(new Dish(22,R.drawable.image_22,"Yangchow Fried Rice","यांगचोव फ्राइड राइस",125));
        dishes_2.add(new Dish(23,R.drawable.image_23,"Spring Rolls","स्प्रिंग रोल्स",150));
        dishes_2.add(new Dish(24,R.drawable.image_24,"Wontons","वोटॉन्स",175));
        dishes_2.add(new Dish(25,R.drawable.image_25,"Ma Po Tofu","माँ पो टोफू",200));
        dishes_2.add(new Dish(26,R.drawable.image_26,"Kung Pao Chicken","कुंग पाओ चिकन",225));
        dishes_2.add(new Dish(27,R.drawable.image_27,"Steamed Vermicelli Rolls","स्टीम्ड वर्मिसेली रोल्स",250));
        dishes_2.add(new Dish(28,R.drawable.image_28,"Chow Mein","चाउ मीन",275));
        dishes_2.add(new Dish(29,R.drawable.image_29,"Dumplings","डंप्लिंग्स",300));

        dishes_3 = new ArrayList<>();
        dishes_3.add(new Dish(31,R.drawable.image_31,"Boeuf Bourguignon","बोयूफ बौरगुइनों",100));
        dishes_3.add(new Dish(32,R.drawable.image_32,"Coq au vin","कक अउ विन",125));
        dishes_3.add(new Dish(33,R.drawable.image_33,"Potatoes Dauphinoise","पोटाटोएस दौफिनोइसे",150));
        dishes_3.add(new Dish(34,R.drawable.image_34,"Cassoulet","कसौलेट",175));
        dishes_3.add(new Dish(35,R.drawable.image_35,"Chicken Cordon Bleu","चिकन कॉर्डों ब्लेउ",200));
        dishes_3.add(new Dish(36,R.drawable.image_36,"Quiche Lorraine","कीचे लोरेन",225));
        dishes_3.add(new Dish(37,R.drawable.image_37,"Croque Monsieur","क्रोक्वे मॉन्सियोर",250));
        dishes_3.add(new Dish(38,R.drawable.image_38,"Croque Madame","क्रोक्वे मेडम",275));
        dishes_3.add(new Dish(39,R.drawable.image_39,"Croissants","क्रोइस्संट्स",300));

        dishes_4 = new ArrayList<>();
        dishes_4.add(new Dish(41,R.drawable.image_41,"Sushi","सुशी",100));
        dishes_4.add(new Dish(42,R.drawable.image_42,"Udon","ूडों",125));
        dishes_4.add(new Dish(43,R.drawable.image_43,"Tofu","टोफू",150));
        dishes_4.add(new Dish(44,R.drawable.image_44,"Tempura","टेम्पुरा",175));
        dishes_4.add(new Dish(45,R.drawable.image_45,"Yakitori","याकिटोरि",200));
        dishes_4.add(new Dish(46,R.drawable.image_46,"Sashimi","साशिमी",225));
        dishes_4.add(new Dish(47,R.drawable.image_47,"Ramen","रमन",250));
        dishes_4.add(new Dish(48,R.drawable.image_48,"Donburi","दोंबुरी",275));
        dishes_4.add(new Dish(49,R.drawable.image_49,"Natto","नट",300));

        dishes_5 = new ArrayList<>();
        dishes_5.add(new Dish(51,R.drawable.image_51,"Carne Adobada","करने डोबड़ा",100));
        dishes_5.add(new Dish(52,R.drawable.image_52,"Chilaquiles","चिलकिलेस",125));
        dishes_5.add(new Dish(53,R.drawable.image_53,"Gorditas","गोरडिटॉस",150));
        dishes_5.add(new Dish(54,R.drawable.image_54,"Tacos","टैक्स",175));
        dishes_5.add(new Dish(55,R.drawable.image_55,"Tortillas","टॉर्टिलास",200));
        dishes_5.add(new Dish(56,R.drawable.image_56,"Frijoles","फ़्रिजोलेस",225));
        dishes_5.add(new Dish(57,R.drawable.image_57,"Guacamole","गुआकेमोले",250));
        dishes_5.add(new Dish(58,R.drawable.image_58,"Elote","एलॉट",275));
        dishes_5.add(new Dish(59,R.drawable.image_59,"Quesadillas","केसडिलास",300));

        dishes_6 = new ArrayList<>();
        dishes_6.add(new Dish(61,R.drawable.image_61,"Som Tum","सोम तुम",100));
        dishes_6.add(new Dish(62,R.drawable.image_62,"Gaeng Daeng","गैंग डाइंग",125));
        dishes_6.add(new Dish(63,R.drawable.image_63,"Laab","लाभ",150));
        dishes_6.add(new Dish(64,R.drawable.image_64,"Tom Yum Goong","टॉम यौम गूंज",175));
        dishes_6.add(new Dish(65,R.drawable.image_65,"Pad See Ew","पद सी ेव",200));
        dishes_6.add(new Dish(66,R.drawable.image_66,"Pad Thai","पद थाई",225));
        dishes_6.add(new Dish(67,R.drawable.image_67,"Gaeng Keow Wan","गैंग को वैन",250));
        dishes_6.add(new Dish(68,R.drawable.image_68,"Durian","डूरियन",275));
        dishes_6.add(new Dish(69,R.drawable.image_69,"Pad Kee Mao","पद की माओ",300));

        dishes_7 = new ArrayList<>();
        dishes_7.add(new Dish(71,R.drawable.image_71,"Lahmacun","लहसुन",100));
        dishes_7.add(new Dish(72,R.drawable.image_72,"Menemen","मनमें",125));
        dishes_7.add(new Dish(73,R.drawable.image_73,"Corba","कोरबा",150));
        dishes_7.add(new Dish(74,R.drawable.image_74,"Kuzu Tandir","कुजू तंदिर",175));
        dishes_7.add(new Dish(75,R.drawable.image_75,"Pide","पड़े",200));
        dishes_7.add(new Dish(76,R.drawable.image_76,"Meze","मज़े",225));
        dishes_7.add(new Dish(77,R.drawable.image_77,"Yaprak Sarma","यपरक शर्मा",250));
        dishes_7.add(new Dish(78,R.drawable.image_78,"Dolma","डोलमा",275));
        dishes_7.add(new Dish(79,R.drawable.image_79,"Borek","बोरिक",300));

        dishes_8 = new ArrayList<>();
        dishes_8.add(new Dish(81,R.drawable.image_81,"Pelmeni","पेल्मेनि",100));
        dishes_8.add(new Dish(82,R.drawable.image_82,"Shi","सही",125));
        dishes_8.add(new Dish(83,R.drawable.image_83,"Solyanka","सोल्यंका",150));
        dishes_8.add(new Dish(84,R.drawable.image_84,"Blini","बलिनि",175));
        dishes_8.add(new Dish(85,R.drawable.image_85,"Vatrushka","वाटरूषका",200));
        dishes_8.add(new Dish(86,R.drawable.image_86,"Rass Tegai","रस तेगे",225));
        dishes_8.add(new Dish(87,R.drawable.image_87,"Kvass","क्वास",250));
        dishes_8.add(new Dish(88,R.drawable.image_88,"Varenie","वरेनिए",275));
        dishes_8.add(new Dish(89,R.drawable.image_89,"Holodets","होलडेट्स",300));

        dishes_9 = new ArrayList<>();
        dishes_9.add(new Dish(91,R.drawable.image_91,"Pav Bhaaji","पाव भाजी",100));
        dishes_9.add(new Dish(92,R.drawable.image_92,"Daal Baati Churma","दाल बाटी चूरमा",125));
        dishes_9.add(new Dish(93,R.drawable.image_93,"Dhokla","ढोकला",150));
        dishes_9.add(new Dish(94,R.drawable.image_94,"Stuffed Paratha","स्टफ्ड पराठा",175));
        dishes_9.add(new Dish(95,R.drawable.image_95,"Black Dal","ब्लैक दाल",200));
        dishes_9.add(new Dish(96,R.drawable.image_96,"Dosa","डोसा",225));
        dishes_9.add(new Dish(97,R.drawable.image_97,"Idli Sambhar","इडली सांभर",250));
        dishes_9.add(new Dish(98,R.drawable.image_98,"Hyderabadi Dum Biriyani","हैदराबादी दम बिरियानी",275));
        dishes_9.add(new Dish(99,R.drawable.image_99,"Vada Pav","वादा पाव",300));

        cuisine = new ArrayList<>();
        cuisine.add(new Cuisine(1,R.drawable.image_1, "Italian","इतालियन", dishes_1));
        cuisine.add(new Cuisine(2,R.drawable.image_2,"Chinese","चिनेसे", dishes_2));
        cuisine.add(new Cuisine(3,R.drawable.image_3, "French","फ्रेंच", dishes_3));
        cuisine.add(new Cuisine(4,R.drawable.image_4, "Japanese","जापानीज", dishes_4));
        cuisine.add(new Cuisine(5,R.drawable.image_5, "Mexican","मेक्सिकन", dishes_5));
        cuisine.add(new Cuisine(6,R.drawable.image_6, "Thai","थाई", dishes_6));
        cuisine.add(new Cuisine(7,R.drawable.image_7, "Turkish","तुर्किश", dishes_7));
        cuisine.add(new Cuisine(8,R.drawable.image_8, "Russian","रुस्सियन", dishes_8));
        cuisine.add(new Cuisine(9,R.drawable.image_9, "Indian","इंडियन", dishes_9));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView();

        cart = findViewById(R.id.cart_button);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int net = quantity1 * 100 + quantity2 * 125 + quantity3 * 150;
                Intent intent = new Intent(getApplicationContext(), CartActivity.class);
                intent.putExtra("net", net);
                startActivity(intent);
            }
        });

        language = findViewById(R.id.language_button);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tp = findViewById(R.id.top_picks);
                TextView l = findViewById(R.id.language_button);
                TextView c = findViewById(R.id.cart_button);
                if(num == 1){ //if hindi make english
                    num = 0;
                    tp.setText("Top Picks");
                    l.setText("Language");
                    c.setText("Cart");
                }else{ // if english make hindi
                    num = 1;
                    tp.setText("टॉप पिक्स");
                    l.setText("भाषा");
                    c.setText("कार्ट");
                }
                recyclerView();
            }
        });

    }

    private void recyclerView(){
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new AdapterForCuisine(cuisine, this, num);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onCuisineListClick(int clickedItemIndex) {
        Intent intent = new Intent(getApplicationContext(), CuisineActivity.class);
        intent.putExtra("cuisine_id", clickedItemIndex +  1);
        startActivity(intent);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }
    private int hideSystemBars(){
        return View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }

    public void inc1(View view){
        quantity1++;
        TextView tv = findViewById(R.id.quantity_top_dish_1);
        tv.setText("" + quantity1);
    }
    public void dec1(View view){
        if(quantity1 != 0){
            quantity1--;
            TextView tv = findViewById(R.id.quantity_top_dish_1);
            tv.setText("" + quantity1);
        }
    }
    public void inc2(View view){
        quantity2++;
        TextView tv = findViewById(R.id.quantity_top_dish_2);
        tv.setText("" + quantity2);
    }
    public void dec2(View view){
        if(quantity2 != 0){
            quantity2--;
            TextView tv = findViewById(R.id.quantity_top_dish_2);
            tv.setText("" + quantity2);
        }
    }
    public void inc3(View view){
        quantity3++;
        TextView tv = findViewById(R.id.quantity_top_dish_3);
        tv.setText("" + quantity3);
    }
    public void dec4(View view){
        if(quantity3 != 0){
            quantity3--;
            TextView tv = findViewById(R.id.quantity_top_dish_3);
            tv.setText("" + quantity3);
        }
    }
}