import java.io.*;

public class CapitalOne {
    public static class LinkedListNode{
        int val;
        LinkedListNode next;
    
        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };
    
    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val){
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }
    

/*
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode *next;
};
*/

    static LinkedListNode removeNodes(LinkedListNode list, int x) {
        
        LinkedListNode headNode = list;
        LinkedListNode tempNode = headNode;
        LinkedListNode previousNode = null;
        

        if(list==null)
            return list;

        while(tempNode!=null && tempNode.val > x)
        {
            headNode = tempNode.next;
            tempNode = headNode;
        }
        while(tempNode!=null)
        {
            while(tempNode!=null && tempNode.val<=x)
            {
            previousNode = tempNode;
            tempNode = tempNode.next;
            }

            if(tempNode==null)
                return headNode;

            previousNode.next = tempNode.next;
            tempNode = previousNode.next;
        }

        return headNode;
    
     
     }

     

    public static void main(String[] args) throws IOException{
    	LinkedListNode listTail = null;
    	LinkedListNode result = null;
    	
    	
//    	listTail = _insert_node_into_singlylinkedlist(list,listTail,1);
//    	listTail.next = _insert_node_into_singlylinkedlist(list,listTail,2);
//    	listTail.next = _insert_node_into_singlylinkedlist(list,listTail,3);
//    	listTail.next = _insert_node_into_singlylinkedlist(list,listTail,4);
//    	listTail.next = _insert_node_into_singlylinkedlist(list,listTail,5);
    	
    	listTail = new LinkedListNode(5);
    	listTail.next = new LinkedListNode(2);
    	listTail.next.next = new LinkedListNode(1);
    	listTail.next.next.next = new LinkedListNode(6);
    	listTail.next.next.next.next = new LinkedListNode(7);
    	
//    	while(listTail!=null)
//    	{
//    	System.out.println(listTail.val);
//    	listTail = listTail.next;
//    	}
    	
    	result = removeNodes(listTail,5);
    	
    	while(result!=null)
    	{
    	System.out.println(result.val);
    	result = result.next;
    	}
    	
    }
    }