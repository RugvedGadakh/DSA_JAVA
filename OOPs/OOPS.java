class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non parameterized constructor

    Students() {
        System.out.println("constructor called");
    }

    // parameterized constructor

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Students(Students s) {
        this.name = s.name;
        this.age = s.age;
    }

    // compile time polymorphism

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}

public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ball";

        pen1.printColor();
        pen2.printColor();

        System.out.println();

        // non parameterized constructor
        Students s1 = new Students();
        s1.name = "John";
        s1.age = 30;
        s1.printInfo();

        System.out.println();

        // parameterized constructor
        Students s2 = new Students("Jane", 25);
        s2.printInfo();

        System.out.println();

        // copy constructor
        Students s3 = new Students(s1);
        s3.printInfo();
    }
}