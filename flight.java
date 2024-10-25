import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Flight {
   
    private String flightNumber;
    private String source;
    private String destination;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    
    public Flight(String flightNumber, String source, String destination, LocalTime departureTime, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

  
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    public void displayFlightDetails() {
        long hours = ChronoUnit.HOURS.between(departureTime, arrivalTime);
        long minutes = ChronoUnit.MINUTES.between(departureTime, arrivalTime) % 60;

        System.out.println("Schedule Details:");
        System.out.println("Schedule Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Duration: " + hours + " hours " + minutes + " minutes");
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flightNumber = scanner.nextLine();

        String source = scanner.nextLine();

        String destination = scanner.nextLine();

        String departureInput = scanner.nextLine();
        
        LocalTime departureTime = LocalTime.parse(departureInput);

        String arrivalInput = scanner.nextLine();
        
        LocalTime arrivalTime = LocalTime.parse(arrivalInput);

        
        Flight flight = new Flight(flightNumber, source, destination, departureTime, arrivalTime);

      
        flight.displayFlightDetails();

        scanner.close(); 
    }
}
