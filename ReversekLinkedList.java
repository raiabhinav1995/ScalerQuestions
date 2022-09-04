import java.util.ArrayList;

public class ReversekLinkedList {

    public static Node reorderList(Node A) {
        Node middle = findMiddle(A);
        Node B = middle.next;
        middle.next = null;
        Node reversedHead = reverseList(B);
        return mergeTwoLists2(A, reversedHead);
    }

    public static int lPalin(Node A) {
        Node mid = findMiddle(A);
        Node reverse = reverseList(mid.next);
        Node head = A;
        while (head != null && reverse != null) {
            if (head.data != reverse.data) {
                return 0;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return 1;

    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node following = head;
        while (current != null) {
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
        }
        return prev;
    }

    public static int areListEqual(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return 1;
        }
        if (head1 == null || head2 == null) {
            return 0;
        }
        if (head1.data == head2.data) {
            return areListEqual(head1.next, head2.next);
        } else {
            return 0;
        }
    }

    public static Node swapInPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node previous = head;
        Node current = head.next;
        Node temp = current.next;
        current.next = previous;
        previous.next = temp;
        previous.next = swapInPairs(temp);
        return current;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = findMiddle(head);
        Node temp = middle.next;
        middle.next = null;
        head = mergeSort(head);
        temp = mergeSort(temp);
        return mergeTwoSortedLists(head, temp);
    }

    private static Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static Node removeZeroes(Node head) {
        Node first = head;
        Node third = null;
        Node second = head.next;
        while (second != null) {
            int currentSum = 0;
            while (second != null && second.data == 0) {
                second = second.next;
            }
            while (second != null && second.data != 0) {
                currentSum += second.data;
                second = second.next;
            }
            if (currentSum != 0) {
                first.data = currentSum;
                third = first;
                first = first.next;
            }
        }
        third.next = null;
        return head;
    }

    public static Node mergeTwoListsTillShorter(Node A, Node B) {
        Node following = B;
        Node temp = A;
        while (A != null && following != null) {
            following = following.next;
            B.next = A.next;
            A.next = B;
            B = following;
            A = B.next;
        }
        return temp;
    }

    public static int[] nextGreater(Node head) {
        ArrayList<Integer> answer = new ArrayList<>();
        Node p1 = head;
        Node p2 = head.next;
        int nextGreaterValue = - 1;
        while (p2 != null) {
            p2 = p1.next;
            while (p2 != null && p2.data <= p1.data) {
                p2 = p2.next;
            }
            if (p2 == null) {
                p1.data = 0;
                answer.add(0);
                p1 = p1.next;
                p2 = p1;
            } else {
                nextGreaterValue = p2.data;
                answer.add(nextGreaterValue);
                p1 = p1.next;
            }


        }
        return answer.size() == 0 ? new int[]{0} : answer.stream().mapToInt(i -> i).toArray();
    }

    public static int middleOfLinkedList(Node A) {
        int length = 1;
        Node temp = A;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        int middle = - 1;
        if (length % 2 == 0) {
            middle = (length / 2) + 1;
        } else {
            middle = (length + 1) / 2;
        }
        int i = 1;
        Node copyOfHead = A;
        while (i <= middle - 1) {
            copyOfHead = copyOfHead.next;
            i++;
        }
        return copyOfHead.data;
    }

    static Node arrayToList(int arr[], int n) {
        Node root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }

    static Node insert(Node root, int item) {
        Node temp = new Node(item);
        Node ptr;

        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] arr2 = arr;
//        arr[0] = 2;
//        arr[2] = 6;
//        for (int i : arr) {
//            System.out.print(i + "  ");
//        }
//        for (int i : arr2) {
//            System.out.print(i + "  ");
//        }
//        System.out.println(arr + " " + arr2);
        Node h1 = ReversekLinkedList.arrayToList(arr, arr.length);
//
//        Node h2 = ReversekLinkedList.arrayToList(arr2, arr2.length);
//        System.out.println("arr=" + Arrays.toString(arr) + ", arr1 " + Arrays.toString(arr1));
        printLinkedList(ReversekLinkedList.reorderList(h1));
//        Node h1 = ReversekLinkedList.arrayToList(arr, arr.length);
//        h1 = h1.next;//2->3->4->5
//        Node temp = h1;//2->3->4->5
//        temp.next = null;//2->null
//        System.out.print("temp=" + "");
//        printLinkedList(temp);
//        System.out.println();
//        System.out.print("h1=" + "");
//        printLinkedList(h1);
//        System.out.println();
//        Node h2 = h1;
//        h2.next = null;
//        printLinkedList(h1);
//        printLinkedList(h2);

//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        printLinkedList(h1);
//        System.out.println(ReversekLinkedList.lPalin(h1));
//        for (int i : arr2) {
//            System.out.println(i);
//        }
//        printLinkedList(newHead);
//
    }

    private static void printLinkedList(Node newHead) {
        while (newHead != null) {
            if (newHead.next != null) {
                System.out.print(newHead.data + "->");
            } else {
                System.out.print(newHead.data);
            }
            newHead = newHead.next;
        }
    }

    public static Node reverseKList(Node A, int B) {
        if (A == null) {
            return null;
        }
        int k = B;
        Node prev = null;
        Node current = A;
        Node temp = A.next;
        while (current != null && B != 0) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            B--;
        }
        A.next = reverseKList(current, k);
        return prev;
    }

    public static Node reverseBetween(Node A, int B, int C) {
        Node prev = null;
        Node current = A;
        Node temp = A.next;
        int k = 0;
        if (A.next == null) return A;

        while (k != B - 1 && temp != null) {
            prev = current;
            current = current.next;
            temp = temp.next;
            k++;
        }
        Node currentCopy = current;
        Node previousCopy = prev;
        prev = null;
        while (current != null && k != C) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            k++;
        }
        if (previousCopy != null) {
            previousCopy.next = prev;
        } else {
            A = prev;
        }
        currentCopy.next = current;
        return A;
    }

    public static Node mergeTwoLists(Node h1, Node h2) {
        Node temp = h1;
        Node h2Copy = h2.next;
        while (h2 != null) {
            h2.next = temp.next;
            temp.next = h2;
            temp = h2.next;
            h2 = h2Copy;
            if (h2Copy != null) {
                h2Copy = h2Copy.next;
            }
        }
        return h1;
    }

    public static Node mergeTwoLists2(Node h1, Node h2) {
        Node temp = h1;
        Node h2Copy = h2;
        while (h2 != null) {
            h2Copy = h2Copy.next;
            h2.next = temp.next;
            temp.next = h2;
            temp = h2.next;
            h2 = h2Copy;
        }
        return h1;
    }

    public static Node mergeTwoSortedLists(Node A, Node B) {
        Node dummyhead = new Node(2); // Creating dummy node, not needed but created to understand

        Node temp = dummyhead; // copy newly created node to temp;

        while (A != null && B != null) // iterate until 1 or both become null
        {
            if (A.data < B.data) // simple math, as we wanted it to follow sorting order
            {
                temp.next = A;
                temp = A;
                A = A.next;
            } else {
                temp.next = B;
                temp = B;
                B = B.next;
            }
        }

        if (A == null)
            temp.next = B; //Append the remaining list
        else if (B == null)
            temp.next = A;

        return dummyhead.next; //its because we have created dymmy node with value 10, so .next it to skill 10

    }

    public static Node reverse(Node head, int left, int right) {
        if (left == right) {
            return head;
        }
        int i = 1;
        Node leftPointer = head;
        while (i < (left - 1)) {
            leftPointer = leftPointer.next;
            i++;
        }
        Node leftCopy = leftPointer.next;
        Node rightPointer = head;
        i = 1;
        while (i < right) {
            rightPointer = rightPointer.next;
            i++;
        }
        Node rightCopy = rightPointer.next;
        if (left == 1) {

            Node rev = reverKNodes(head, right - left + 1);
            leftPointer.next = rightCopy;
            return rev;
        } else {

            Node rev = reverKNodes(leftPointer.next, right - left + 1);
            leftPointer.next = rev;
            leftCopy.next = rightCopy;
            return head;
        }
//        return null;


    }

    public static Node reorderList2(Node head) {
        Node fast = head;
        Node slow = head;
        int middle = 1;
        Node nodeBeforeMid = null;
        while (fast.next != null && fast.next.next != null) {
            nodeBeforeMid = slow;
            fast = fast.next.next;
            slow = slow.next;
            middle++;
        }
        head = reverKNodes(slow, Integer.MAX_VALUE);
        nodeBeforeMid.next = head;
        return nodeBeforeMid;
    }

    private static Node reverKNodes(Node temp, int i) {
        Node prev = null;
        Node current = temp;
        Node following = current;
        while (current != null && i != 0) {
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
            i--;
        }
        return prev;
    }

    public static Node partition(Node A, int B) {
        Node head = A;
        Node smaller = new Node(- 1);
        Node smallerCopy = smaller;
        while (head != null) {
            if (head.data < B) {
                smallerCopy.next = new Node(head.data);
                smallerCopy = smallerCopy.next;
            }
            head = head.next;
        }
        head = A;
        Node larger = new Node(- 1);
        Node largerCopy = larger;
        while (head != null) {
            if (head.data >= B) {
                largerCopy.next = new Node(head.data);
                largerCopy = largerCopy.next;
            }
            head = head.next;
        }
        smallerCopy.next = larger.next;
        smaller = smaller.next;

        return smaller;
    }

    public static Node deleteMiddle(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next != null && head.next.next == null) {
            head.next = null;
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node slowFollow = head;
        while (fast.next != null && fast.next.next != null) {
            slowFollow = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next != null && fast.next.next == null) {
            slowFollow = slowFollow.next;
        }
        slowFollow.next = slowFollow.next.next;
        return head;
    }

    public static boolean isIdentical(Node head1, Node head2) {
        //write your code here
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 == null || head2 == null) {
            return false;
        }
        if (head1.data == head2.data) {
            return true && isIdentical(head1.next, head2.next);
        } else {
            return false;
        }
    }

    public Node mergeKLists(Node[] lists) {
        Node temp = new Node(- 1);
        Node dummy = temp;
        for (Node list : lists) {
            if (list != null && list.next != null)
                dummy = mergeTwoLists(dummy, list);
        }
        return temp.next;

    }
}
