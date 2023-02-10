public class LinkedList {
    Node head;
    //by default, this method inserts new nodes at end of the list
    public void insert(int value) {
       Node newNode = new Node();
       newNode.value = value;
       newNode.next = null;
       if(head == null) {
           this.head = newNode;
       }
       else {
           Node temp = head;
           while(temp.next != null) {
               temp = temp.next;
           }
           temp.next = newNode;
       }
    }
    // this method inserts new nodes at the beginning of list
    public void insertAtStart(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    // this method inserts new nodes at a given position, for zero-based positioning
    public void insertAtPosition(int position, int value){
        if(position == 0) {
            this.insertAtStart(value);
        }
        else {
            int pos = 0;
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            Node p = this.head;
            while (p.next != null && pos < position - 1) {
                p = p.next; // at p=head & pos =0, we get 1st node at p.next which is assigned to p at line 41. so if  req pos is 2 , we need 1st node
                // to insert at 2nd node we need prev node i.e 1st node AND to get 1st node we can stop at 0th node since it points to 1st node as next.
                pos++;
            }
            //System.out.println("position "+pos);
            newNode.next = p.next;
            p.next = newNode;
        }
    }

    public void deleteAt(int position){
        if(position == 0)  {
            this.head = this.head.next;
        }
        else {
            int pos = 0;
            Node d = this.head;
            while (d.next != null && pos < position - 1) {
                d = d.next; // gives the node before the deletion.
                pos++;
            }
            //System.out.println("position "+pos);
            // d is the node before the deletion node
            // d.next is the deletion node
            // d.next.next is the node after deletion node
            int del = d.next.value;
            Node aft = d.next.next;
            d.next = aft;
            System.out.println("deleting "+del +" " +pos);
        }
    }

    public void display(){
        if(this.head != null) {
            Node disp = this.head;
            while (disp.next != null) {
                System.out.println(disp.value);
                disp = disp.next;
            }
            System.out.println(disp.value);
        }
        else
            System.out.println("list is empty");
    }
}
