package com.truetoyourshelf.truetoyourselfapi;

import java.util.List;

public class Book {

    public String title;
    public String author;
    public String[] subject;
    public String URLbeg = "https://api.dp.la/v2/items?q=";
    public String URLend = "&sourceResource.type=%22text%22&fields=sourceReso[…]ame=English&page_size=1&api_key=c44b31886102636bcb386abc55a62211";


    public Book(){
    }

    public Book(String title, String author,  String[] subject){
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String[] getBook(){

        String[] book = new String[2];
        book[0] = this.title;
        book[1] = this.author;

        return book;
    }

    public String getListBooks(String emotion){

        String URL = URLbeg + emotion + URLend;
        return URL;
    }

}