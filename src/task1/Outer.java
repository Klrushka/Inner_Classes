package task1;

public class Outer {

    public Outer(){
        System.out.println("Outer constructor") ;
    }

    public Inner returnInner() {
        return new Inner();
    }

    public class Inner {
        Inner() {
            System.out.println("Inner constructor");
        }
    }
}
