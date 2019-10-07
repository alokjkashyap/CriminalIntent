package com.alox.criminalintent;

import java.util.UUID;

public class Crime extends Object {

    private UUID mId;
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

}
