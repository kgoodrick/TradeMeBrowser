package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kevin on 20/09/15.
 */
public class Photo {


  @SerializedName("Key")
  private Integer key;

  @SerializedName("Value")
  private PhotoLocations value;

  /**
   *
   * @return
   * The Key
   */
  public Integer getKey() {
    return key;
  }

  /**
   *
   * @param key
   * The Key
   */
  public void setKey(Integer key) {
    this.key = key;
  }

  /**
   *
   * @return
   * The Value
   */
  public PhotoLocations getValue() {
    return value;
  }

  /**
   *
   * @param value
   * The Value
   */
  public void setValue(PhotoLocations value) {
    this.value = value;
  }

}


/*
{"Photos": [
    {
      "Key": 894561,
      "Value": {
        "Thumbnail": "https://images.tmsandbox.co.nz/photoserver/thumb/894561.jpg",
        "List": "https://images.tmsandbox.co.nz/photoserver/lv2/894561.jpg",
        "Medium": "https://images.tmsandbox.co.nz/photoserver/med/894561.jpg",
        "Gallery": "https://images.tmsandbox.co.nz/photoserver/gv/894561.jpg",
        "Large": "https://images.tmsandbox.co.nz/photoserver/tq/894561.jpg",
        "FullSize": "https://images.tmsandbox.co.nz/photoserver/full/894561.jpg",
        "PhotoId": 894561
      }
    }
  ]}
 */