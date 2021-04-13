public class InterfacePrivateDemo implements PrivateInterface{

    public static void main(String[] args) {
        PrivateInterface p = new InterfacePrivateDemo();
        p.callPrivateMethod();
    }
}

interface PrivateInterface{
    default void callPrivateMethod(){
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("Private Method from Interface");
    }
}
