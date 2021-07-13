package task4;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public void outerMethod(){
        System.out.println("Sequence.outerMethod()");
    }

    private class SequenceSelector implements Selector {
        private int i = 0;


        @Override
        public Sequence outer(){
            return Sequence.this;
        }

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}