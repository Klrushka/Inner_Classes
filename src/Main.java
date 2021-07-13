import task1.Outer;
import task21.ClassWithImplementation;
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

         */




    }
}
