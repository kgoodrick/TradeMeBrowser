package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kevin on 20/09/15.
 */
public class PhotoLocations {

    @SerializedName("Thumbnail")
    private String thumbnail;

    @SerializedName("List")
    private String list;

    @SerializedName("Medium")
    private String medium;

    @SerializedName("Gallery")
    private String gallery;

    @SerializedName("Large")
    private String large;

    @SerializedName("FullSize")
    private String fullSize;

    @SerializedName("PhotoId")
    private Integer photoId;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getFullSize() {
        return fullSize;
    }

    public void setFullSize(String fullSize) {
        this.fullSize = fullSize;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }
}
