package methodsInDetails_returnType;

import java.util.Scanner;

public class MethodCallingInMainMethod {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Enter id:");
		int  id = sc.nextInt();
		System.out.println("Entern name:");
		String name = sc.next(); 
		String name1 =methodOne(id,name);
		System.out.println(name1);
	}
	
	public static String methodOne(int id, String name) {
		
		return "id is "+id+"\nname is "+name;
	}
}

