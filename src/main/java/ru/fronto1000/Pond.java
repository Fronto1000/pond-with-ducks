package ru.fronto1000;


import java.util.ArrayList;
import java.util.List;

public class Pond <T extends Duck> {
    private List<T> ducks;

    public Pond(){
        ducks = new ArrayList<T>();
    }

    public void add(T t){
        this.ducks.add(t);
    }

    public void quackAll(){
        for(T t:ducks){
            t.quack();
            t.swim();
        }
    }

}
