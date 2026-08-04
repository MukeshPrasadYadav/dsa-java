import java.util.Scanner;

public class InsertAtPosition {

    public static ListNode insertAtPosition (ListNode head , int position, int value){
        ListNode current = head;

        // node is null and position is first
        if(head == null && position == 1){
            return new ListNode(value);
        }

        // insert at first place
        else if(head != null && position == 1){
            ListNode first = new ListNode(value);
            first.next = head;
            return first;
        }

        // insert at last
        int count = 1;
        while(current != null && count < position -1){
            count ++;
            current = current.next;
        }
        
        ListNode temp = current.next;
        current.next = new ListNode(value);
        current.next.next = temp;
        return head;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char choice ;
        ListNode head = ListNodeUtils.fillNodes();




        do{
             int size = ListNodeUtils.getSize(head);

            System.out.println("Enter the poistion of insertion");
            int position = sc.nextInt();

            if(position >0 && position <= size +1){
                System.out.println("Enter the value to be inserted");
                int value = sc.nextInt();
                head = insertAtPosition(head, position, value);
                ListNodeUtils.traversal(head);
            }
            else{
                System.out.println("Enter a valid position");
            }
            System.out.println("Want to try again");
            choice = sc.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');
        sc.close();
    }
    
}
