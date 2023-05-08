package patterns_part2;

public class patterns {
	public static void hollow_rectangle(int TotRows,int TotCol) {
		for(int i=1;i<=TotRows;i++) {
			for(int j=1;j<=TotCol;j++) {
				if(i==1 || i==TotRows || j==1 || j == TotCol) {
			System.out.print(" * ");	
					
				}
				else {
					System.out.print("   ");
				}
						}
			System.out.println();
		
	}
	}
	
	public static void inverted_Rotated_half_pyramid(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[]args) {
		hollow_rectangle(5,5);
		System.out.println();
		inverted_Rotated_half_pyramid(25,25);
	}

}
