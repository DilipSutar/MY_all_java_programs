package dilip_programs;
import java.util.*;
public class Multiplication_table_of_N_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int choice;
		do {
			System.out.print("enter the number you want multiiplication  table :");
			int n=sc.nextInt();
			
			for(int i=1;i<=10;i++) {
				System.out.format("%d * %d = %d ",n,i,n*i);
				System.out.println();
				
			}
			System.out.print("you want to continue press 1");
			choice=sc.nextInt();
		}while( choice == 1);

	
	}

}
