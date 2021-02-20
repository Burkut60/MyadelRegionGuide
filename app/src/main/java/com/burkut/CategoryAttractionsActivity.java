package com.burkut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_attractions);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DescriptionChurch.class);
        startActivity(intent);
    }
}
