public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList list = new LinkedList();
        list.display();
        System.out.println("adding nodes");
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display();
        System.out.println("adding nodes at start");
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.display();
        System.out.println("adding nodes at position");
        list.insertAtPosition(2,55);
        list.insertAtPosition(0,123);
        list.display();
        System.out.println("deleting nodes at position");
        list.deleteAt(3);
        list.display();
        System.out.println("deleting nodes at position");
        list.deleteAt(0);
        list.display();
//        System.out.println("Hello world!");
//        LinkedList newlist = new LinkedList();
//        newlist.display();
//        System.out.println("adding nodes at start");
//        newlist.insertAtStart(1);
//        newlist.display();
    }
}