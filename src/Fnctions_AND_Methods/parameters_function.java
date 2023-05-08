package Fnctions_AND_Methods;
import java.util.*;
public class parameters_function {
public static int calculatesum(int v,int d)//paramerters or formal parameters  
{
		
		int sum=v+d;
		
		return sum;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=calculatesum(a,b);//argument or actual parameters
	System.out.print("sum  : "+ sum);
}
}
