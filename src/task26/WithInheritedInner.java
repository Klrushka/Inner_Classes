package task26;

public class WithInheritedInner {
    class InheritedInner extends WithInner.WithInnerInner{
        InheritedInner(WithInner withInner){
            withInner.super(12);
        }
    }
}
