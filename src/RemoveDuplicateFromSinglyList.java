import java.util.HashSet;

public class RemoveDuplicateFromSinglyList {
    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    void search(int key){
        Node curr = head;
        while (curr != null){
            if(curr.data ==key){
                System.out.println("search item "+ curr.data);
            }
            curr = curr.next;
        }
    }
    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

     void removeDuplicate()
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        RemoveDuplicateFromSinglyList llist = new RemoveDuplicateFromSinglyList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

      //  llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();

        llist.search(11);
        llist.removeDuplicate();
        llist.printList();
    }
}
