/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

/**
 * A generic Node class used in a singly linked list.
 *
 * @param <T> the type of data stored in the node
 * @author sibus
 */
public class Node<T> {

    /** The data stored in the node. */
    T data; 

    /** Reference to the next node in the linked list. */
    Node<T> next; 

    /**
     * Constructs a new node with the specified data.
     * The next node reference is initially set to null.
     * 
     * @param data the data to be stored in the node
     */
    public Node(T data) {
        this.data = data;
        this.next = null; // Initially, next is set to null
    }
}
