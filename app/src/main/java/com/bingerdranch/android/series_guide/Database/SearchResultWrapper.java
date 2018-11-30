package com.bingerdranch.android.series_guide.Database;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResultWrapper {

    @SerializedName("Search")
    List<SearchSeriesWrapper> searchResult;

    public SearchResultWrapper(List<SearchSeriesWrapper> searchResult) {
        this.searchResult = searchResult;
    }

    public List<SearchSeriesWrapper> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<SearchSeriesWrapper> searchResult) {
        this.searchResult = searchResult;
    }

    @Override
    public String toString() {
        return "SearchResultWrapper{" +
                "searchResult=" + searchResult +
                '}';
    }

}
