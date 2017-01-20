package ru.fronto1000;


public class Program {
    public static void main(String[] args) {

        Pond<Duck> duckPond = new Pond<Duck>();
        Generator generator = new Generator();
        for(int i = 0; i < 10; i++){
            duckPond.add(generator.getDuck());
        }
        duckPond.quackAll();

    }
}
