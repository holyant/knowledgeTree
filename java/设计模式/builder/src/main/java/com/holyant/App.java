package com.holyant;

import com.holyant.builder.ConcreteBuilder;
import com.holyant.builder.Director;
import com.holyant.builder.Product;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Product product = new Director().constructProduct(new ConcreteBuilder());
        System.out.println(product);
    }
}
