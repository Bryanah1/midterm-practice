public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private String registrationNum;


    public Vehicle(String ownerName, String vehicleType, String registrationNum) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNum = registrationNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    @Override
    public String toString() {
        return "The " + vehicleType + " is owned by " + ownerName;
    }
}
