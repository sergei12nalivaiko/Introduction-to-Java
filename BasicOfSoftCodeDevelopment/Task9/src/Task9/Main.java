package Task9;
import java.util.Scanner;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату A.X: ");
        A.x = sc.nextInt();
        System.out.print("Введите координату A.Y: ");
        A.y = sc.nextInt();

        System.out.print("Введите координату B.X: ");
        B.x = sc.nextInt();
        System.out.print("Введите координату B.Y: ");
        B.y = sc.nextInt();

        System.out.print("Введите координату C.X: ");
        C.x = sc.nextInt();
        System.out.print("Введите координату C.Y: ");
        C.y = sc.nextInt();

            if((C.x - A.x) / (B.x - A.x) == (C.y - A.y) / (B.y - A.y)) {
                System.out.println("Точки лежат на одной прямой");
            }
            else {
                System.out.println("Точки не лежат на одной прямой");
            }
    }
}
