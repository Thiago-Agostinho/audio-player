package br.com.AudioPlayer.model;

import br.com.AudioPlayer.classification.Classification;

public class Music extends Audio implements Classification {
    private String album;
    private String artist;
    private String genre;


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nArtista: " + artist +
                "\nÁlbum: " + album +
                "\nGênero: " + genre;
    }

    public int getclassification(){
        if (getLikes() == 0){
            return 0;
        }
        return getTotalReproductions()/getLikes();
    }

}