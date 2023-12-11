import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a node at the end of the doubly linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        while (true) {
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int beginningData = scanner.nextInt();
                    doublyLinkedList.insertAtBeginning(beginningData);
                    break;

                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int endData = scanner.nextInt();
                    doublyLinkedList.insertAtEnd(endData);
                    break;

                case 3:
                    doublyLinkedList.display();
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
