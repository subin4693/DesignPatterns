package StructuralDesignPattern.Facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("working fne");
    }
}
// The Facade Design Pattern is used to simplify complex systems by providing a
// single, easy-to-use interface for a set of interfaces in a subsystem. Instead
// of interacting with multiple classes directly, you use one facade class that
// handles the communication for you.

// Key Points:

// Makes a system easier to use by hiding complexity.

// Helps organize code and improves readability.

// Example:

// Imagine you want to play a movie at home. Normally, you need to turn on the
// TV, set up speakers, and start the movie player—all individually. With the
// Facade Design Pattern, you have one HomeTheaterFacade class. When you call
// its watchMovie() method, it does all the steps for you.