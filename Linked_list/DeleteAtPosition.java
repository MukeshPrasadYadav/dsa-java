import java.util.Scanner;

public class DeleteAtPosition {

    public static ListNode deleteFromFront(ListNode head , int poistion,int size){
        if(head == null) return null;
        if(poistion == 1 && size == 1) return null;
        
        ListNode current = head;
        if(poistion == 1){
            head = head.next;
            return head;
        }
        int currSize = 1;
        while (current.next != null && currSize < poistion -1) {
            current = current.next;
            currSize++;
            
        }
        current.next = current.next.next;
        return head;
        

    }

    public static ListNode deleteFromBack(ListNode head, int poistion,int size){
        if(head == null) return null;
        if(poistion == 1 && size == 1) return null;
        if(poistion == size){
            head = head.next;
            return head;
        }
        
        ListNode current = head;
        int currSize =1;
        while(current.next != null && currSize < size - poistion ){
            currSize++;
            current = current.next;
        }
        current.next = current.next.next;
        return head;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        char choice ;
        ListNode head = ListNodeUtils.fillNodes();

        ListNodeUtils.traversal(head);

        do {
            System.out.println("Enter the choice to delete from front or end");
            System.out.println("For front type f or any other key for backward");
            char direction = sc.next().charAt(0);
            System.out.println("Enter the position");
            int position = sc.nextInt();
            int size = ListNodeUtils.getSize(head);
            if(position <= 0 || position > size ){
                System.out.println("Enter a valid position");  // this part not working properly
            }
            if(direction == 'f'){
                head = deleteFromFront(head, position,size); 
            }else{
                head = deleteFromBack(head, position,size);
            }
            ListNodeUtils.traversal(head);
            System.out.println("Want to try again");
            choice = sc.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
    }
    
}
