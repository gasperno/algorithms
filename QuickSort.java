import java.util.*;

public class QuickSort{
    //swap method
    static void swap(int[] in, int a,int b){
        int temp=in[a];
        in[a]=in[b];
        in[b]=temp;
    }
    //method for partition
    static int partition(int[] in,int l,int h){
        int x=in[h];
        int i=l-1;
    //    System.out.println("pivot.."+x);
        for(int j=l;j<h;j++){
            if(in[j]<=x){
                i++;
                swap(in,i,j);
            }
        }
        swap(in,i+1,h);
        
        return i+1;
    }
    //quicksort 
    static void quickSort(int[] in,int l,int h){
        
        if(l<h){
            int p=partition(in,l,h);
            quickSort(in,0,p-1);
            printArray(in);
            System.out.println(">>>"+p);
            quickSort(in,p+1,h);
            printArray(in); 
        }
    }
    
    //print array
    static void printArray(int[] in){
        for(int i:in){
            System.out.print(i+" ");
        } 
        System.out.println();
    }
    //main method
    public static void main(String[] args){
        int[] in={2,3,4,7,1};
        quickSort(in,0,in.length-1);
        printArray(in);
    }
}