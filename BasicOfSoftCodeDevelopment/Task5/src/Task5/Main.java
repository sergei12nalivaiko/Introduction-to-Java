package Task5;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        final int h = 3600;
        final int m = 60;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральнок число: ");
        int sec = sc.nextInt();
        int hours = sec / h;
        int residue = sec - hours * h;
        int minutes = residue / m;
        residue = sec - minutes * m;
        System.out.printf("%d:%d:%d",hours,minutes,residue);
    }
}
