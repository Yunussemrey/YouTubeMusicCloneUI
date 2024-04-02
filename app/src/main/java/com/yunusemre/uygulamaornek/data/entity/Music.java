package com.yunusemre.uygulamaornek.data.entity;

public class Music {
    private String musicImage;
    private String musicName;
    private String musicArtist;

    public Music() {
    }

    public Music(String musicImage, String musicName, String musicArtist) {
        this.musicImage = musicImage;
        this.musicName = musicName;
        this.musicArtist = musicArtist;
    }

    public String getMusicImage() {
        return musicImage;
    }

    public void setMusicImage(String musicImage) {
        this.musicImage = musicImage;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }
}
