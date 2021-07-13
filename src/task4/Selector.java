package task4;

public interface Selector {
    boolean end();
    Object current();
    void next();
    Sequence outer();
}
