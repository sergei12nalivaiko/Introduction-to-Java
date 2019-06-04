package Task16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double summa = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение числа e= ");
        double e = sc.nextDouble();
        for(int i=1;i <= e;i++) {
            summa += 1 / (Math.pow(2,i)) +1 / (Math.pow(3,i));
        }
        System.out.println(summa);
    }
}
