

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val =val;
    }
}

public class Traversal{
    public static void main(String [] args){

        ListNode head = null;
        ListNode tail = null;

        for(int i =1;i<=10;i++){
            ListNode newNode = new ListNode(i);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }

        // Iteration

        ListNode current = head;
        while(current != null){
            if(current.next != null)System.out.print(current.val + "->");
            else System.out.print(current.val + "\n");
            current = current.next;
        }
    }
}