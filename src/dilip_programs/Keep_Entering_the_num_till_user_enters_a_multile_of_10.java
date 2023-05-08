package dilip_programs;
import java.util.*;
public class Keep_Entering_the_num_till_user_enters_a_multile_of_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%10==0) {
				continue;
				
			}
			System.out.print(i+" ");
			
		}
		
		
		
	}

}
