package methodsInDetails_returnType;

import java.util.Scanner;

public class FourTypesOfMethodReturnType {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		noArgumentsWithNoReturnType();
		System.out.println();
		
		System.out.println(noArgumentsWithReturnType());
		System.out.println();
		
		System.out.println("With Arguments With Return Type");
		System.out.println("Enter no1: ");
		int no1 = scanner.nextInt();
		System.out.println("Enter no2: ");
		int no2 = scanner.nextInt();
		String smallest = withArgumentsWithReturnType(no1,no2);
		System.out.println(smallest);
		System.out.println();
		
		System.out.println("With Arguments Without Return Type");
		System.out.println("Enter no3: ");
		int no3 = scanner.nextInt();
		System.out.println("Enter no4: ");
		int no4 = scanner.nextInt();
		String smallest1 = withArgumentsWithOutReturnType(no3,no4);
		System.out.println(smallest1);
		System.out.println();

	}

	private static void noArgumentsWithNoReturnType() {
		System.out.println("No Arguments With No Return Type");
		System.out.println("Enter no1: ");
		int no1 = scanner.nextInt();
		System.out.println("Enter no2: ");
		int no2 = scanner.nextInt();
		
		if(no1<no2) {
			System.out.println("no1 - "+no1+" is samllest than no2 - "+no2);
		}
		else {
			System.out.println("no2 - "+no2+"  is samllest than no1 - "+no1);			
		}
	}
	
	private static String noArgumentsWithReturnType() {
		System.out.println("No Arguments With Return Type");
		System.out.println("Enter no1: ");
		int no1 = scanner.nextInt();
		System.out.println("Enter no2: ");
		int no2 = scanner.nextInt();
		
		if(no1<no2) {
			return "no1 - "+no1+" is samllest than no2 - "+no2;
		}
		else {
			return "no2 - "+no2+"  is samllest than no1 - "+no1;	
		}
	}
	
	private static String withArgumentsWithReturnType(int no1, int no2) {
		if(no1<no2) {
		    return "no1 - "+no1+" is samllest than no2 - "+no2;
		}
			return "no2 - "+no2+"  is samllest than no1 - "+no1;	
	}
		
	
	
	private static String withArgumentsWithOutReturnType(int no3, int no4) {
		if(no3<no4) {
		  String no3Small = "no3 - "+no3+" is samllest than no4 - "+no4;
		  return no3Small;
		}
		  String no4Small = "no4 - "+no4+"  is samllest than no1 - "+no3;	
		  return no4Small;
	} 	

}
