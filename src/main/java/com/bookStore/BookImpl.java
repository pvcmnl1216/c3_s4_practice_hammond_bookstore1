/*
 * Author Name: Philip Meshach
 * Date: 28-08-2022
 * Praise The Lord
 */
package com.bookStore;


import com.niit.jdp.Author;
import com.niit.jdp.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Do your self");
        System.out.println("book.title = " + book.title);
        book.setIsbnNumber("23456");
        System.out.println("book.setIsbnNumber; = " + book.isbnNumber);
        book.setDescription("Mind your own business");
        System.out.println("book.description = " + book.description);
        book.setPrice(499);
        System.out.println("book.price = " + book.price);
        Author author = new Author();
        author.setAuthorName("Meshach");
        author.setAuthorFavourites("useless");
        author.setAuthorThoughts("unknown");
        System.out.println("author.authorThoughts = " + author.authorThoughts);
        System.out.println("author.authorName = " + author.authorName);
        System.out.println("author.authorFavourites = " + author.authorFavourites);

    }
}