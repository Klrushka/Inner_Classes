package task23;

public class A {

    public U returnU(){
        return new U() {
            @Override
            public void method1() {
                System.out.println("method 1");
            }

            @Override
            public void method2() {
                System.out.println("method 1");
            }

            @Override
            public void method3() {
                System.out.println("method 1");
            }
        };


    }
}
