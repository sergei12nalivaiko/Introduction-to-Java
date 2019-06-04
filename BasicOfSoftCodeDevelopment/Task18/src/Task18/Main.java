package Task18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число m= ");
        int m = sc.nextInt();
        System.out.print("Введите число n= ");
        int n = sc.nextInt();
        if(n > m) {
            for(int i = m;i < n;i++) {
                for(int j  =2;j < n;j++) {
                    if(i % j == 0 & i != j) {
                        System.out.printf("Для числа %d делитель=%d \n",i,j);
                    }
                }
            }
        }
        if(m > n) {
            for(int i = n;i < m;i++) {
                for(int j = 2;j < m;j++) {
                    if(i % j == 0 & i != j) {
                        System.out.printf("Для числа %d делитель=%d \n",i,j);
                    }
                }
            }
        }
    }
}
