package ru.fronto1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    List<String> ducks;
    Duck duck;

    public Generator(){
        this.ducks = new ArrayList<String>();
        this.ducks.add("ru.fronto1000.Mandarin");
        this.ducks.add("ru.fronto1000.Widgeon");
    }

    public Duck getDuck() {
        Random random = new Random();
        Duck duck = null;
        int index = random.nextInt(this.ducks.size());
        try {
            Class c = Class.forName(this.ducks.get(index));
            Object obj = c.newInstance();
            if(index == 0){
                duck = (Mandarin)obj;
            }else {
                duck = (Widgeon)obj;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return duck;
    }
}
