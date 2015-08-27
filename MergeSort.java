import java.util.*;

public class MergeSort{
     
    public static void main(String[] args){
        int[] arr={4,7,2,9,1,3};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
    
    private static void printArray(int[] ar){
        for (int a:ar){
            System.out.print(a+" ");
        }
    }
    
    private static void mergeSort(int[] arr,int l,int r){
       System.out.println("mergeSort"+l+" "+r);
       if(l<r){
           int middle=(l+r)/2;
           
           mergeSort(arr,l,middle);
           mergeSort(arr,middle+1,r);
          System.out.println("merging.."+l+" "+middle+" "+r); 
           merge(arr,l,middle,r);
       } 
    }
    
    private static void merge(int[] arr, int l, int m, int r){
        printSome(arr,l,r);
        int n1=m-l+1;
        
        int n2=r-m;
        
        int[] left=new int[n1];
        int[] right= new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
            System.out.print(">>>"+left[i]);
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[m+1+j];
            System.out.print("<<<"+right[j]);
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            System.out.println("Comparing"+ left[i]+" and "+right[j]);
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        
        while(i<n1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;k++;
        }
        
        printSome(arr,l,r);
    }
    private static void printSome(int[] ar,int l,int r){
        for(int i=l;i<=r;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}