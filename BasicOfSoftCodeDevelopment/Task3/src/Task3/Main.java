package Task3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите в градусах значение переменной x= ") ;
        x=sc.nextDouble();
        System.out.print("Введите в градусах значение переменной y= ") ;
        y=sc.nextDouble();
        double z =((((Math.sin(x) * 180) / Math.PI) + ((Math.cos(y) * 180) / Math.PI)) /
                (((Math.cos(x) * 180) / Math.PI) - ((Math.sin(y) * 180)/ Math.PI)))
                * ((Math.tan(x * y) * 180) / Math.PI);
        System.out.println(z);
    }
}
