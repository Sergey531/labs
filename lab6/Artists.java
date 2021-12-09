
package Labs.lab6;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
//import javax.annotation.Generated;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Artists implements Serializable
{

    private int resultCount;
    private List<Artist> results = null;
    private final static long serialVersionUID = -7632118138421748670L;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public List<Artist> getResults() {
        return results;
    }

    public void setResults(List<Artist> results) {
        this.results = results;
    }

    public Artists loadByURL(String url) throws IOException {
        StringBuilder jsonIn = new StringBuilder();
        InputStream is = null;
        is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

            int cp;
            while ((cp = rd.read()) != -1){
                jsonIn.append((char) cp);
            }
            System.out.println(jsonIn);
        }
        finally {
            is.close();
        }

        return new ObjectMapper().readValue(jsonIn.toString().strip(), Artists.class);


    }

    @Override
    public String toString() {
        return "Artists{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
