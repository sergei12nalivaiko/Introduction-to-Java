package Task17;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] chars = "abcdefghijklmnopqrstuvwxyz01234567890".toCharArray();

        System.out.println("char  unicode   hex      code");
        for (char c : chars)
            System.out.println(String.format("'%s' : %s", c,  (int) c));
    }
}
