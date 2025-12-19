import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    // default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // parameterized constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // method to calculate area
    double area() {
        return length * breadth;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Area using default constructor = " + r1.area());

        // user input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // using parameterized constructor
        Rectangle r2 = new Rectangle(l, b);
        System.out.println("Area using parameterized constructor = " + r2.area());

        sc.close();
    }
}
