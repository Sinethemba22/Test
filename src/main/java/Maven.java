import java.util.Scanner;

public class Maven {
    public static void main (String[] args){
        int num1, num2, ans;

        System.out.println("*****Add two numbers...*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        num2 = sc.nextInt();

        ans = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + ans);
    }
}
