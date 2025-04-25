package br.com.AudioPlayer.model;

public class Audio {

    private String name;
    private double duration;
    private int totalReproductions;
    private int likes;
    private int classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void like(){
        likes++;
    }
    public void play(){
        totalReproductions++;
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                "\nDuração: " + duration + " minutos" +
                "\nCurtidas: " + likes +
                "\nReproduções: " + totalReproductions;
    }
}