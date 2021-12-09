package Labs.lab6;

import java.io.IOException;

public class Main {
    static String url = "https://itunes.apple.com/lookup?id=909253";
    public static void main(String[] args) throws IOException {
        //https://itunes.apple.com/lookup?id=909253
        Artists artists= new Artists();
        artists = artists.loadByURL(url);
        System.out.println(artists);
    }
}
