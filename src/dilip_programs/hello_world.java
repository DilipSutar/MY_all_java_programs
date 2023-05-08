package dilip_programs;
import java.util.*;
public class hello_world {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two numbers you wanted to add : ");
	int a=sc.nextInt();
	int b= sc.nextInt();
	
	int c=a+b;
	System.out.print("the addition of "+ a +" and "+b+" is ");
	System.out.print(c);

}

}
