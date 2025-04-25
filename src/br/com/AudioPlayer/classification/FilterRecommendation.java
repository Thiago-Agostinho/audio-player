package br.com.AudioPlayer.classification;

public class FilterRecommendation {
    public void filter(Classification classification){
        if(classification.getclassification() >=4){
            System.out.println("Está entre os preferidos do momento.");
        } else if (classification.getclassification() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
        } else{
            System.out.println("Coloque na sua lista para assistir depois.");
        }

    }
}

