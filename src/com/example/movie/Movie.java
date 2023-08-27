// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

public class Movie implements ReadOnlyMovie {
    private String title;
    private int year;
    private Rating rating;

    @Override
    public Rating getRating() {
        return rating;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
