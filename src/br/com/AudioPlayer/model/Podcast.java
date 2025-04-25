package br.com.AudioPlayer.model;

import br.com.AudioPlayer.classification.Classification;

public class Podcast extends Audio implements Classification {
    private String host;
    private String description;
    private String guest;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Apresentador: " + host + "\n" +
                super.toString() +
                "\nConvidado: " + guest +
                "\nDescrição: " + description;
    }

    public int getclassification(){
        if (getLikes() == 0){
            return 0;
        }
        return getTotalReproductions()/getLikes();
    }
}