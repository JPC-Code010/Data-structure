
    class CLL {
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
        
    
        //---------- End Node -------------
        
       
        //CLL properties and methods
        private Node tail= null ;
        private int size = 0;
    
        public void addFirst(int data){
            //create new node
            Node newNode = new Node (data);
            //if there is no node
            if (tail == null){
                tail = newNode ;
                tail.getNextNode = tail ;

            }
            else{
            newNode.link(tail.getNextNode());
            tail.link(newNode);
            }
            size++;  
    
        }
    
    
        public void addLast(int data){
            //create new node
            Node newNode = new Node (data);
            //if there is no node
            if (tail == null){
                tail = newNode ;
                tail.getNextNode = tail;
            }
            else{
            newNode.getNextNode = tail.getNextNode;
            tail.getNextNode = newNode ;
            tail = newNode ;
            }
            size++;
            
    
        }
    
        public void removeFirst(){
            //delete Node
            //if there is no node
            if (size == 1){
                tail = null ;
            }
            else{
            tail.link(tail.getNextNode().getNextNode()) ;
            
            }
            size--;
    
        }
    
        public void removeLast(){
            //delete the last node
            if(size = 1){//is there ONLY ONE node ?
                tail = null ;
                size -- ;
    
            }
            else{
                Node p;
                for(p = tail.getNextNode();p.getNextNode()!= tail ; p = p.getNextNode()){
                    
                    p.link(tail.getNextNode());
                    tail = p;
            
                }
                size--;
    
            }
        }

        public void rotate(){
            if(size > ){
                tail = tail.getNextNode();          
             }
        }


        public void print(){
            if(size != 1){
             for(Node p = tail.getNextNode(); p!=tail;p=p.getNextNode()){
                System.out.print("->" + p.getElement());
             }
             System.out.print("->" + tail.getElement() + "->");
            }
            else{
                System.out.print("Empty linked list");
            }
        }
        
    }
     
    
    
        class MainSLL{
        public static void main(String[] arg){
            CLL cll = new CLL();
            cll.print();
            cll.addFirst(1);
            cll.print();
            cll.addLast(2);
            cll.print();
            cll.addFirst(3);
            cll.print();
            cll.rotate();
            cll.print();
            cll.removeFirst();
            cll.print();
            cll.removeLast();
            cll.print();
            } 
    }