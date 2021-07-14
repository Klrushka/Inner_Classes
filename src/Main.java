import task1.Outer;
import task21.ClassWithImplementation;
import task23.A;
import task23.B;
import task4.Selector;
import task4.Sequence;

public class Main {
    public static void main(String[] args) {

        /*
        Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
        Add a method to Outer that returns an object of type Inner. In main( ), create and
        initialize a reference to an Inner.
         */

        Outer outer = new Outer();
        Outer.Inner inner = outer.returnInner();
        System.out.println();

        /*
        Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces
        the reference to the outer class Sequence.
         */

        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        selector.outer().outerMethod();

        System.out.println();

        /*
        Exercise 19: (2) Create a class containing an inner class that itself contains an inner
        class. Repeat this using nested classes. Note the names of the .class files produced by the
        compiler.


        **************************************** task19 package **************************************

         */


        /*
        Exercise 21: (2) Create an interface that contains a nested class that has a static method
        that calls the methods of your interface and displays the results. Implement your interface
        and pass an instance of your implementation to the method.
         */

        ClassWithImplementation classWithImplementation = new ClassWithImplementation();

        classWithImplementation.method1();
        classWithImplementation.method2();
        classWithImplementation.method3();

        System.out.println();

        /*
        Exercise 23: (4) Create an interface U with three methods. Create a class A with a
        method that produces a reference to a U by building an anonymous inner class. Create a
        second class B that contains an array of U. B should have one method that accepts and stores
        a reference to a U in the array, a second method that sets a reference in the array (specified
        by the method argument) to null, and a third method that moves through the array and calls
        the methods in U. In main( ), create a group of A objects and a single B. Fill the B with U
        references produced by the A objects. Use the B to call back into all the A objects. Remove
        some of the U references from the B.
         */


        A a1 = new A();
        A a2 = new A();

        B b1 = new B();

        for (int i = 0; i < 5; i++){
            b1.add(a1.returnU());
            b1.add(a2.returnU());
        }

        b1.setNull(5);
        b1.setNull(3);

       b1.toStringArray(b1.getUs());

       /*
       Exercise 26: (2) Create a class with an inner class that has a non-default constructor
       (one that takes arguments). Create a second class with an inner class that inherits from the
       first inner class.

       **************************************** task26 package **************************************
        */




    }
}
