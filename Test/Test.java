import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int re = sc.nextInt();
        
        System.out.println((A + " ").repeat(re));

    }
}
