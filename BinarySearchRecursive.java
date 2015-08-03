import java.util.*;

public class BinarySearchRecursive{
    static boolean debug=false;
    public static void main(String[] args){
        //recursive binary search
        int[] input={1,2,3,4,5,6,7,8,9,10,11};
        
        int val=6;
        System.out.println("Start");
        for(int i=0;i<input.length;i++){
        val=input[i];
        int index=binarySearchRecursive(input,0,input.length,val);
        if(index!=-1){
            System.out.println("Found at "+index);
        }else{
            System.out.println("Not found");
        }
        }
    }
    private static int binarySearchRecursive(int[] input,int start, int end, int value){
        int mid=start+(end-start)/2;
        int ret=-1;
        if(start>end){return ret;}
        if(input[mid]==value){
            if(debug) System.out.println("Found at"+mid+"["+input[mid]+"]");
            return mid;
        }if(input[mid]>value){
            if(debug) System.out.println("Recursing left>>"+start+","+mid+"["+input[mid]+"]");
            ret=binarySearchRecursive(input,start,mid,value);
        }else{
            if(debug) System.out.println("Recursing right<<"+mid+","+end+"["+input[mid]+"]");
            ret=binarySearchRecursive(input,mid,end,value);
        }
        return ret;
    }
}