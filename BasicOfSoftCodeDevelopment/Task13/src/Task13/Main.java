package Task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение а= ");
        int a = sc.nextInt();
        System.out.print("Введите значение b= ");
        int b = sc.nextInt();
        System.out.print("Введите значение h>2 =  ");
        int h = sc.nextInt();
        double y,x;
        for (x = a;x <= b;x += h)
        {
            System.out.print("x= " +x+",");
            y = x;
            System.out.println("y ="+y);
        }
        System.out.println("---------------------------------------");
        double y1,x1;
        System.out.print("Введите значение h1<=2 =  ");
        int h1=sc.nextInt();
        for (x1 = a;x1 <= b;x1 += 1)
        {
            System.out.print("x= " +x1+",");
            y1 = -x1;
            System.out.println("y ="+y1);
        }

    }
}
