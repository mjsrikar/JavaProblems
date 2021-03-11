package mediumProblems;

public class DeleteDuplicates_inprog {
	
			 public class ListNode { 
				 int val; 
				 ListNode next; 
				 ListNode() {} 
				 ListNode(int val) { this.val = val; } 
				 ListNode(int val, ListNode next) 
				 { this.val = val; this.next = next; } }
				
			 public ListNode deleteDuplicates(ListNode head) {
			     ListNode uniques= new ListNode(0);
			     ListNode temp=uniques;
			    while(head.next!=null) {
			     if(head.val!=head.next.val) {
			    	 temp.next.val=head.val;
			    	temp=temp.next;
			     }
			    }
			    
			    return uniques;}	 
public static void main(String args[]) {
	
	
	

	
}
}
