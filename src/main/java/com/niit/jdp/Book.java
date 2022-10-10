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


    public void displayBookDetail() {

        String isbnNumber = "23456";
        String title = "Do your self";
        String description = "Mind your own business";
        int price = 1499;
        String yearOfPublication = "2022";
        Author author;
        String authorName = "Meshach";
        String authorThoughts = "unknown";
        String authorFavourites = "useless";

        System.out.println("isbnNumber = " + isbnNumber);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
        System.out.println("yearOfPublication = " + yearOfPublication);
        System.out.println("authorName = " + authorName);
        System.out.println("authorThoughts = " + authorThoughts);
        System.out.println("authorFavourites = " + authorFavourites);

    }

}


