package Array_concepts;
import java.util.*;
public class largest_number {
	public static int getlargest(int numbers[]) {
		int largest =Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			}
		}
		return largest;
	}
	
	public static int getsmallest(int numbers[]) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(smallest>numbers[i]) {
				smallest=numbers[i];
			}
		}
		return smallest;
	}
public static void main(String[]args) {
	int numbers[]= {1,2,6,3,5};
	//- infinity in java is integer.mim_value
	//+ infinity in java is integer.max_value
	System.out.println("largest number is : "+getlargest(numbers));
	System.out.println("smalest number is : "+getsmallest(numbers));
}
}
