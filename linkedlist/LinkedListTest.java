
public class LinkedListTest{
    public static void main(String[] args){
        //Node n=new Node();
        LinkedList l=new LinkedList();
        //add node to end of linked list
    //   System.out.println("obje.."+l);
        l.add(2);
        System.out.println("added 2");  
        l.add(4);
        l.add(6);
        System.out.println("appended 4 and 6");
        l.allValues();
        l.add(0,0);
       System.out.println("added 0 at index 0");
        l.allValues();
        l.add(2,3);
        System.out.println("added 3 at index 2");
        l.allValues();
        l.add(0,3);
        l.allValues();
        l.remove(0); 
         
    }    
}

