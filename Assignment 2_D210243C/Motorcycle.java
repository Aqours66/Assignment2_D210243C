public class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay,
            double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    // Getter and setter for engineCapacity
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Calculate and return the top speed of the motorcycle based on engine capacity
    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    // Override toString method to provide a string representation of the motorcycle
    @Override
    public String toString() {
        return super.toString() +
                "\nEngine Capacity: " + engineCapacity + " cc";
    }

    // Override calculateRentalCost method to add RM150 for motorcycles with top
    // speed of at least 300
    @Override
    public double calculateRentalCost(int days) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(days) + 150 * days;
        } else {
            return super.calculateRentalCost(days);
        }
    }
}
