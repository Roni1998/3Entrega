package com.eist.miaplicacion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;


public class Buscador extends Fragment implements OnMapReadyCallback {

    SupportMapFragment mapFragment;
     public Buscador(){

     }
     @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
         View v = inflater.inflate(R.layout.fragment_buscador,container,false);
         mapFragment=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
         if(mapFragment == null){
             FragmentManager fm= getFragmentManager();
             FragmentTransaction ft= fm.beginTransaction();
             mapFragment=SupportMapFragment.newInstance();
             ft.replace(R.id.map, mapFragment).commit();
         }
         mapFragment.getMapAsync(this);
         return v;
     }

     @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}