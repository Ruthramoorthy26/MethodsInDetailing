package methodsInDetails_returnType;

import java.util.Scanner;

public class MethodsReturnTypes {

	static Scanner sc = new Scanner(System.in);
	
	public static void nothingReturn() {
		
		System.out.println("Given numbe is whether two digits or not?");
		System.out.println("Just calling method in method calling statement of main method. hence void type.");
		
     
		System.out.println("Enter digits: ");
		int digits = sc.nextInt();

		int count = 0;
		for (int i = digits; i != 0; i = i / 10) {
			if (i % 10 >= 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(digits + " is a two digits number");
		} else {
			System.out.println(digits + " is a not two digits number");
		}

		//System.out.println(1%10);
		//System.out.println(0%10);
		//System.out.println(1/10);
		//System.out.println(0/10);
	}
		
	public static boolean booleanReturnType(int digits, boolean twoDigit) {
		
		int count = 0;
		for (int i = digits; i != 0; i = i / 10) {
			if (i % 10 >= 0) {
				count++;
			}
		}

		if (count == 2) {
			
			/*twoDigit = true;
			return twoDigit;*/
			//return true;
			return !(twoDigit);
		} 
		    /*twoDigit = false;
			return twoDigit;*/
		    //return false;
			return twoDigit;
	}
	
	double volumeOfBox(double length, double height, double width){
		System.out.println("double return type method");
		double volume = length*height*width;
		return volume;
	}
	
	public static int modulus(int no1,int no2) {
		return  no1%no2;
		
	}
	
	public static int innerAddition(int a, int b) {
		return a+b;
	}
	
	public static int outterAddition(int c) {
		//System.out.println("Total of addition: "+c);
     return c;
	}
	
     public static void outterAddition1(int c) {
    	 System.out.println("Just calling and nothing return type method to another method:");
 		System.out.println("Total of addition: "+c);
	}

	public static void main(String[] args) {
		
		MethodsReturnTypes function = new MethodsReturnTypes();
		
		nothingReturn(); // just calling method in calling method statement of main method.hence  void type.
		System.out.println();
		
		System.out.println("Given numbe is whether two digits or not?");
		System.out.println("Enter digits: ");
		int digits = sc.nextInt();
		System.out.println(booleanReturnType(digits,false));
		
//		double volume =function.volumeOfBox(5.5,6.8,7.6);//return type 
//		System.out.println("volume of box by volumeofBox method: "+volume);
//		System.out.println();
//		
//		System.out.println("volumeOfBox method reusing and value get straightly in println statement: \nvolume of box: "+function.volumeOfBox(6.7,8,10.50));
//		System.out.println();
//		
//		System.out.println("runtime parameters in return type:");
//		System.out.println("Enter length of box: ");
//		double length = sc.nextFloat();
//		System.out.println("Enter height of box: ");
//		double height = sc.nextFloat();
//		System.out.println("Enter width of box: ");
//		double width = sc.nextFloat();
//		double volume1 = function.volumeOfBox( length,  height, width);
//		System.out.println("runtime parameters in return type : \nvolume of box: "+volume1);
//		System.out.println();
//		
//		System.out.println("operation executing in return statement: "+modulus(6,5));
//		System.out.println();
//		
//		int total= outterAddition(innerAddition(10,15));
//		System.out.println("return type with invoked one method to other method: "+total);
//		System.out.println();
//		
//		outterAddition1(innerAddition(10,10));
	}

}
