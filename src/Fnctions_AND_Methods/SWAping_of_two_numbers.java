package Fnctions_AND_Methods;
import java.util.*;
public class SWAping_of_two_numbers {
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" value of a is after swaping :"+a+"\n value of b is after swaping "+b);
		
		
		
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("the value of a befor swaping : "+a);
		System.out.println("the value of b before swaping : "+b);
		System.out.println("\n");
		swap(a,b);
	}

}

