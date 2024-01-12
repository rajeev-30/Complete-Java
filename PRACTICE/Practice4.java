package PRACTICE;

class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Practice4 {
    public static void traverse(Node5 head) {
        Node5 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node5 insertion(Node5 head, int data, int index) {
        Node5 toAdd = new Node5(data);
        if (index == 0) {
            toAdd.next = head;
            head = toAdd;
            return head;
        }
        Node5 p = head;
        int i = 0;
        while (i != index - 1) {
            p = p.next;
            i++;
        }
        toAdd.data = data;
        toAdd.next = p.next;
        p.next = toAdd;
        return head;

    }

    public static void main(String[] args) {
        Node5 n1 = new Node5(1);
        Node5 n2 = new Node5(2);
        Node5 n3 = new Node5(3);

        Node5 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        head = insertion(head, 5, 0);
        traverse(head);
    }

}
