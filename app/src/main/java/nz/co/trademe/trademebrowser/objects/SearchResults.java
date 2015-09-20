package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevin on 19/09/15.
 */
public class SearchResults {

    @SerializedName("TotalCount")
    int totalCount;

    @SerializedName("Page")
    int page;

    @SerializedName("PageSize")
    int pageSize;

    @SerializedName("List")
    List<Listing> list;

    @SerializedName("DidYouMean")
    String didYouMean;

    @SerializedName("FoundCategories")
    List<FoundCategory> foundCategories;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Listing> getList() {
        return list;
    }

    public void setList(List<Listing> list) {
        this.list = list;
    }

    public String getDidYouMean() {
        return didYouMean;
    }

    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    public List<FoundCategory> getFoundCategories() {
        return foundCategories;
    }

    public void setFoundCategories(List<FoundCategory> foundCategories) {
        this.foundCategories = foundCategories;
    }
}

/*
"FavouriteId": 0,
"FavouriteType": 0,
"Parameters": [
    {
    "DisplayName": "ABC",
    "Name": "ABC",
    "LowerBoundName": "ABC",
    "UpperBoundName": "ABC",
    "Type": 0,
    "AllowsMultipleValues": false,
    "MutualExclusionGroup": "ABC",
    "DependentOn": "ABC",
    "ExternalOptionsKey": "ABC",
    "Options": [
    {
    "Value": "ABC",
    "Display": "ABC"
    },
    {
    "Value": "ABC",
    "Display": "ABC"
    }
    ]
    },
    {
    "DisplayName": "ABC",
    "Name": "ABC",
    "LowerBoundName": "ABC",
    "UpperBoundName": "ABC",
    "Type": 0,
    "AllowsMultipleValues": false,
    "MutualExclusionGroup": "ABC",
    "DependentOn": "ABC",
    "ExternalOptionsKey": "ABC",
    "Options": [
    {
    "Value": "ABC",
    "Display": "ABC"
    },
    {
    "Value": "ABC",
    "Display": "ABC"
    }
    ]
    }
],
"SortOrders": [
    {
    },
    {
    }
],
"MemberProfile": {
    "FirstName": "ABC",
    "Occupation": "ABC",
    "Biography": "ABC",
    "Quote": "ABC",
    "Photo": "ABC",
    "IsEnabled": false,
    "DateRemoved": "\/Date(946638000000)\/",
    "Member":
        {
        "MemberId": 0,
        "Nickname": "ABC",
        "DateAddressVerified": "\/Date(946638000000)\/",
        "DateJoined": "\/Date(946638000000)\/",
        "UniqueNegative": 0,
        "UniquePositive": 0,
        "FeedbackCount": 0,
        "IsAddressVerified": false,
        "Suburb": "ABC",
        "IsDealer": false,
        "IsAuthenticated": false,
        "IsInTrade": false,
        "ImportChargesMayApply": false
        },
    "FavouriteId": 0,
    "Store": {
    "Name": "ABC",
    "LogoImageUri": "ABC",
    "BannerImageUri": "ABC",
    "Promotions": [
    {
    "ImageUri": "ABC"
    },
    {
    "ImageUri": "ABC"
    }
    ]
    }
},
"Ads": [
    {
    "Title": "ABC",
    "Subtitle": "ABC",
    "Details": "ABC",
    "AdImageUri": "ABC",
    "BrandLogoUri": "ABC",
    "ListOffset": 0,
    "ActionUri": "ABC",
    "Action": 0,
    "ActionListingId": 0
    },
    {
    "Title": "ABC",
    "Subtitle": "ABC",
    "Details": "ABC",
    "AdImageUri": "ABC",
    "BrandLogoUri": "ABC",
    "ListOffset": 0,
    "ActionUri": "ABC",
    "Action": 0,
    "ActionListingId": 0
    }
]
*/