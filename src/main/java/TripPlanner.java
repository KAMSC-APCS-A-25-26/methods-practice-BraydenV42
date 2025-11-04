import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miles, avgSpeed, milesPerGallon, fuelPrice;
        // TODO: Get user input for trip details
        // - Distance (miles)
        System.out.print("Enter trip distance (miles): ");
        miles = sc.nextInt();
        // - Average speed (mph)
        System.out.print("Enter average speed (mph): ");
        avgSpeed = sc.nextInt();
        // - Fuel efficiency (miles per gallon)
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        milesPerGallon = sc.nextInt();
        // - Fuel price per gallon
        System.out.print("Enter fuel price per gallon ($): ");
        fuelPrice = sc.nextInt();
        
        // TODO: Calculate travel time using a return method
        double travelTime = calculateTravelTime(avgSpeed, miles);
        // TODO: Calculate fuel needed using a return method
        double fuel = calculateFuelNeeded(milesPerGallon, miles);
        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(fuelPrice, fuel);
        // TODO: Display results using a void method
        displayResults(tripCost, fuel, travelTime);
    }
    //
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double a, double b) {
        return b / a;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double a, double b) {
        return b / a;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double a, double b) {
        return a * b;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double a, double b, double c) {
        System.out.println("Travel Time: " + c + " hours");
        System.out.println("Fuel Needed: " + b + " gallons");
        System.out.println("Trip Cost: $" + a);
        return;
    }
}
