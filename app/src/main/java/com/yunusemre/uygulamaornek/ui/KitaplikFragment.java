package com.yunusemre.uygulamaornek.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunusemre.uygulamaornek.R;
import com.yunusemre.uygulamaornek.databinding.FragmentKitaplikBinding;


public class KitaplikFragment extends Fragment {
        private FragmentKitaplikBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                binding = FragmentKitaplikBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }
}