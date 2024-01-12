package PRACTICE;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Practice2 {

    public static Node3 middle(Node3 head) {
        Node3 slow = head;
        Node3 r = head;
        Node3 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = null;
        return r;
    }

    public static Node3 middle2(Node3 head) {
        Node3 slow = head;
        Node3 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow.next = null;
        return slow.next;
    }

    static Node3 reverse(Node3 head) {
        Node3 newHead = middle(head);

        if (newHead.next == null) {
            return null;
        }

        Node3 prev = null;
        Node3 curr = newHead.next;
        while (curr != null) {
            Node3 next = curr.next;
            // reverse
            curr.next = prev;
            // update
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node3 foldAndMerge(Node3 head) {
        // Write your code here.
        Node3 fh = reverse(head);
        Node3 sh = middle2(head);
        Node3 result = head;
        while (sh != null) {
            System.out.println(fh.data);
            // System.out.println(sh.data);
            // result.data = fh.data * sh.data;
            fh = fh.next;
            sh = sh.next;
            // result = result.next;
        }
        result.next = null;
        return sh;
    }

    static void traversal(Node3 head) {
        Node3 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node3 insertion(Node3 head, int data, int pos) {
        Node3 n5 = new Node3(data);
        if (pos == 0) {
            n5.next = head;
            n5.data = data;
            return n5;
        }

        Node3 p = head;
        int i = 0;

        while (i != pos - 1) {
            p = p.next;
            i++;
        }
        n5.data = data;
        n5.next = p.next;
        p.next = n5;
        return head;
    }

    public static void main(String[] args) {
        Node3 n1 = new Node3(1);
        Node3 n2 = new Node3(2);
        Node3 n3 = new Node3(3);
        Node3 n4 = new Node3(4);

        Node3 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        // head = insertion(head, 5, 2);
        head = foldAndMerge(head);
        traversal(head);

    }
}
