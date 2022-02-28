package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Wheat", 1.00, "Watta", 2.00);
        hamburger.addTomato("Tomato", .50);
        hamburger.addCheese("Cheese",.50);
        hamburger.addMushroom("Mushroom",.25);
        System.out.println(hamburger.totalHamburger());


    }
}
