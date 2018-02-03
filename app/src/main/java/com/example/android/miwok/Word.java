package com.example.android.miwok;

/**
 * Created by Anisha on 02/02/2018.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResID;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResID) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResID = imageResID;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResID() {
        return imageResID;
    }
}
