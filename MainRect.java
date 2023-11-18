package classes_objects;

import java.util.Arrays;
import java.util.Scanner;

public class MainRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        Rectangle[] rectangles = new Rectangle[3];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle();
            rectangles[i].readRectangle(scanner);
        }

        System.out.println(Arrays.toString(rectangles));

    }
}
