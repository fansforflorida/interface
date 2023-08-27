// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

public interface ReadOnlyMovie {
    Rating getRating();

    String getTitle();

    int getYear();
}
