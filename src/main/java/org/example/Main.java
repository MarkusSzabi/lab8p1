package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        org.example.Product product = new Product("Bicicleta" , 450);
        UtilClass utilClass = new UtilClass();

        List<Product> products = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++);

        utilClass.adaugaFisier(product);
        Product product1 = new Product("Minge" , 50);
        System.out.println(product);
        System.out.println(product1);
    }
}