public class ElectricCar extends Vehicle {
    private double batteryCapacity;
    private double range;

    public ElectricCar(String ownerName, String vehicleType, String registrationNum, double batteryCapacity, double range) {
        super(ownerName, vehicleType, registrationNum);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "This electric car has " + batteryCapacity + " in kWh and can go " + range + " with a single full charge.";
    }
}
