package com.example.finedine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    private View decorView;
    TextView net_total, cgst, sgst, grand_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent intent = getIntent();
        int net = intent.getIntExtra("net", 0);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i == 0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });

        getSupportActionBar().setTitle("Cart");

        net_total = findViewById(R.id.net_total_price);
        cgst = findViewById(R.id.cgst_price);
        sgst = findViewById(R.id.sgst_price);
        grand_total = findViewById(R.id.grand_total_price);

        double cg = 0.025 * (double) net;

        net_total.setText("" + (double) net);
        cgst.setText("" + cg);
        sgst.setText("" + cg);
        double gt = (double)net + cg + cg;
        grand_total.setText("" + gt);

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

}
