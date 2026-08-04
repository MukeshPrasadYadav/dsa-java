import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val =val;
    }
}

public class SearchingInLinkedList {

     public static int traversal(ListNode head,int target){
        int currentPosition = 0;
        ListNode current = head;
        while(current != null){
            if(current.val == target) return currentPosition;
            currentPosition++;
            current = current.next;
        }
        return -1;

        }

    public static void main(String[] args) {

        SearchingInLinkedList searchingInLinkedList = new SearchingInLinkedList();

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


                Scanner sc = new Scanner(System.in);

        char choice ;

        do { 
            
        System.out.println("Enter the number to be searched");
        int target = sc.nextInt();
         
        int value = SearchingInLinkedList.traversal(head, target);
        if(value == -1) System.out.println("The number" + target + " is not present.");
        else System.out.println("The number " + target + " is present at " + ((int) value + 1) + " position");

        System.out.println("Do you want to search again if yes press y else any other key");
        choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        sc.close();

        
    }
    
}
