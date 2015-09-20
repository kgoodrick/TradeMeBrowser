package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevin on 20/09/15.
 */
public class ListingDetails {

    @SerializedName("ListingId")
    int listingId;

    @SerializedName("Title")
    String title;

    @SerializedName("Category")
    String category;

    @SerializedName("EndDate")
    String endDate;

    @SerializedName("HasGallery")
    boolean hasGallery;

    @SerializedName("CategoryPath")
    String categoryPath;

    @SerializedName("CategoryName")
    String categoryName;

    @SerializedName("Region")
    String region;

    @SerializedName("Suburb")
    String suburb;

    @SerializedName("Body")
    String body;

    @SerializedName("Photos")
    List<Photo> photos;

    @SerializedName("PriceDisplay")
    String priceDisplay;

    @SerializedName("HasBuyNow")
    boolean hasBuyNow;

    public boolean isHasBuyNow() {
        return hasBuyNow;
    }

    public void setHasBuyNow(boolean hasBuyNow) {
        this.hasBuyNow = hasBuyNow;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isHasGallery() {
        return hasGallery;
    }

    public void setHasGallery(boolean hasGallery) {
        this.hasGallery = hasGallery;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}

/*
{
  "ListingId": 4282813,
  "Title": "Luxury Motorboat",
  "Category": "0001-0348-0030-",
  "StartPrice": 400000,
  "BuyNowPrice": 515000,
  "StartDate": "/Date(1442291585020)/",
  "EndDate": "/Date(1443155585020)/",
  "ListingLength": null,
  "HasGallery": true,
  "AsAt": "/Date(1442718068182)/",
  "CategoryPath": "/Trade-Me-Motors/Boats-marine/Motorboats",
  "PhotoId": 894561,
  "IsNew": true,
  "RegionId": 2,
  "Region": "Marlborough",
  "Suburb": "Auckland City",
  "HasReserve": true,
  "HasBuyNow": true,
  "NoteDate": "/Date(0)/",
  "CategoryName": "Motorboats",
  "ReserveState": 2,
  "Attributes": [
    {
      "Name": "hull_type",
      "DisplayName": "Hull type",
      "Value": "Steel",
      "EncodedValue": "Steel"
    },
    {
      "Name": "length",
      "DisplayName": "Length",
      "Value": "65 Metres (213.17 Feet)",
      "EncodedValue": "65Metres(213.17Feet)"
    },
    {
      "Name": "year",
      "DisplayName": "Year",
      "Value": "1999",
      "EncodedValue": "1999"
    },
    {
      "Name": "engine_size",
      "DisplayName": "Engine size",
      "Value": "17500 HP",
      "EncodedValue": "17500HP"
    },
    {
      "Name": "engine_type",
      "DisplayName": "Engine type",
      "Value": "Inboard",
      "EncodedValue": "Inboard"
    },
    {
      "Name": "engine_year",
      "DisplayName": "Engine year",
      "Value": "2004",
      "EncodedValue": "2004"
    },
    {
      "Name": "engine_hours",
      "DisplayName": "Engine hours",
      "Value": "3015hrs",
      "EncodedValue": "3015hrs"
    }
  ],
  "OpenHomes": [],
  "MinimumNextBidAmount": 400000,
  "PriceDisplay": "$400,000",
  "Member": {
    "MemberId": 4000155,
    "Nickname": "junk4",
    "DateAddressVerified": "/Date(1380798000000)/",
    "DateJoined": "/Date(1322046000000)/",
    "UniqueNegative": 2,
    "UniquePositive": 7,
    "FeedbackCount": 5,
    "IsAddressVerified": true,
    "Suburb": "Auckland City",
    "Region": "Marlborough",
    "IsAuthenticated": true
  },
  "Body": "Product Attrib-33\r\nStart = 400,000.00, Reserve = 495,000.00, Buy Now = 515,000.00",
  "Photos": [
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
  ],
  "AllowsPickups": 1,
  "ShippingOptions": [
    {
      "Type": 4,
      "Price": 250,
      "Method": "North Island by road",
      "ShippingId": 4
    },
    {
      "Type": 4,
      "Price": 450,
      "Method": "South Island by road",
      "ShippingId": 5
    },
    {
      "Type": 4,
      "Price": 850,
      "Method": "Piloted within 300km",
      "ShippingId": 6
    },
    {
      "Type": 4,
      "Price": 999,
      "Method": "Piloted within 2000km",
      "ShippingId": 7
    },
    {
      "Type": 2,
      "Method": "I intend to pick-up",
      "ShippingId": 2
    }
  ],
  "PaymentOptions": "NZ Bank Deposit, Cash",
  "CanAddToCart": false,
  "EmbeddedContent": {}
}
 */