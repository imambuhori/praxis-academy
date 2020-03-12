public class Bicycle {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public int setCadence(int newValue) {
        return cadence += newValue;
    }
        
    public int setGear(int newValue) {
        return gear = newValue;
    }

    public int setSpeed(int newValue) {
        return speed += newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public String stop(int speed) {
        return "Stopped";
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}

class MountainBike extends Bicycle {
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}
