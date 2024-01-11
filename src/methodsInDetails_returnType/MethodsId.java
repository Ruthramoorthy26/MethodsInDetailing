package methodsInDetails_returnType;

import java.util.Scanner;

public class MethodsId {
	void showMenu() {
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division") ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option to perform from given above options: ");        //here, even if we don't give println..that run time input will work..because we used scanner line(11) and runtime input line(13).
		int Option = sc.nextInt();
		System.out.println("pls enter 1'st input");
		int a = sc.nextInt(); 
		System.out.println("pls enter 2'nd input");
		int b = sc.nextInt();
		switch (Option) {
		case 1:{
		    printdata(addition( a,b));
		    break;
		}
		case 2:{
			printdata(subtraction(a,b));
			break;
		}
		case 3:{
			printdata(multiplication(a,b));
			break;
		}
		case 4:{
			printdata(division(a,b));
			break;
		}
		default:{
			System.out.println("pls select a valid option from 1 to 4");
		}
		}
}
	int addition(int a, int b) {
	int result = a + b;                             
	return result;
	}
	int subtraction(int x, int y) {//here a and b is run time inputs, so a and b changed as runtime numbers.. so we can here declare name x and y to runtime a and b values.
		return x - y;         
	}
	int multiplication(int a, int b) {
		return a * b;
	}
	int division(int a, int b) {
		return a / b; 
	}
	void printdata( int result ) {                     
		System.out.println(result);
	}
	public static void main(String[] args) {
		MethodsId rt = new MethodsId();
		rt.showMenu();
	}

}
