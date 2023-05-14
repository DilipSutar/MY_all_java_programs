package Array_concepts;

public class array_creation {
	public static void update(int marks1[]) {
		for(int i=0;i<marks1.length;i++) {
			marks1[i]=marks1[i]+1;
		}
	}
	public static void main (String[]args) {
	// datatype arrayName[]=new datatype[size];
    int marks[]=new int[50];
    int number[]= {1,2,3};
String fruit []= {"apple","mango","banana"};



//Passsing array by argument

int marks1[]= {97,23,5,5,6,};
System.out.println(marks1);
update(marks1);
//print our marks
for(int i=0;i<marks1.length;i++) {
	System.out.print(" updated marks"+marks1[i]+" ");
}
	}
}
