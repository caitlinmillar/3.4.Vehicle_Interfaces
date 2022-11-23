package vehicles;

public class Motor implements IMotorised{
    private int hp;
    private int fuel;
    private IMotorised baseMotor;


    public Motor(int hp, IMotorised baseMotor, int fuel){
        this.hp = hp;
        this.baseMotor = baseMotor;
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        this.baseMotor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.baseMotor.stopEngine();
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
       this.baseMotor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.baseMotor.setFuel(fuel);
    }
}
