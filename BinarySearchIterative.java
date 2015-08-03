import java.util.*;

public class BinarySearchIterative{
    public static void main(String[] args){
        int[] input={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<input.length;i++){
        
        int val=input[i]/2;
        int start=0,end=input.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(input[mid]==val){
                System.out.println("Found "+val);
                break;
            }else if(input[mid]<val){
                //search right
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(start>end){
            System.out.println("Not found "+val);
        }
    }
        
    }
}