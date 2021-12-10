
package Labs.lab6;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
//import javax.annotation.Generated;
import javax.annotation.processing.Generated;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resultCount",
    "results"
})
@Generated("jsonschema2pojo")
public class Artists implements Serializable
{

    @JsonProperty("resultCount")
    private int resultCount;
    @JsonProperty("results")
    private List<Result> results = null;
    private final static long serialVersionUID = -1759880227750126468L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artists() {
    }

    /**
     * 
     * @param resultCount
     * @param results
     */
    public Artists(int resultCount, List<Result> results) {
        super();
        this.resultCount = resultCount;
        this.results = results;
    }

    @JsonProperty("resultCount")
    public int getResultCount() {
        return resultCount;
    }

    @JsonProperty("resultCount")
    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }

    public Artists loadByURL(String url) throws IOException {
        StringBuilder jsonIn = new StringBuilder();
        InputStream is = null;
        is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

            int cp;
            while ((cp = rd.read()) != -1) {
                jsonIn.append((char) cp);
            }
            // System.out.println(jsonIn);
        }
        finally {
            is.close();
        }

        return new ObjectMapper().readValue(jsonIn.toString(), Artists.class);

        //return jsonIn;

        //return new Artists();
    }

    public static Comparator<Artists> byResultCount = ((o1, o2) -> o1.getResultCount());

}
