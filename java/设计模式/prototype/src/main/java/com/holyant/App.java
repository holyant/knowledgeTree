package com.holyant;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        cp.setName("dog");
        cp.setAge(10);
        cp.setClasses(Arrays.asList(new ClassName("语文"),new ClassName("数学")));
        ConcretePrototype cloneCp = (ConcretePrototype)cp.clone();
        cloneCp.show();


    }
}
