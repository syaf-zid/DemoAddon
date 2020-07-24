package com.myapplicationdev.android.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);
        // imageView.setImageResource(R.mipmap.ic_launcher);

        // Picasso Library //
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(imageView);
    }
}