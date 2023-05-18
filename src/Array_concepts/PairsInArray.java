package Array_concepts;
//we have to us nested loops
public class PairsInArray {
    public static void PairsOfArray(int numbers[]){
        int totalpair=0;
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+") ");
                totalpair++;//total pairs formula is (n(n-1))/2
            }
            System.out.println();
        }
        System.out.println("total pairs are :"+totalpair);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        PairsOfArray(numbers);
    }

}
