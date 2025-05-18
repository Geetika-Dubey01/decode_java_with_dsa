package strings;
import java.util.Scanner;
public class inputstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name");
        String str = sc.next(); //for full sentence sc.nextline()
        System.out.println(str);
    }
}