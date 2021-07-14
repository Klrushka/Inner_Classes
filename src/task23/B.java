package task23;

public class B {
    private static U[] us = new U[10];
    private static int i = 0;

    public void add(U u){
        if (i >= us.length){
            System.out.println("Can't add");
        } else {
            us[i] = u;
            i++;
        }
    }

    public void setNull(int i){
        if (i > us.length) {
            System.out.println("Invalid index");
        } else {
            us[i] = null;
        }
    }

    public void callUMethods(){
        for (U u : us){
            u.method1();
            u.method2();
            u.method3();
        }
    }

    public void toStringArray(U[] u){
        for (U u1: u){
            if (u1 == null){
                System.out.println("null");
            } else  System.out.println(u1.toString());
        }
    }

    public U[] getUs() {
        return us;
    }
}
