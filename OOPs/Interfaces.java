interface Animal {
    public void walk(); // by default abstract and public

    int eyes = 2; // fixed value cannot be changed

    // constructor cannot we called in interfaces
}

interface Herbivore {

}

class Horse implements Animal, Herbivore { // multiple inheritance
    public void walk() {
        System.out.println("walks on 4 leg");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }

}
