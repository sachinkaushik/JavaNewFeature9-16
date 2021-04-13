package java16demo;

public record Vehicle1(String model, String vehicleNo) {
    Vehicle1(String model){
        this(model, null);
    }

    public String getMomdelInUpperCase(){
        return model().toUpperCase();
    }

    public static String getModelAsUpperCase(Vehicle1 v){
        return v.model().toUpperCase();
    }
}
