
package Labs.lab6;

import java.io.Serializable;
//import javax.annotation.Generated;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Artist implements Serializable
{

    private String wrapperType;
    private String artistType;
    private String artistName;
    private String artistLinkUrl;
    private int artistId;
    private int amgArtistId;
    private String primaryGenreName;
    private int primaryGenreId;
    private final static long serialVersionUID = -4572185689777323442L;

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistLinkUrl() {
        return artistLinkUrl;
    }

    public void setArtistLinkUrl(String artistLinkUrl) {
        this.artistLinkUrl = artistLinkUrl;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getAmgArtistId() {
        return amgArtistId;
    }

    public void setAmgArtistId(int amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public int getPrimaryGenreId() {
        return primaryGenreId;
    }

    public void setPrimaryGenreId(int primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    @Override
    public String toString() {
        return "Artist{" +
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
