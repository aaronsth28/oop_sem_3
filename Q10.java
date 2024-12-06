import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter length:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter width:");
        Scanner sc1 =new Scanner(System.in);
        int width = sc1.nextInt();

        int peri=2*(length+width);

        System.out.println(peri);
    }
}
