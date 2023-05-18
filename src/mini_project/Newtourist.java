package mini_project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tourist {
    private String name;
    private String destination;

    public Tourist(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public String toString() {
        return "Tourist: " + name + ", Destination: " + destination;
    }
}

class TouristManagementSystem {
    private List<Tourist> tourists;

    public TouristManagementSystem() {
        tourists = new ArrayList<>();
    }

    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
        System.out.println("Tourist added: " + tourist.getName());
    }

    public void removeTourist(Tourist tourist) {
        if (tourists.remove(tourist)) {
            System.out.println("Tourist removed: " + tourist.getName());
        } else {
            System.out.println("Tourist not found: " + tourist.getName());
        }
    }

    public void displayTourists() {
        System.out.println("Tourists List:");
        for (Tourist tourist : tourists) {
            System.out.println(tourist);
        }
    }

	public Tourist[] getTourists() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Newtourist {
    public static void main(String[] args) {
        TouristManagementSystem tms = new TouristManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n----- Tourist Management System Menu -----");
            System.out.println("1. Add Tourist");
            System.out.println("2. Remove Tourist");
            System.out.println("3. Display Tourists");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter tourist name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    Tourist tourist = new Tourist(name, destination);
                    tms.addTourist(tourist);
                    break;
                case 2:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter tourist name: ");
                    String removeName = scanner.nextLine();
                    Tourist touristToRemove = null;
                    for (Tourist t : tms.getTourists()) {
                        if (t.getName().equalsIgnoreCase(removeName)) {
                            touristToRemove = t;
                            break;
                        }
                    }
                    if (touristToRemove != null) {
                        tms.removeTourist(touristToRemove);
                    } else {
                        System.out.println("Tourist not found: " + removeName);
                    }
                    break;
                case 3:
                    tms.displayTourists();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}


