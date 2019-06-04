package Task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение угла a= ");
        a = sc.nextFloat();
        System.out.print("Введите значение угла b= ");
        b = sc.nextFloat();
        if(a + b < 180) {
            System.out.println("Треугольник существует");
            if ((a + b == 90 | (a + b == 135 & a == 90 | b == 90))) {
                System.out.println("Треугольние прямоугольный");
            } else {
                System.out.println("Треугольние не является прямоугольным");
            }
        }
        else
        {
            System.out.println("Треугольник не существует");
        }
    }
}
