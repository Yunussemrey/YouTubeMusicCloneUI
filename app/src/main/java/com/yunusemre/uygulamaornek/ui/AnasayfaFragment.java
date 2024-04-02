package com.yunusemre.uygulamaornek.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunusemre.uygulamaornek.R;
import com.yunusemre.uygulamaornek.data.entity.Music;
import com.yunusemre.uygulamaornek.databinding.FragmentAnasayfaBinding;
import com.yunusemre.uygulamaornek.ui.adapter.MusicAdapter;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);


        ArrayList<Music> musicArrayList = new ArrayList<>();
        Music music = new Music("image_1","İnkar Etme","Nilüfer");
        Music music1 = new Music("image_2","Devriliyorsam","Yosun Kaya");
        Music music2 = new Music("image_3","Sen de Yan","Ayaz Erdoğan");
        Music music3 = new Music("image_4","Sevda","Ferdi Özbeğen");
        Music music4 = new Music("image_5","Çöpçüler","Erkin Koray");
        Music music5 = new Music("image_6","Ümit Yere Batsın","Cengiz Kurtoğlu");
        Music music6 = new Music("image_7","Kul Feryadı","Bergen");
        Music music7 = new Music("image_8","Bir Zamanlar Deli Gönlüm","Sezen Aksu");
        Music music8 = new Music("image_9","Canımdan Can İste","Tüdanya");

        musicArrayList.add(music);
        musicArrayList.add(music1);
        musicArrayList.add(music3);
        musicArrayList.add(music4);
        musicArrayList.add(music5);
        musicArrayList.add(music6);
        musicArrayList.add(music7);
        musicArrayList.add(music8);

       //   binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.HORIZONTAL));
        
        MusicAdapter adapter = new MusicAdapter(getContext(),musicArrayList);
        binding.rv.setAdapter(adapter);


        return binding.getRoot();
    }
}