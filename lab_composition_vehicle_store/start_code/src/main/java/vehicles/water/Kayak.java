package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {
    private String hullType;

    public Kayak(String hullType, float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType() {
        System.out.println("Hull type is flat bottomed");
    }
}
