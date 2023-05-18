package Array_concepts;

import java.net.SocketPermission;

public class reverse_arrray {
    public static void reversearray(int marks[]){
        int start=0;
    int end =marks.length-1;
    while(start<end){
        int temp=marks[end];
        marks[end]=marks[start];
        marks[start]=temp;
    
        start++;
        end--;
    
    }
    }
    public static void main(String[] args) {
        int marks[]={2,4,6,8,10,12,14,16};
reversearray(marks);
for(int i=0;i<marks.length;i++){
 System.out.print(marks[i]+" ");   
}
    }


}
