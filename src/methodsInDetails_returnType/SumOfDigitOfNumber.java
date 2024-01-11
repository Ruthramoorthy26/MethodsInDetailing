package methodsInDetails_returnType;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public int sumOfDigits(int num, int digit, int sum) {

		for (int i = num; i != 0; i = i / 10) {
			digit = i % 10;
			sum = sum + digit;
		}

		return sum;
		}

	public static void main(String[] args) {

		SumOfDigitOfNumber objectOfSum = new SumOfDigitOfNumber();

		Scanner scan = new Scanner(System.in);

//		for(int i  = 1;i<10;i++) {
//			int a = scan.nextInt();
//		System.out.println(a%10);
//		}

		int digit = 0;
		int sum = 0;
		System.out.println("Enter number fo find sum of digits of number: ");
		int number = scan.nextInt();

		int sumOfDigitsOfNumber = objectOfSum.sumOfDigits(number, digit, sum);
		System.out.println("sum of digit of given Number: " + sumOfDigitsOfNumber);
		System.out.println();
		
		System.out.println("Enter number fo find sum of digits of number: ");
		int number1 = scan.nextInt();
		System.out.println(objectOfSum.sumOfDigits(number1, digit, sum));
		System.out.println();
		
		System.out.println("Enter number fo find sum of digits of number: ");
		int number2 = scan.nextInt();
		System.out.println(objectOfSum.sumOfDigits(number2, digit, sum));
		System.out.println();
		
		System.out.println("Enter number fo find sum of digits of number: ");
		int number3 = scan.nextInt();
	    System.out.println(objectOfSum.sumOfDigits(number3, digit, sum));
	}
}
