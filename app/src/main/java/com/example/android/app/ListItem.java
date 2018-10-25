package com.example.android.app;


public class ListItem {

    private String mListItemName;

    private String mListItemDescription;

    private String mListItemLocation;

    private int mImageResourceId;

    public ListItem(String listItemName, String listItemDescription, String listItemLocation, int imageResourceId) {

        mListItemName = listItemName;

        mListItemDescription = listItemDescription;

        mListItemLocation = listItemLocation;

        mImageResourceId = imageResourceId;

    }

    public String getListItemName() {

        return mListItemName;

    }

    public String getListItemDescription() {

        return mListItemDescription;

    }

    public String getListItemLocation() {

        return mListItemLocation;

    }


    public int getImageResourceId() {

        return mImageResourceId;

    }

}
