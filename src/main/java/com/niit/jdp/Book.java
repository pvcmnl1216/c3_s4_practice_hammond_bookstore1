/*
 * Author Name: Philip Meshach
 * Date: 28-08-2022
 * Praise The Lord
 */
package com.niit.jdp;

public class Book {

    public String isbnNumber;
    public String title;
    public String description;
    public int price;
    public String yearOfPublication;

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    public String displayBookDetail() {
        String isbn = "23456";
        String title = "Do your self";
        String description = "Mind your own business";
        int price = 499;
        String yearOfPublication = "2022";
        Author author;
        String authorName = "Meshach";
        String authorThoughts = "unknown";
        String authorFavourites = "useless";

        return displayBookDetail();
    }

}


