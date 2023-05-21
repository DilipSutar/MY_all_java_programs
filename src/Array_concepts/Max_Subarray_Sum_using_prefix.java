package Array_concepts;



public class Max_Subarray_Sum_using_prefix {
    public static void maxSubarray(int numbers[]){
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
        for(int j=i;j<numbers.length;j++){
            int end =j;
            currSum= start == 0 ? prefix[end] :prefix[end] -prefix[start-1];
       if(MaxSum<currSum){
    MaxSum=currSum;
}

        }
        }
        System.out.println("max sum ="+MaxSum); 
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarray(numbers);
    }

}
