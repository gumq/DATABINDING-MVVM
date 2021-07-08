package com.votandao.databinding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class Film {
    private String nameFilm;
    private String author;
    private boolean active;
    private String imageUrl;
    private int numberStarFeedBack;

    public Film(String nameFilm, String author, boolean active, String imageUrl, int numberStarFeedBack) {
        this.nameFilm = nameFilm;
        this.author = author;
        this.active = active;
        this.imageUrl = imageUrl;
        this.numberStarFeedBack = numberStarFeedBack;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getNumberStarFeedBack() {
        return numberStarFeedBack;
    }

    public void setNumberStarFeedBack(int numberStarFeedBack) {
        this.numberStarFeedBack = numberStarFeedBack;
    }

    @Override
    public String toString() {
        return  nameFilm  + "|"+
                 author ;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }
}
