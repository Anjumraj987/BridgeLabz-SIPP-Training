package Level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is even.");
                } else {
                    System.out.println(numbers[i] + " is odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }
        if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than last.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First number is less than last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

    }
}
