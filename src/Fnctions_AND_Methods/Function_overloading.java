package Fnctions_AND_Methods;

public class Function_overloading {
	public static int multiplication(int a,int b) {
		int sum;
return sum=a+b;		
	}
	public static int multiplication(int a,int b,int c) {

		return a+b+c;
	}
public static void main(String[]args) {
	int a=1;
	int b=2;
	int c=3;
	multiplication(a,b);
	multiplication(a,b,c);
	System.out.println(multiplication(a,b));
	System.out.println(multiplication(a,b,c));
}
}
