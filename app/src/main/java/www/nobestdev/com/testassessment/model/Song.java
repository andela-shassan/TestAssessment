
package www.nobestdev.com.testassessment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Song {

    @SerializedName("annotation_count")
    @Expose
    private int annotationCount;
    @SerializedName("api_path")
    @Expose
    private String apiPath;
    @SerializedName("full_title")
    @Expose
    private String fullTitle;
    @SerializedName("header_image_thumbnail_url")
    @Expose
    private String headerImageThumbnailUrl;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("lyrics_owner_id")
    @Expose
    private int lyricsOwnerId;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("pyongs_count")
    @Expose
    private int pyongsCount;
    @SerializedName("song_art_image_thumbnail_url")
    @Expose
    private String songArtImageThumbnailUrl;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("primary_artist")
    @Expose
    private PrimaryArtist primaryArtist;

    public int getAnnotationCount() {
        return annotationCount;
    }

    public void setAnnotationCount(int annotationCount) {
        this.annotationCount = annotationCount;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getHeaderImageThumbnailUrl() {
        return headerImageThumbnailUrl;
    }

    public void setHeaderImageThumbnailUrl(String headerImageThumbnailUrl) {
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLyricsOwnerId() {
        return lyricsOwnerId;
    }

    public void setLyricsOwnerId(int lyricsOwnerId) {
        this.lyricsOwnerId = lyricsOwnerId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPyongsCount() {
        return pyongsCount;
    }

    public void setPyongsCount(int pyongsCount) {
        this.pyongsCount = pyongsCount;
    }

    public String getSongArtImageThumbnailUrl() {
        return songArtImageThumbnailUrl;
    }

    public void setSongArtImageThumbnailUrl(String songArtImageThumbnailUrl) {
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PrimaryArtist getPrimaryArtist() {
        return primaryArtist;
    }

    public void setPrimaryArtist(PrimaryArtist primaryArtist) {
        this.primaryArtist = primaryArtist;
    }

}
