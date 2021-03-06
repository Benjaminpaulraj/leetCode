package leetCode.topEasy.LinkedListPbs;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	ListNode node = null, res = null;
    	
    	if(l1.val < l2.val) {
    		node = l1;
    		l1 = l1.next;
    	}else {
    		node = l2;
    		l2 = l2.next;
    	}
    	res = node;
    	while(l1 != null && l2!= null) {
    		ListNode next;
    		if(l1.val < l2.val) {
    			next = l1;
    			l1 = l1.next;
    		}else {
    			next = l2;
    			l2= l2.next;
    		}
    		node.next = next;
    		node = node.next;
    	}
    	
    	if(l1 == null) node.next = l2;
    	else node.next = l1;
    	return res;
    }
    
    
    
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
    	if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
        
    }    
}
