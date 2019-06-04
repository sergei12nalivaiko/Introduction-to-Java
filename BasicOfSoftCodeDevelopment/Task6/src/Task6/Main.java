package Task6;

//import java.awt.*;
//import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int  x[] = {0,1,2,3,4,-1,-2,-3,-4};
        int  y[] = {0,1,2,3,4,-1,-2,-3,-4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату х: ");
        int x1 = sc.nextInt();
        System.out.print("Введите координату Y: ");
        int y1=sc.nextInt();
        for(int a = 0;a < x.length;a++) {
            for(int b = 0;b < y.length;b++) {
                if(x1 == x[a] & y1 == y[b]) {
                    if(Math.abs(y1) > 4 | Math.abs(x1) > 4 |((x1 > 2 & y1 > 0) | (x1 < -2 & y1 > 0))) {
                        System.out.println("False");
                    }
                    else {
                        System.out.println("True");
                    }
                }
            }
        }

        /*Point result=new Point();
        Point p=new Point();
        ArrayList<Point> points=new ArrayList<Point>(){{add(new Point(p.x=4,p.y=-3));add(new Point(p.x=-4,p.y=-3));
                                                        add(new Point(p.x=2,p.y=4));add(new Point (p.x=-2,p.y=4));}};
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите координату х: ");
        result.x=sc.nextInt();
        System.out.print("Введите координату Y: ");
        result.y=sc.nextInt();
        System.out.println(points.size());

        points.forEach(n->{
            if(Math.abs(result.x)>Math.abs(n.x) | Math.abs(result.y)>Math.abs(n.y))
            {
                System.out.println("False");
            }
            else
            {
                System.out.println("True");
            }
        });
        */

    }
}
