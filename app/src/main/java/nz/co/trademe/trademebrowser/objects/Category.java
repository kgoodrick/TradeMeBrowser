package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevin on 18/09/15.
 */
public class Category {

    @SerializedName("Name")
    String name;

    @SerializedName("Number")
    String number;

    @SerializedName("Path")
    String path;

    @SerializedName("Subcategories")
    List<Category> subCategories;

    @SerializedName("Count")
    int count;

    @SerializedName("IsRestricted")
    boolean isRestricted;

    @SerializedName("HasLegalNotice")
    boolean hasLegalNotice;

    @SerializedName("HasClassifieds")
    boolean hasClassifieds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public boolean isHasLegalNotice() {
        return hasLegalNotice;
    }

    public void setHasLegalNotice(boolean hasLegalNotice) {
        this.hasLegalNotice = hasLegalNotice;
    }

    public boolean isHasClassifieds() {
        return hasClassifieds;
    }

    public void setHasClassifieds(boolean hasClassifieds) {
        this.hasClassifieds = hasClassifieds;
    }
}