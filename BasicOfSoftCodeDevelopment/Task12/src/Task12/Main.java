package Task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число = ");
        long x = sc.nextLong();
        for(int y = 1;y < x;y++) {
            result = result + y;
        }
        System.out.println(result);
    }
}
