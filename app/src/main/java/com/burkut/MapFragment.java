package com.burkut;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        SupportMapFragment supportMapFragment = ( SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_map);
//асинхронная карта
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final GoogleMap googleMap) {
                // когда карта загружается
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(LatLng latLng) {
                        // когда кликаеш на карту
                        // инициализировать параметры маркера
                        MarkerOptions markerOptions = new MarkerOptions();
                        // установить положение маркера
                        markerOptions.position(latLng);
                        // установить заголовок маркера
                        markerOptions.title(latLng.latitude + " : " + latLng.latitude);
                        // удалить все маркеры
                        googleMap.clear();
                        // анимация для увеличения маркера
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                latLng, 10
                        ));
                        //  добавить маркер на карту
                        googleMap.addMarker(markerOptions);

                    }
                });
            }
        });

        return view;
    }
}
