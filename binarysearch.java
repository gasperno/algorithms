import java.util.*;

/*O(log n) solution for search - Binary Search- Iterative approach*/
class Main{
    
    public static void main(String[] args){
        //input
        int[] ar={1, 2, 3, 4, 5};
        for(int i=0;i<ar.length;i++){
            System.out.println("Searching for "+ar[i]+" and result is "+binarySearch(ar,ar[i]));
        }
        System.out.println("Searching for 7 and result is "+binarySearch(ar,7));
    }
    
    private static boolean binarySearch(int[] ar,int val){
        int len=ar.length;
        int index=len/2;
        int prev=index+1;
        while(index!=prev && index<len){
        System.out.println(len+" "+index+" "+ar[index]);
            if(ar[index]==val){
               return true;
            }else if(ar[index]>val){
                prev=index;
                index=index/2;
            }else{
                prev=index;
                index+=index/2;
            }
        }
        return false;
    }
}