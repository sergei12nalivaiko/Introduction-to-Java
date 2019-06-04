package Task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры кирпича x,y,z");
        System.out.print("Введите размер кирпича x= ");
        int x = sc.nextInt();
        System.out.print("Введите размер кирпича y= ");
        int y = sc.nextInt();
        System.out.print("Введите размер кирпича z= ");
        int z = sc.nextInt();


        System.out.println("Введите размеры прямоугольного отверстия A,B");
        System.out.print("Введите размер A= ");
        int A = sc.nextInt();
        System.out.print("Введите размер B= ");
        int B = sc.nextInt();

        if(A > x & B > y | A > y & B > z | A > x & B > z) {
            System.out.print("Кирпич пройдет через отверстие");
        }
        else {
            System.out.print("Кирпич не пройдет через отверстие");
        }

    }
}
