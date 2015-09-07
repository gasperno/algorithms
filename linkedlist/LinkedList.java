//import java.util.Logging;

class LinkedList{
    private Node head;
    private int size;
    
    public LinkedList(){
        this.head=null;
        this.size=0;
    }
    /*
    Add node to the end of the linked list
    */
    public void add(int data){
        //create a new node with input parameter as data
        Node n=new Node(data);
        //write a corner case to add data to empty linked list
        if(head==null){
   //         System.out.println("No elements in List");
           head=n;
           //size+=1;
           return;
        }
        //traverse the linked list using the head
        //until null is reached
        Node current=head;
    //    System.out.pintln("List not empty.. traverse to end of list");
        while(current.getNext()!=null){
            current=current.getNext();
        }
        //create new node with data
        ///created at the beginning as n
        //update next of the last node to new node
    //    System.out.println("Node added.."+current.getData());
        current.setNext(n);
        return;
    }
    
    /*
    add element at particular postion
    
    */
    public void add(int index, int data){
        //create new node with data from parameter
        Node n=new Node(data);
        //iterate to identify the node at i-th index
        Node current=this.head;
        Node previous=null;
        for(int i=0;i<index;i++){
            previous=current;
            current=current.getNext();
        }
        //point previous to new node
        if(previous!=null)
            previous.setNext(n);
        else         //previous==null i.e., at position 1
            this.head=n;
        //new_node->next points to current
        n.setNext(current);
  //      this.allValues();
        return;
    }
    
    /*
    remove from particular postion
    input param -- index, data
    */
    public void remove(int index){
        //traverse from head to position 'index'
        
        //store previous and current
        Node current=this.head;
        Node previous=this.head;
        //if index =0, move head to next node of head
        if(index==0){
            this.head=current.getNext();
            return;
        }
        int count=1;
        while(count<=index){
            previous=current;
            current=current.getNext();
            count++;
        }
        //current holds value at position index
        
        //since current value is deleted
        //previous node's pointer shifts to next node of current
        previous.setNext(current.getNext());
        
    } 
    public String allValues(){
        Node current=this.head;
    //    System.out.println(current.getData());
        String output="";
        while(current!=null){
   //         System.out.println(current.getData());
            output+=current.getData()+" ";
            current=current.getNext();
        }
        System.out.println(output);
        return output;
    }
}
