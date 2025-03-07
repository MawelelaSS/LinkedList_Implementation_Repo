/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package za.ac.tut;

/**
 * The Person class represents a simple model of a person with a name and age.
 * It provides constructors, getter and setter methods, and a toString method
 * to return a string representation of the object.
 * 
 * @author sibus
 */
public class Person {
   
    // Instance variables to store the person's name and age
    private String name;
    private int age;

    /**
     * Default constructor that initializes a Person object with default values.
     */
    public Person() {
    }

    /**
     * Parameterized constructor that initializes a Person object with a given name and age.
     * 
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     * 
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     * 
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a string representation of the Person object.
     * 
     * @return A string containing the name and age of the person.
     */
    @Override
    public String toString() {
        return "[ name: " + name + ", age: " + age + "]";
    }
}
