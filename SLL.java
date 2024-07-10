/*/ 
class SLL {
    class Node {
    private int element;
    private Node next;

    //Constructor
    public Node(int data){
        element = data ;
        next = null ;
    }

    public void link(Node newNode){
        next = newNode ;
    }

    public Node getNextNode() {

        return next ;
    }

    public int getElement(){
        return element ;
    }
 }

   
    class SLLnext {
    public static void main(String[] args){
        Node one = new Node(1) ;
        Node two = new Node(2) ;
        one.link(two);
        //print all elements
        Node p;
         for(p = one ; p!= null;p = p.getNextNode()){
            System.out.print(p.getElement() + " ");

         }
         System.out.println() ;
    }
  }
    

         
  
  
    //---------- End Node -------------
    
   
    //SLL properties and methods
    private Node head = null;
    private Node tail= null ;
    private int size = 0;

    public void addFirst(int data){
        //create new node
        Node newNode = new Node (data);
        //if there is no node
        if (size == 0){
            head = newNode ;
            tail = newNode ;
            size += 1;
        }
        else{
        newNode.link(head);
        head = newNode ;
        size++;
        }

    }


    public void addLast(int data){
        //create new node
        Node newNode = new Node (data);
        //if there is no node
        if (size == 0){
            head = newNode ;
        }
        else{
        tail.link(newNode);
        }
        tail = newNode ;
        size++;
        

    }

    public void removeFirst(){
        //delete Node
        //if there is no node
        if (size == 1){
            head = null ;
            tail = null ;
            size -= 1;
        }
        else{
        head = head.getNextNode() ;
        size--;
        }

    }

    public void removeLast(){
        //delete the last node
        if(size == 1){//is there ONLY ONE node ?
            head = null ;
            tail = null ;
            size -- ;//size - 1;//increment (size = size - 1)

        }
        else{
            Node p;
            for(p = head;p.getNextNode()!= tail ; p = p.getNextNode()){
                tail = p;
            tail.link(null);

            }
            

        }
    }
    public void print(){
        boolean Empty = true ;

        if(size == 0){
            System.out.println("Size = "+size);
            System.out.println("Empty = " + Empty);
        }
        else{
            int cout = 0;
            Empty = false ;
            System.out.println("Size = "+size);
            System.out.println("Empty = " + Empty);
            for(Node p = head; p != null; p = p.getNextNode()){
                System.out.println( "Element "+ cout++ +"=" + p.getElement());
            }
            

        }
    }  
    
    public void displayBackward() {
        if (head == null) {
            return;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Traverse backward from the end to the head
        while (current != null) {
            System.out.print(current.getElement() + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
 


    class MainSLL{
    public static void main(String[] arg){
        SLL sll = new SLL();
        System.out.println(" ");
        System.out.println("=== Empty linked list ===");
        sll.print();
        sll.addFirst(22);
        sll.addLast(11);
        sll.addFirst(11);
        System.out.println(" ");
        System.out.println("=== After adding elements ===");
        sll.print();
        sll.removeFirst();
        sll.removeLast();
        sll.removeFirst();
        sll.removeLast();
        System.out.println(" ");
        System.out.println("=== After clearing elements ===");
        sll.print();

        System.out.println("=== Backward Singly ===");
        sll.displayBackward();

        

    }
        
 }

/*/ 
 



    