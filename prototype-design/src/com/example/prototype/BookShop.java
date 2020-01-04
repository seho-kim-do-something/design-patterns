package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Suppose this is heavy operation that takes long time
    public void loadBooks() {
        for (int i = 0; i < 10; i++) {
            books.add(new Book("Book-"+i));
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public BookShop deepCopyBooks() {
        BookShop bookShop = new BookShop();
        getBooks().forEach(book -> bookShop.getBooks().add(book));
        return bookShop;
    }
}
