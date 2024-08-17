package org.example;


import org.springframework.stereotype.Component;

@Component
public class Parrot {


    public Parrot(){
        this.name = "Nigger";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
