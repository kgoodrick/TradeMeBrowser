package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kevin on 20/09/15.
 */
public class FoundCategory {

    @SerializedName("Count")
    int count;

    @SerializedName("Category")
    String category;

    @SerializedName("Name")
    String name;

    @SerializedName("IsRestricted")
    boolean isRestricted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }
}