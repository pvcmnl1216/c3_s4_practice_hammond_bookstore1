/*
 * Author Name: Philip Meshach
 * Date: 28-08-2022
 * Praise The Lord
 */
package com.niit.jdp;

public class Author {

    public String authorName;
    public String authorThoughts;
    public String authorFavourites;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorThoughts='" + authorThoughts + '\'' +
                ", authorFavourites='" + authorFavourites + '\'' +
                '}';
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorThoughts(String authorThoughts) {
        this.authorThoughts = authorThoughts;
    }

    public void setAuthorFavourites(String authorFavourites) {
        this.authorFavourites = authorFavourites;
    }

}
