package Task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double min1,min2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a= ");
        double a = sc.nextDouble();
        System.out.print("Введите число b= ");
        double b = sc.nextDouble();
        if(a > b) {
            System.out.println("Число a > b");
            min1 = b;
        }
        else {
            System.out.println("Число а < b");
            min1 = a;
        }
        System.out.print("Введите число c = ");
        double c = sc.nextDouble();
        System.out.print("Введите число d = ");
        double d = sc.nextDouble();
        if(c > d)
        {
            System.out.println("Число c > d");
            min2 = d;
        }
        else
        {
            System.out.print("Число c < d");
            min2 = c;
        }

        if(min1 > min2)
        {
            System.out.println("Максимум = "+min1);
        }
        else
        {
            System.out.println("Максимум = "+min2);
        }
    }
}
