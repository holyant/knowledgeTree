package com.holyant;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();
        ManDecoratorB md3 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md3.setPerson(md2);
        md3.eat();

    }
}
