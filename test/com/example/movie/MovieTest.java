// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void setYear_AsReadOnlyMovie_CompilerError() {
        Movie movie = new Movie();
        movie.setTitle("The Princess Bride");
        movie.setYear(1987);
        movie.setRating(Rating.PG);

        ReadOnlyMovie readOnly = movie;
        String title = readOnly.getTitle(); // returns "The Princess Bride"
        int year = readOnly.getYear(); // returns 1987
        Rating rating = readOnly.getRating(); // returns Rating.PG
        // readOnly.setTitle("New Title"); // error!
        // The method setTitle(String) is undefined for the type ReadOnlyMovie

        assertEquals("The Princess Bride", title);
        assertEquals(1987, year);
        assertEquals(Rating.PG, rating);
    }
}
