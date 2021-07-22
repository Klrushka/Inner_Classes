package task21;

public interface Interface {
    void method1();
    void method2();
    void method3();

    class Nested{
        public static void methods(Interface i){
            i.method1();
            i.method2();
            i.method3();
        }
    }
}