package com.holyant;

import java.util.List;

/**
 * @author holyant
 */
public class Prototype implements Cloneable{
    private String name;
    private int age;

    private List<ClassName> classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<ClassName> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassName> classes) {
        this.classes = classes;
    }

    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
