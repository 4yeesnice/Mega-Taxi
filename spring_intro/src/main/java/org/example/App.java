package org.example;

import org.example.model.Config;
import org.example.model.Parrot;
import org.example.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);



        Person person = context.getBean(Person.class);


        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());




    }
}
