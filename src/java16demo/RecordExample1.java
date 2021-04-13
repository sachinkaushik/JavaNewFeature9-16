package java16demo;

public class RecordExample1 {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle("Audi", "UP11BW2838");

        Vehicle v2= new Vehicle("Audi", "UP11BW2838");

        System.out.println(v1.model());

        System.out.println(v1.vehicleNo());
        System.out.println(v2.toString());
        System.out.println(v1.equals(v2));

        Vehicle1 vv = new Vehicle1("bmw");
        System.out.println(vv.getMomdelInUpperCase());


        System.out.println(Vehicle1.getModelAsUpperCase(vv));
    }
}
