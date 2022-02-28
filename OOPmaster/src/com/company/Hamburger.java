package com.company;

public class Hamburger {
    private String breadType;
    private double meat;
    private String name;
    private double price;

    private String lettuce;
    private double lettucePrice;
    private String tomato;
    private double tomatoPrice;
    private String cheese;
    private double cheesePrice;
    private String onion;
    private double onionPrice;
    private String mushroom;
    private double mushroomPrice;



    public Hamburger(String breadType, double meat, String name, double price) {
        this.breadType = breadType;
        this.meat = meat;
        this.name = name;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadType + " with " + this.meat +
                ", price is " + this.price);
    }
    public void baseBurger(){
        System.out.println("Your burger with this meat ");
    }

    public void addLettuce(String name, double price){
        this.lettuce = name;
        this.lettucePrice = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public void addTomato(String name, double price){
        this.tomato = name;
        this.tomatoPrice = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public void addCheese(String name, double price){
        this.cheese = name;
        this.cheesePrice = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public void addOnion(String name, double price){
        this.onion = name;
        this.onionPrice = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public void addMushroom(String name, double price){
        this.mushroom = name;
        this.mushroomPrice = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public double totalHamburger(){
        return this.mushroomPrice + this.tomatoPrice + this.onionPrice + this.cheesePrice + this.price;
    }

    public double getPrice() {
        return price;
    }
}
