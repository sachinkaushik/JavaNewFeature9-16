package java11demo;

public class NestBasedAccessExample {

    private void privateNestMethod(){}
    public  void publicMethod(){}

    class NestedClass{

        public void doSomething(){
            privateNestMethod();
        }
    }
}
