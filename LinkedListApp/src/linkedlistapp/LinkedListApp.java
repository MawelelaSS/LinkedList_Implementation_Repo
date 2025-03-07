/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistapp;

import za.ac.tut.LinkedList;
import za.ac.tut.Person;

/**
 * A demonstration of the generic LinkedList implementation.
 * This class tests the linked list with different data types such as Integer, String, and Person.
 * 
 * @author sibus
 */
public class LinkedListApp {

    /**
     * The main method that executes the LinkedList demonstration.
     * 
     * @param args the command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        
        // Demonstration with Integer type
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertAtBeginning(10);
        intList.insertAtBeginning(5);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);

        System.out.println("Integer Linked List contents:");
        intList.display();

        // Demonstration with String type
        LinkedList<String> stringList = new LinkedList<>();
        stringList.insertAtBeginning("Hello");
        stringList.insertAtEnd("World");

        System.out.println("String Linked List contents:");
        stringList.display();
        
        // Adding more elements to intList
        intList.insertAtBeginning(32);
        intList.insertAtEnd(50);
        System.out.println("Updated Integer Linked List:");
        intList.display();
        
        // Demonstration with Person objects
        LinkedList<Person> people = new LinkedList<>();
        people.insertAtBeginning(new Person("Sibusiso", 28));
        people.insertAtBeginning(new Person("Lencwe", 25));

        System.out.println("Person Linked List contents:");
        people.display();
        
        // Adding more Person objects
        people.insertAtEnd(new Person("John", 30));
        people.insertAtBeginning(new Person("Siya", 50));

        System.out.println("Updated Person Linked List:");
        people.display();
    }
}
