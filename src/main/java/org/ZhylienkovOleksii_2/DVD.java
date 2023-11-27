package org.ZhylienkovOleksii_2;

public class DVD {
    private String title;
    private String author;
    private int year;

    public DVD(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

}