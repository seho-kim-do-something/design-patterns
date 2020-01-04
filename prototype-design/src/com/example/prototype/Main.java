package com.example.prototype;

public class Main {
    public static void main(String[] args) {
        BookShop bShop1 = new BookShop();
        bShop1.setName("My First BookShop");
        bShop1.loadBooks();

        BookShop bShop2 = bShop1.deepCopyBooks();
        bShop2.setName("My Second BookShop");

        bShop1.getBooks().remove(0);

        System.out.println(bShop1);
        System.out.println(bShop2);
    }
}
