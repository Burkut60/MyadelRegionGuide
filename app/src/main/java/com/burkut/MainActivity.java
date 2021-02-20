package com.burkut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализация фрагмента
        Fragment fragment = new MapFragment();
        //открыть фрагмент
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }
public void  onClick(View view){ ;
    switch (view.getId()){
        case R.id.excursionButton:
            Intent intentCategory = new Intent(this, CategoryAttractionsActivity.class);
            startActivity(intentCategory);
            break;
        case  R.id.byTimeButton:

            break;
    }
}
}
