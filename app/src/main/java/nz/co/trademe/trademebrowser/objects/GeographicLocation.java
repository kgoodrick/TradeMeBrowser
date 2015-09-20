package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kevin on 19/09/15.
 */
public class GeographicLocation {

    @SerializedName("Latitude")
    Number latitude;

    @SerializedName("Longitude")
    Number longitude;

    @SerializedName("Northing")
    int northing;

    @SerializedName("Easting")
    int easting;

    @SerializedName("Accuracy")
    Accuracy accuracy;

    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }

    public int getNorthing() {
        return northing;
    }

    public void setNorthing(int northing) {
        this.northing = northing;
    }

    public int getEasting() {
        return easting;
    }

    public void setEasting(int easting) {
        this.easting = easting;
    }

    public Accuracy getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }
}
