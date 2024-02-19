public class Bicycle extends Vehicle {
    private boolean hasGears;
    private int gearCount;

    public Bicycle(String ownerName, String vehicleType, String registrationNum, boolean hasGears, int gearCount) {
        super(ownerName, vehicleType, registrationNum);
        this.hasGears = hasGears;
        this.gearCount = gearCount;




    }
}
