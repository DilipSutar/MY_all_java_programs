package Array_concepts;
import java.util.*;

public class arraycc {
public static void update(int marks[],int nonChangeble) {
	nonChangeble = 10;
		for(int i =0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
			
		}
	}
	
	public static void main(String[]args) {
		int marks[]= {97,98,99};
		int nonChangeble =5;
		update(marks, nonChangeble);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

}
