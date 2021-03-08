package easyProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Merge2sorted {
	  public class ListNode {
		    int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		  ListNode l3= new ListNode(0);
	        ListNode current_node= l3;
	        
	        while(l1!=null && l2!=null){
	            if(l1.val<l2.val){
	                current_node.next=l1;
	                l1=l1.next;
	            }else {
	                current_node.next=l2;
	                l2=l2.next;
	            }
	            current_node=current_node.next;
	        }
	        if(l1!=null){
	            current_node.next=l1;
	                l1=l1.next;
	        }
	        if(l2!=null){
	           current_node.next=l2;
	                l2=l2.next;  
	        }
	        return l3.next;
	  }
		 
   public static void main(String args[]) {

   }
}
