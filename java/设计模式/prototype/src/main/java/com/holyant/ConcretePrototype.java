package com.holyant;

/**
 * @author holyant
 */
public class ConcretePrototype extends Prototype {
    public void show() {
        System.out.println(getAge() + "," + getName() );
        getClasses().forEach(c->System.out.println(c.getName()));
    }
}
