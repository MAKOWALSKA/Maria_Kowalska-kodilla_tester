package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        new BookManager().createBook("La Divina Comedia","Dante Alighieri");
        new BookManager().createBook("Il Canzoniere","Francesco Petrarca");
        new BookManager().createBook("Decamerone","Giovanni Boccaccio");


        System.out.println("La Divina Comedia" == "Il Canzoniere");
        System.out.println("La Divina Comedia".equals("Il Canzoniere"));
        System.out.println("----------------");
        System.out.println("La Divina Comedia" == "La Divina Comedia");
        System.out.println("La Divina Comedia".equals("La Divina Comedia"));
        System.out.println("----------------");
        System.out.println("Decamerone" == "Il Canzoniere");
        System.out.println("Decamerone".equals("Il Canzoniere"));
        System.out.println("----------------");
        System.out.println("Dante Alighieri" == "Francesco Petrarca");
        System.out.println("Dante Alighieri".equals("Francesco Petrarca"));
        System.out.println("----------------");
        System.out.println("Francesco Petrarca" == "Giovanni Boccaccio");
        System.out.println("Francesco Petrarca".equals("Giovanni Boccaccio"));
        System.out.println("----------------");
        System.out.println("Francesco Petrarca" == "Francesco Petrarca");
        System.out.println("Francesco Petrarca".equals("Francesco Petrarca"));
        System.out.println("----------------");
    }
}