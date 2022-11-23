package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {
    private String hullType;
    private IMotorised engine;
    private IWaterVehicle waterV;
    

    public Speedboat(String hullType, IMotorised engine, IWaterVehicle waterV, int weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = "hullType";
    }


    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);


    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel){
        this.engine.setFuel(fuel);

    }

    @Override
    public void setHullType() {
        System.out.println("Hull type is pontoon");
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }
    
}
