package org.example.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.model")
public class Config {

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("2Niggers");
        return p;
    }

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("22133s");
        return p;
    }


    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot){
        Person p = new Person();
        p.setName("SupaNigger");
        p.setParrot(parrot);
        return p;
    }



//    @Bean
//    public Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("Nigger");
//        return parrot;
//    }
//
//
//    @Bean
//    public Person person(Parrot parrot){
//        Person person = new Person();
//        person.setName("John");
//        person.setParrot(parrot);
//        return person;
//    }

}
