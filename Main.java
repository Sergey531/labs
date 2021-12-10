package Labs.lab6;

import java.io.IOException;

public class Main {
    //https://itunes.apple.com/lookup?amgArtistId=468749,5723
    public static void main(String[] args) throws IOException {
        String fileName = "https://itunes.apple.com/lookup?amgArtistId=468749,5723";
        Artists artists = new Artists();
        artists = artists.loadByURL(fileName);
        System.out.println(artists);
        //System.out.println(artists.loadByURL(fileName));
        //System.out.println(artists);
    }
}
