//Single Level Inheritance 

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * h * l);
    }
}

// Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * h * l);
    }
}

// Heirarchinal inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// hybride Inheritance -----> combo of above 3

public class Inheritance {

    public static void main(String[] args) {

    }

}
