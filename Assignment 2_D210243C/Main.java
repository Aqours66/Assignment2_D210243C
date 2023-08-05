public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        // Create Car objects
        vehicles[0] = new Car("C001", "Toyota", "Camry", 100, 4);
        vehicles[1] = new Car("C002", "Honda", "Civic", 90, 2);

        // Create Motorcycle objects
        vehicles[2] = new Motorcycle("M001", "Yamaha", "MT-07", 50, 600);
        vehicles[3] = new Motorcycle("M002", "Kawasaki", "Ninja 300", 40, 300);

        // Traverse through the array and print vehicle details
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            int rentalDays = 5;
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Motorcycle) {
                System.out.println("Top Speed: " + ((Motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }
            System.out.println("----------------------");
        }
    }
}
