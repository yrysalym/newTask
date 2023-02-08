package org.example;

import java.util.List;

public class MusicPlayer {
   private List<Music> musics;

   private RapMusic rapMusic;

    public MusicPlayer(RapMusic rapMusic) {
        this.rapMusic = rapMusic;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void playMusic(){
        for (Music music1 :musics) {
            System.out.println(music1.Song());
        }
        System.out.println(rapMusic.Song());
    }



}
