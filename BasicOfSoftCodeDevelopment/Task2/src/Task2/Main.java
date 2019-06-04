package Task2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите значение переменной а= ") ;
        a=sc.nextDouble();
        System.out.print("Введите значение переменной b= ") ;
        b=sc.nextDouble();
        System.out.print("Введите значен2ие переменной c= ") ;
        c=sc.nextDouble();
        double z=((b + (Math.sqrt((Math.pow(b,2)) + (4 * a * c))))/(2 * a))
                - (((Math.pow(a,3)) * c)+(Math.pow(b,-2)));
        System.out.println(z);
    }
}
