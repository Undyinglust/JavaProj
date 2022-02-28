package com.example.test;

import java.util.Scanner;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public X(Scanner x){
        System.out.println("Please enter a number");
        this.x = x.nextInt();
    }
    public void x(){
        int x;
        for( x = 0; x <=12;x++){
            System.out.println(x + "\tx\t" + this.x + "\t=\t" + (x * this.x));

        }

    }


}
