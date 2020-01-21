package com.example.user.musicplayer;

/**
 * Created by User on 06-May-18.
 */

public class Music {

    private String mMusicTitle;
    private String mAuthor;
    private int mImage;


    public Music (String author, String musicTitle, int image)
    {
        mMusicTitle = musicTitle;
        mAuthor = author;
        mImage = image;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public int getImage()
    {
        return mImage;
    }

    public String getMusicTitle() {
        return mMusicTitle;
    }
}
