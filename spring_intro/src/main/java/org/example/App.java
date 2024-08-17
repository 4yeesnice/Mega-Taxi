package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        Parrot p = context.getBean(Parrot.class);

        whatever w = context.getBean(whatever.class);

        System.out.println("Parrot's name: " + p.getName());




    }
}
