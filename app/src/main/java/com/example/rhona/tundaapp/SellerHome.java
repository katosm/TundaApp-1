package com.example.rhona.tundaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SellerHome extends AppCompatActivity {

    Button profile, products, transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);

        //profile button
        profile =(Button)findViewById(R.id.profilebtn);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent profile = new Intent(SellerHome.this, Profile.class);
                startActivity(profile);

            }
        });

        //products button
        products=(Button)findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pdts = new Intent(SellerHome.this, SellerProducts.class);
                startActivity(pdts);
            }
        });

        //transactions button
        transaction=(Button)findViewById(R.id.transaction);
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trans = new Intent(SellerHome.this, Transactions.class);
                startActivity(trans);
            }
        });

    }
}
