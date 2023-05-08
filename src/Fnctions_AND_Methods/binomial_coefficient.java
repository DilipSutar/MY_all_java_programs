package Fnctions_AND_Methods;
import java.util.*;
public class binomial_coefficient {
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
public static int bincoeef(int n,int r) {
	int	n_fac=factorial(n);
	int	r_fac=factorial(r);
	int n_r_fac=factorial(n-r);
	int bio_coe=(n_fac/(r_fac*n_r_fac));
	return bio_coe;
}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter first value : " );
		int n=sc.nextInt();
				System.out.print("enter second value : " );
		int r=sc.nextInt();
	System.out.println("the binomial coefficent of "+n+" & "+r+" is : "+ bincoeef(n,r));
	}

}
