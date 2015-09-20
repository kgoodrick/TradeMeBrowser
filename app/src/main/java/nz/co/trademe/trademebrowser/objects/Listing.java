package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevin on 18/09/15.
 */
public class Listing {

    @SerializedName("ListingId")
    int listingId;

    @SerializedName("Title")
    String title;

    @SerializedName("Category")
    String category;

    @SerializedName("StartPrice")
    Number startPrice;

    @SerializedName("BuyNowPrice")
    Number buyNowPrice;

    @SerializedName("StartDate")
    String startDate;

    @SerializedName("EndDate")
    String endDate;

    @SerializedName("IsFeatured")
    boolean isFeatured;

    @SerializedName("HasGallery")
    boolean hasGallery;

    @SerializedName("IsBold")
    boolean isBold;

    @SerializedName("IsHighlighted")
    boolean isHighlighted;

    @SerializedName("HasHomePageFeature")
    boolean hasHomePageFeature;

    @SerializedName("MaxBidAmount")
    Number maxBidAmount;

    @SerializedName("AsAt")
    String asAt;

    @SerializedName("CategoryPath")
    String categoryPath;

    @SerializedName("PictureHref")
    String pictureHref;

    @SerializedName("HasPayNow")
    boolean hasPayNow;

    @SerializedName("IsNew")
    boolean isNew;

    @SerializedName("RegionId")
    int regionId;

    @SerializedName("Region")
    String region;

    @SerializedName("SuburbId")
    int suburbId;

    @SerializedName("Suburb")
    String suburb;

    @SerializedName("BidCount")
    int bidCount;

    @SerializedName("IsReserveMet")
    boolean isReserveMet;

    @SerializedName("HasReserve")
    boolean hasReserve;

    @SerializedName("HasBuyNow")
    boolean hasBuyNow;

    @SerializedName("NoteDate")
    String noteDate;

    @SerializedName("ReserveState")
    int reserveState;

    @SerializedName("IsClassified")
    boolean isClassified;

    @SerializedName("OpenHomes")
    List<OpenHome> openHomes;

    @SerializedName("Subtitle")
    String subtitle;

    @SerializedName("IsBuyNowOnly")
    boolean isBuyNowOnly;

    @SerializedName("RemainingGalleryPlusRelists")
    int remainingGalleryPlusRelists;

    @SerializedName("IsOnWatchList")
    boolean isOnWatchList;

    @SerializedName("GeographicLocation")
    GeographicLocation geographicLocation;

    @SerializedName("PriceDisplay")
    String priceDisplay;

    @SerializedName("TotalReviewCount")
    int totalReviewCount;

    @SerializedName("PositiveReviewCount")
    int positiveReviewCount;

    @SerializedName("HasFreeShipping")
    boolean hasFreeShipping;

    @SerializedName("IsClearance")
    boolean isClearance;

    @SerializedName("WasPrice")
    Number wasPrice;

    @SerializedName("PercentageOff")
    int percentageOff;

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

    public Number getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Number startPrice) {
        this.startPrice = startPrice;
    }

    public Number getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(Number buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    public boolean isHasGallery() {
        return hasGallery;
    }

    public void setHasGallery(boolean hasGallery) {
        this.hasGallery = hasGallery;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setIsBold(boolean isBold) {
        this.isBold = isBold;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    public void setIsHighlighted(boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    public boolean isHasHomePageFeature() {
        return hasHomePageFeature;
    }

    public void setHasHomePageFeature(boolean hasHomePageFeature) {
        this.hasHomePageFeature = hasHomePageFeature;
    }

    public Number getMaxBidAmount() {
        return maxBidAmount;
    }

    public void setMaxBidAmount(Number maxBidAmount) {
        this.maxBidAmount = maxBidAmount;
    }

    public String getAsAt() {
        return asAt;
    }

    public void setAsAt(String asAt) {
        this.asAt = asAt;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getPictureHref() {
        return pictureHref;
    }

    public void setPictureHref(String pictureHref) {
        this.pictureHref = pictureHref;
    }

    public boolean isHasPayNow() {
        return hasPayNow;
    }

    public void setHasPayNow(boolean hasPayNow) {
        this.hasPayNow = hasPayNow;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getSuburbId() {
        return suburbId;
    }

    public void setSuburbId(int suburbId) {
        this.suburbId = suburbId;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public int getBidCount() {
        return bidCount;
    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }

    public boolean isReserveMet() {
        return isReserveMet;
    }

    public void setIsReserveMet(boolean isReserveMet) {
        this.isReserveMet = isReserveMet;
    }

    public boolean isHasReserve() {
        return hasReserve;
    }

    public void setHasReserve(boolean hasReserve) {
        this.hasReserve = hasReserve;
    }

    public boolean isHasBuyNow() {
        return hasBuyNow;
    }

    public void setHasBuyNow(boolean hasBuyNow) {
        this.hasBuyNow = hasBuyNow;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }

    public int getReserveState() {
        return reserveState;
    }

    public void setReserveState(int reserveState) {
        this.reserveState = reserveState;
    }

    public boolean isClassified() {
        return isClassified;
    }

    public void setIsClassified(boolean isClassified) {
        this.isClassified = isClassified;
    }

    public List<OpenHome> getOpenHomes() {
        return openHomes;
    }

    public void setOpenHomes(List<OpenHome> openHomes) {
        this.openHomes = openHomes;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isBuyNowOnly() {
        return isBuyNowOnly;
    }

    public void setIsBuyNowOnly(boolean isBuyNowOnly) {
        this.isBuyNowOnly = isBuyNowOnly;
    }

    public int getRemainingGalleryPlusRelists() {
        return remainingGalleryPlusRelists;
    }

    public void setRemainingGalleryPlusRelists(int remainingGalleryPlusRelists) {
        this.remainingGalleryPlusRelists = remainingGalleryPlusRelists;
    }

    public boolean isOnWatchList() {
        return isOnWatchList;
    }

    public void setIsOnWatchList(boolean isOnWatchList) {
        this.isOnWatchList = isOnWatchList;
    }

    public GeographicLocation getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(GeographicLocation geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public int getTotalReviewCount() {
        return totalReviewCount;
    }

    public void setTotalReviewCount(int totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    public int getPositiveReviewCount() {
        return positiveReviewCount;
    }

    public void setPositiveReviewCount(int positiveReviewCount) {
        this.positiveReviewCount = positiveReviewCount;
    }

    public boolean isHasFreeShipping() {
        return hasFreeShipping;
    }

    public void setHasFreeShipping(boolean hasFreeShipping) {
        this.hasFreeShipping = hasFreeShipping;
    }

    public boolean isClearance() {
        return isClearance;
    }

    public void setIsClearance(boolean isClearance) {
        this.isClearance = isClearance;
    }

    public Number getWasPrice() {
        return wasPrice;
    }

    public void setWasPrice(Number wasPrice) {
        this.wasPrice = wasPrice;
    }

    public int getPercentageOff() {
        return percentageOff;
    }

    public void setPercentageOff(int percentageOff) {
        this.percentageOff = percentageOff;
    }
}


