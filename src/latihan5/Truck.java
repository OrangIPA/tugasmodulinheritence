package latihan5;

public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    public Truck(int startCadence, int startGear, int startSpeed){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public void setCadence(int cadence){
        this.cadence = cadence;
    }
    public void applyBrake(int decrement){
        this.speed -= decrement;
    }
    public void speedUp(int increment){
        this.speed += increment;
    }
}
