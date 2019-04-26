package com.example.android.miwok;

/**
 * Created by Nour Ahmed on 8/4/2018.
 */

public class Word {

    private String mMiwokTranslation ;
    private String mDefaultTranslation ;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId =NO_IMAGE_PROVIDED;
    private int mAudioResourceId;


    public Word(String miwokTranslation ,String defaultTranslation,int imageResourceId,int audioResourceId)
    {
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;

    }
    public Word(String miwokTranslation ,String defaultTranslation,int audioResourceId)
    {
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mAudioResourceId=audioResourceId;

    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId!=-1;
    }
    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }
}
