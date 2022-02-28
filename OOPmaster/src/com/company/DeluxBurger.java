package com.company;

public class DeluxBurger extends Hamburger{
    public DeluxBurger(String breadType, double meat, String name, double price) {
        super("Potato", meat, "Delux", 10);
        this.addTomato("Chip", 1.00);
        this.addTomato("Soda", 1.50);
    }


    @Override
    public void addLettuce(String name, double price) {
        System.out.println("No additions can be added");
    }

    @Override
    public void addTomato(String name, double price) {
        System.out.println("No additions can be added");
    }

    @Override
    public void addCheese(String name, double price) {
        System.out.println("No additions can be added");
    }

    @Override
    public void addOnion(String name, double price) {
        System.out.println("No additions can be added");
    }

    @Override
    public void addMushroom(String name, double price) {
        System.out.println("No additions can be added");
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
