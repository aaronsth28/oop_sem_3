import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter another number:");
        Scanner sC1 = new Scanner(System.in);
        int num1=sC1.nextInt();

        int add=num+num1;
        int sub=num1-num;
        int mul=num1*num;
        int div=num1/num;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
