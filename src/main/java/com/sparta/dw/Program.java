package com.sparta.dw;

public class Program {
    public static void main(String[] args){
        GreetingGenerator gG = new GreetingGenerator();
        String greeting = gG.getGreeting(12);
        System.out.println(greeting);

        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(6);
        System.out.println(ages);
    }
}
