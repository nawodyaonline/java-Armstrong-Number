import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, r = 0;
        System.out.println("Enter a number:");
        int value = sc.nextInt();
        int temp = value;
        while (value > 0) {
            r = value % 10;
            value = value / 10;
            sum = sum + (r * r * r);
        }
        if(temp == sum)
            System.out.println("Armstrong Number");

        else 
            System.out.println("Not a Armstrong Number");

    }
}