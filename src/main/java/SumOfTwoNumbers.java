import java.util.Scanner;

public class SumOfTwoNumbers {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the first number ");
        int num1 = input.nextInt();
        System.out.println("Write the second number");

        int num2 = input.nextInt();

        int sum = sumOfTwoNumber(num1, num2);


        System.out.println(sum);
    }

    private static int sumOfTwoNumber(int num1, int num2) {

        return num1 + num2;

    }
}
