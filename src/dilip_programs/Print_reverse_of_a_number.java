package dilip_programs;
import java.util.*;
public class Print_reverse_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number you wanted in reverse order ");
int n=sc.nextInt();
while(n>0) {
	int lastdig=n%10;
	System.out.print(lastdig+" ");
	n=(n/10);
}

	}

}
