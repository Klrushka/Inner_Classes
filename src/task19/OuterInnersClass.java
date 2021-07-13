package task19;

public class OuterInnersClass {
    public class InnerClass{

        InnerClass(){
            System.out.println("Inner class");
        }

        public class InnerInnerClass{
            InnerInnerClass(){
                System.out.println("InnerInnerClass");
            }
        }
    }
}
