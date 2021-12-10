
package Labs.lab6;

import java.io.Serializable;
//import javax.annotation.Generated;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wrapperType",
    "artistType",
    "artistName",
    "artistLinkUrl",
    "artistId",
    "amgArtistId",
    "primaryGenreName",
    "primaryGenreId"
})
@Generated("jsonschema2pojo")
public class Result implements Serializable
{

    @JsonProperty("wrapperType")
    private String wrapperType;
    @JsonProperty("artistType")
    private String artistType;
    @JsonProperty("artistName")
    private String artistName;
    @JsonProperty("artistLinkUrl")
    private String artistLinkUrl;
    @JsonProperty("artistId")
    private int artistId;
    @JsonProperty("amgArtistId")
    private int amgArtistId;
    @JsonProperty("primaryGenreName")
    private String primaryGenreName;
    @JsonProperty("primaryGenreId")
    private int primaryGenreId;
    private final static long serialVersionUID = -6167554017746882255L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param artistLinkUrl
     * @param amgArtistId
     * @param wrapperType
     * @param artistType
     * @param artistName
     * @param artistId
     * @param primaryGenreId
     * @param primaryGenreName
     */
    public Result(String wrapperType, String artistType, String artistName, String artistLinkUrl, int artistId, int amgArtistId, String primaryGenreName, int primaryGenreId) {
        super();
        this.wrapperType = wrapperType;
        this.artistType = artistType;
        this.artistName = artistName;
        this.artistLinkUrl = artistLinkUrl;
        this.artistId = artistId;
        this.amgArtistId = amgArtistId;
        this.primaryGenreName = primaryGenreName;
        this.primaryGenreId = primaryGenreId;
    }

    @JsonProperty("wrapperType")
    public String getWrapperType() {
        return wrapperType;
    }

    @JsonProperty("wrapperType")
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    @JsonProperty("artistType")
    public String getArtistType() {
        return artistType;
    }

    @JsonProperty("artistType")
    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("artistLinkUrl")
    public String getArtistLinkUrl() {
        return artistLinkUrl;
    }

    @JsonProperty("artistLinkUrl")
    public void setArtistLinkUrl(String artistLinkUrl) {
        this.artistLinkUrl = artistLinkUrl;
    }

    @JsonProperty("artistId")
    public int getArtistId() {
        return artistId;
    }

    @JsonProperty("artistId")
    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @JsonProperty("amgArtistId")
    public int getAmgArtistId() {
        return amgArtistId;
    }

    @JsonProperty("amgArtistId")
    public void setAmgArtistId(int amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    @JsonProperty("primaryGenreName")
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    @JsonProperty("primaryGenreName")
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    @JsonProperty("primaryGenreId")
    public int getPrimaryGenreId() {
        return primaryGenreId;
    }

    @JsonProperty("primaryGenreId")
    public void setPrimaryGenreId(int primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    @Override
    public String toString() {
        return "Result{" +
                "wrapperType='" + wrapperType + '\'' +
                ", artistType='" + artistType + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artistLinkUrl='" + artistLinkUrl + '\'' +
                ", artistId=" + artistId +
                ", amgArtistId=" + amgArtistId +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                ", primaryGenreId=" + primaryGenreId +
                '}';
    }
}
