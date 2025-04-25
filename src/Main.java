import br.com.AudioPlayer.classification.FilterRecommendation;
import br.com.AudioPlayer.model.Music;
import br.com.AudioPlayer.model.Podcast;

public class Main {
    public static void main(String[] args) {

        FilterRecommendation filter = new FilterRecommendation();


        Music newMusic = new Music();
        newMusic.setName("Devil Trigger");
        newMusic.setArtist("Nero");
        newMusic.setGenre("Rock");
        newMusic.setAlbum("Devil May Cry");
        newMusic.setDuration(6.15);

        newMusic.setTotalReproductions(1900);
        newMusic.setLikes(500);

        System.out.println(newMusic);
        filter.filter(newMusic);

        Podcast newPodcast = new Podcast();
        newPodcast.setName("Flow Podcast");
        newPodcast.setHost("Igor 3K");
        newPodcast.setGuest("Clovis de Barros");
        newPodcast.setDuration(180);
        newPodcast.setDescription("Descrição");

        newPodcast.setTotalReproductions(1500);
        newPodcast.setLikes(300);

        System.out.println(newPodcast);
        filter.filter(newPodcast);


    }
}