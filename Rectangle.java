package classes_objects;

import java.util.Scanner;

public class Rectangle {
    double a;
    private double b;

    public void readRectangle(Scanner scanner) {
      //  Scanner scanner = new Scanner(System.in);
         System.out.print("a=");
         this.a = scanner.nextDouble();
         System.out.print("b=");
         this.b = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + " s= " + area() + " p = " + perimeter();
    }

    // конструкторы
    public Rectangle(double aa, double bb) {
        setA(aa);
        setB(bb);
    }
    public Rectangle() {
        this.a = 100;
        this.a = 100;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
       if (a > 0)  {
           this.a = a;
       }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public double area() {
        return this.a * this.b;
    }

    public double perimeter() {
        return 2.0 * (a + b);
    }
}
