package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Alex";

    //@Autowired
    private final Dog dog;

    //private Dog dog;

    //@Autowired
   public Person(Dog dog2) {
        this.dog = dog2;
    }

    public Dog getDog() {
        return dog;
    }

    //@Autowired
    /*public void setDog(Dog dog) {
        this.dog = dog;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
