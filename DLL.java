
    class DLL{
        class Node{
         private int element;
         private Node prev;
         private Node next;
      
         public Node (int data){
          element = data;
          next = null;
      
         }
         public void linkPrev(Node newNode){
            prev = newNode;
         }
      
         public void linkNext (Node newNode){
            next = newNode;
      
         }
      
         public Node getPrevNode(){
          return prev;
      
         }
         public Node getNextNode(){
          return next;
          
         }
      
         public int getElementNode(){
          return element;
          
         }
       }
      
      
         //--------END NODE----------
      
      
         private Node head = null;
         private Node tail = null;
         private int size = 0;
      
         public DLL (){
            //build an empty list
            head = new Node(999);
            tail = new Node (-999);
            head.linkNext(tail);
            tail.linkPrev(head);
      
         }
      
         public void addFirst(int data){
            //create new node
            Node newNode  = new Node (data);
            newNode.linkPrev(head);
            newNode.linkNext(head.getNextNode());
            head.getNextNode().linkPrev(newNode);
            head.linkNext(newNode);
            size++;
         }
      
         public void addLast(int data){
            Node newNode = new Node(data);
            newNode.linkNext(tail);
            newNode.linkPrev(tail.getPrevNode());
            tail.getPrevNode().linkNext(newNode);
            tail.linkPrev(newNode);
            size++;
         }
      
         public void removeFirst(){
            //if (size == 0) do nothing
            if(size == 1){
               head.linkNext(tail); 
               tail.linkPrev(head);
               size++;     
            }
            else if(size>1){
               head.linkNext(head.getNextNode().getNextNode());
               head.getNextNode().linkPrev(head);
               size--;
            }
         }
      
         public void removeLast(){
            //if (size == 0) do nothing
            if(size == 1){
               head.linkNext(head);
               tail.linkPrev(head);
               size--;
            }
            else if (size > 1){
               tail.linkPrev(tail.getPrevNode().getNextNode());
               tail.getPrevNode().linkNext(tail);
               size--;
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
                    System.out.println( "Element "+ cout++ +"=" + p.getElementNode());
                }
                
      
            }
        }

        public void displayForward() {
         Node current = head;
         while (current != null) {
             System.out.print(current.getElementNode() + " <-> ");
             current = current.next;
         }
         System.out.println();
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
             System.out.print(current.getElementNode() + " <-> ");
             current = current.prev;
         }
         System.out.println("null");
     }

        
    } 
      
      
        
   class MainDLL{ 
   public static void main(String[] args) {
    
    DLL dll = new DLL();
            dll.addFirst(1);
            dll.addLast(2);
            System.out.println("Backward DLL");
            dll.displayBackward();
            System.out.println("Forward DLL");
            dll.displayForward();
            

   }
}