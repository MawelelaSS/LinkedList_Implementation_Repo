/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

/**
 * A generic singly linked list implementation.
 * 
 * @param <T> the type of elements stored in the linked list
 * @author sibus
 */
public class LinkedList<T> {

    private Node<T> head; // Head of the linked list

    /**
     * Constructs an empty LinkedList.
     */
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    /**
     * Inserts a new node with the given data at the beginning of the list.
     *
     * @param data the data to be inserted
     */
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data); // Creates a new node with the provided data
        newNode.next = head; // Point new node to current head
        head = newNode; // Update head to the new node
    }

    /**
     * Inserts a new node with the given data at the end of the list.
     *
     * @param data the data to be inserted
     */
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) { // If list is empty, set new node as head
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newNode; // Set last node's next to new node
    }
   
    /**
     * Displays all elements in the linked list.
     * Prints the list elements separated by commas, ending with "null".
     */
    public void display() {
        Node<T> temp = head;
        while (temp != null) { // Traverse the list
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }
}
