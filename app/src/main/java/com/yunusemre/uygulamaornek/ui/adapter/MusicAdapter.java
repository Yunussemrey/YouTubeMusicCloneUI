package com.yunusemre.uygulamaornek.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yunusemre.uygulamaornek.R;
import com.yunusemre.uygulamaornek.data.entity.Music;
import com.yunusemre.uygulamaornek.databinding.MusicTasarimBinding;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicTasarim> {

    private Context mContext;
    private List<Music> musicList;

    public MusicAdapter(Context mContext, List<Music> musicList) {
        this.mContext = mContext;
        this.musicList = musicList;
    }


    public class MusicTasarim extends RecyclerView.ViewHolder{
            private MusicTasarimBinding tasarimBinding;
        public MusicTasarim(MusicTasarimBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding = tasarimBinding;
        }
    }

    @NonNull
    @Override
    public MusicTasarim onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        MusicTasarimBinding tasarimBinding = MusicTasarimBinding.inflate(layoutInflater,parent,false);

        return new MusicTasarim(tasarimBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicTasarim holder, int position) {
        Music music = musicList.get(position);
        MusicTasarimBinding t = holder.tasarimBinding;
        t.textViewMusicName.setText(music.getMusicName());
        t.textViewmusicArtist.setText(music.getMusicArtist());
        t.imageViewmusicImage.setImageResource(
                mContext.getResources()
                        .getIdentifier(music.getMusicImage(),"drawable",mContext.getPackageName()));



    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
}
