package triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x: ");
            int x = scanner.nextInt();
            System.out.println("Enter y: ");
            int y = scanner.nextInt();
            System.out.println("Enter z: ");
            int z = scanner.nextInt();

            check(x, y, z);
        }
    }

    private static void check(int x,
                              int y,
                              int z) {
        try {
            if (x < 0 || y < 0 || z < 0) {
                throw new IllegalTriangleException("Not a triangle");
            } else {
                if (x + y <= z || x + z <= y || y + z <= x) {
                    throw new IllegalTriangleException("Not a triangle");
                } else {
                    System.out.println("Triangle is oke");
                }
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
