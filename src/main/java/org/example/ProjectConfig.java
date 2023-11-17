package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    /*@Bean
    public Person person(@Qualifier("dog2") Dog dog){
        Person person = new Person();
        person.setName("Alex");
        person.setDog(dog);
        return person;
    }*/

    /*@Bean
    public Person person(Dog dog2){
        Person person = new Person();
        person.setName("Alex");
        person.setDog(dog2);
        return person;
    }*/

    @Bean
    public Dog dog1(){
        Dog dog = new Dog();
        dog.setName("Reks");
        return dog;
    }

    @Bean
    public Dog dog2(){
        Dog dog = new Dog();
        dog.setName("Sharik");
        return dog;
    }
}
