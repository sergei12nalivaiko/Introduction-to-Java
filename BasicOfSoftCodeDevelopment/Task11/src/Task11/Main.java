package Task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double result;
        double result1;
        for(int x = 0;x <= 3;x++)
        {
            result = (Math.pow(x,2)) - 3 * x + 9;
            System.out.println("F(x)=" + result);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x>3= ");
        double x1 = sc.nextDouble();


            result1 = 1 /(Math.pow(x1,3) + 6);
            System.out.println("F(x)=" + result1);

    }
}
