package Array_concepts;

public class maxSubArraySum {
	public static void maxSubArray(int numbers[]){
        int current=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
             int start=i;
             for(int j=i;j<numbers.length;j++){
                int end=j;
                current=0;
                for(int k=start;k<=end;k++){
                    current +=numbers[k];
                }
                System.out.println(current);
                if(maxsum<current){
                    maxsum=current;
                }
             }
        }
        System.out.println("max sum : "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};

        maxSubArray(numbers);
    }
	
}
