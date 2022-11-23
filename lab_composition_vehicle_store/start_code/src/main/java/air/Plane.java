package air;

import products.IProduct;
import vehicles.IVehicle;

public class Plane implements IAir, IProduct {
    private String vehicleType;

    public Plane(String vehicleType){
        this.vehicleType = vehicleType;
    }


    @Override
    public String getVehicleType() {
        return this.vehicleType;
    }

    @Override
    public void setVehicleType(String type) {
        this.vehicleType = vehicleType;
    }


    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public long getInventory() {
        return 0;
    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setInventory(long amount) {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void addInventory(long amount) {

    }

    @Override
    public void removeInventory(long amount) throws Exception {

    }
}
