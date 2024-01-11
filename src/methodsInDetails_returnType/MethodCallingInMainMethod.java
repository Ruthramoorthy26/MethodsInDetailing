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
		
		return "id is "+id+"\nname is "+name;/*here we return only String but we add integer type..but we add integer with String..
		so '+' is act as concatenation. because String nature is any type with add it.string act as concatenation so..we get string 
		with other data types when we return type is string..but we return type is not string, now we can get multiple data types as return type.*/ 
	}
}

