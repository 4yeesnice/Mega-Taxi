package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;


//    @Autowired
//    private Parrot parrot;


//    @Autowired    // Можно связать несколько бинов к одному через Autowired, но он добавит самый первый из всех,
//    предварительно сортирую по названию.
//    @Qualifier("parrot2") Можно добавить @Qualifier к private Parrot parrot, чтобы указать какой конкретный нужен
    private Parrot parrot;


    // А можно связать путем конструктора и Qualifier несколько бинов и еще сделать private FINAL Parrot parrot.
    // Но в таком случае надо изначально указать чему будут равны поля в этом классе. В данном случае name.
    // Если мы не укажем, то name будет null
    // Либо можно указать все в Config и обложить Bean и добавить Qualifier. Плюс то, что можно там менять поля класса как
    // захочется. Однако при таком методе нужно будет убрать конструктор, он не нужен

//
//    public Person(@Qualifier("parrot2") Parrot parrot) {
//        this.parrot = parrot;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }



}





