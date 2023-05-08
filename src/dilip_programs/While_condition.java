package dilip_programs;
import java.util.*;
import java.math.BigInteger;
public class While_condition {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int n=sc.nextInt();
		long sum =1;
		while(i<=n) {
			
			sum=sum*i;
			i++;			
		}
		System.out.println("sum is : "+sum);
	}

}
