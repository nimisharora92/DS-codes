package DS;

    public class DetectLoopInLL {
    public static void detectLoop(Node<Integer> head)
	{
		
     Node slow = head, fast = head; 
     int flag = 0; 
        
     while (slow != null && fast != null && fast.next != null) 
     
     { 
     
     slow = slow.next; 
     fast = fast.next.next; 
     if (slow == fast) 
     
     { 
     
     flag = 1; 
     break; 
            
     }
     
     } 
        
     if (flag == 1) 
     System.out.println("Loop found"); 
     else
            
     {
    	 
    	 System.out.println("Loop not found");
    	 
     }
		
		
	}
  
     public static void main(String[] args) 
     
     {	
		
	Node<Integer> head = new Node<Integer>(7);
	detectLoop(head);
		
	}
}