package com.company;

public class HealthyBurger  extends Hamburger{
    private String healthyMayo;
    private double healthyMayoPrice;
    private String spinach;
    private double spinachPrice;

    public HealthyBurger(String breadType, double meat, String name, double price) {
        super("brown rye on a roll", meat, name, 2);

    }
    public void addMayo(String name, double price){
        this.healthyMayo = name;
        this.healthyMayoPrice = price;


    }
    public void addSpinach(String name, double price){
        this.spinach = name;
        this.spinachPrice = price;


    }
    public double healthyBurgerTotal(){
        return super.getPrice()  + this.spinachPrice + this.healthyMayoPrice;
    }



}
