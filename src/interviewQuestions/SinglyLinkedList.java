package interviewQuestions;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {

    private Node<T> head;

    static class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

        void setNext(Node<T> next) {
            this.next = next;
        }

        Node<T> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node)) {
                return false;
            }
            if (data == null && ((Node<T>)(obj)).data == null) return true;
            return data != null && data.equals(((Node<T>)(obj)).data);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> peek() {
        return head;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void addAfter(T node, T data) {
        if (node == null) {
            throw new IllegalArgumentException("After-node not set");
        }

        Node<T> temp = head;

        while (temp != null) {
            if (temp.equals(new Node<>(node))) {
                Node<T> newNode = new Node<>(data);
                newNode.setNext(temp.next);
                temp.setNext(newNode);
                System.out.println("New element added");

                break;
            } else {
                temp = temp.next;
            }
        }
    }

    public T removeAfter(T data) {
        if (data == null) {
            throw new IllegalArgumentException("After-node not set");
        }

        Node<T> temp = head;
        T res = null;
        while (temp != null) {
            if (temp.equals(new Node<>(data))) {
                if (temp.next != null) {
                    res = temp.next.data;
                    temp.next = temp.next.next;
                } else {
                    System.out.println("Nothing to remove");
                }
                break;
            } else {
                temp = temp.next;
            }
        }
        return res;
    }
    boolean isListPalindrome(Node<Integer> l) {
        Node<Integer> slowPointer = l;
        Node<Integer> fastPointer = l;
        Node<Integer> firstPart = null;
        int counter = 0;
        boolean isPalindrome = true, isVerified = false;

        while (slowPointer != null) {

            while (fastPointer != null) {
                fastPointer = fastPointer.next;
                counter++;
                if (fastPointer != null) {

                    Node<Integer> newNode = new Node<>(slowPointer.data);
                    if (firstPart == null) {
                        firstPart = newNode;
                    } else {
                        newNode.next = firstPart;
                        firstPart = newNode;
                    }

                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;

                    counter++;
                }
            }

            if ((!isVerified) && (counter % 2 == 1)) {
                slowPointer = slowPointer.next;
                isVerified = true;
                continue;
            }
              if (!slowPointer.data.equals(firstPart.data)) {
                isPalindrome = false;
                break;
            }
            slowPointer = slowPointer.next;
            firstPart = firstPart.next;

        }
        return isPalindrome;

    }

    public void zigzag(Node<Integer> phead){
        Node<Integer> cur = phead, next = null;
        Integer temp = null;
        boolean isGreater = false;
        while(cur != null) {
            next = cur.next;
            if (next == null) {
                break;
            }
            if (isGreater) {
                if (cur.data < next.data) {
                    temp = cur.data;
                    cur.data = next.data;
                    next.data = temp;
                }
                isGreater = false;
            } else {
                if (cur.data > next.data) {
                    temp = cur.data;
                    cur.data = next.data;
                    next.data = temp;
                }
                isGreater = true;
            }
            cur = cur.next;
        }
    }

    public T remove() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> temp = head;
        head = head.next;
        return temp.data;
    }

    public SinglyLinkedList<T> reverse() {
        SinglyLinkedList<T> reversed = new SinglyLinkedList<>();
        Node<T> temp = head;
        while (temp != null) {
            reversed.add(temp.data);
            temp = temp.next;
        }
        return reversed;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node<T> reverseLinkedList() {
        Node currentNode = head;
        // For first node, previousNode will be null
        Node previousNode = null;
        Node nextNode;
        while(currentNode != null)
        {
            nextNode = currentNode.next;
            // reversing the link
            currentNode.next = previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    Node<Integer> mergeTwoLinkedLists(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> temp1 = l1;
        Node<Integer> temp2 = l2;
        Node<Integer> res = new Node<>(0);

        while (temp1 != null || temp2 != null) {

            if (temp1 != null && temp2 != null) {

                if (temp1.data < temp2.data) {
                    res.next = temp1;
                    temp1 = temp1.next;
                } else {
                    res.next = temp2;
                    temp2 = temp2.next;
                }
            }
            else if (temp1 == null) {
                res.next = temp2;
                break;
            }
            else if (temp2 == null) {
                res.next = temp1;
                break;
            }
            res = res.next;
        }
        return res.next;
    }


    Node<Integer> mergeTwoLinkedLists3(Node<Integer> l1, Node<Integer> l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.data < l2.data) {
            l1.next = mergeTwoLinkedLists3(l1.next,l2);
            return l1;
        }

        else {
            l2.next = mergeTwoLinkedLists3(l1,l2.next);
            return l2;
        }
    }


    Node<Integer> add(Node<Integer> head, Integer value) {
        Node<Integer> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        return head;
    }


    public static void main(String... args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("sheva");
        list.add("kott");
        list.add("arina");
        list.addAfter("kott", "some");
//        list.reverse() ;


        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
//        list2.add(9696);
//        list2.add(2881);
//        list2.add(7346);
//        list2.add(4933);
//        list2.add(1343);
//        list2.add(2634);
//        list2.add(8610);
//        list2.add(4676);
//        list2.add(156);
//        list2.add(7791);
//        list2.add(6592);

        list2.add(9);
        list2.add(8);
        list2.add(5);
        list2.add(3);

        list2.add(2);
        list2.add(1);

        SinglyLinkedList<Integer> list3 = new SinglyLinkedList<>();
        list3.add(8);
        list3.add(6);
        list3.add(3);
        list3.add(2);


        list2.isListPalindrome(list2.peek());
        list2.mergeTwoLinkedLists3(list2.peek(), list3.peek());
//        list2.add(3);
//        list2.add(2);
//        list2.add(1);
        list2.zigzag(list2.peek());
        list2.print();

        list.reverseLinkedList();
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.removeAfter("some"));
        System.out.println(list.remove());

        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
//        list1.add(2);
//        list1.add(5);
//        list1.add(0);
//        list1.add(7);
//        list1.add(0);
//        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
//        list2.add(1);
//        list2.add(9);
//        list2.add(3);
//
//        Utils.sum(list1, list2);
    }
}

class Utils {

    public static SinglyLinkedList<Integer> sum(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        SinglyLinkedList.Node<Integer> temp1 = list1.peek();
        SinglyLinkedList.Node<Integer> temp2 = list2.peek();

        SinglyLinkedList<Integer> res = new SinglyLinkedList<>();

        boolean overflow = false;
        while (temp1 != null || temp2 != null) {

            int a = 0, b = 0, sum = 0;
            if (temp1 != null) {
                a = temp1.data;
            }
            if (temp2 != null) {
                b = temp2.data;
            }

            sum = a + b + (overflow ? 1 : 0);
            if (sum > 9) {
                overflow = true;
                sum = Integer.valueOf(String.valueOf(sum).substring(1));
            } else {
                overflow = false;
            }

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }

            res.add(sum);
        }
        return res;
    }

}
