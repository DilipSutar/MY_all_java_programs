package dilip_programs;
import java.util.*;
public class JP_9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice;
	do {
		System.out.print("how many * pattern you want:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("if you want cantinue press 1\n if you don't want to print press any other numer :");
		choice=sc.nextInt();
	}while(choice==1);
	}

}
