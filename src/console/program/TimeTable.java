package console.program;

import java.util.Scanner;

/**
 * The Timetable class provides the functionality needed to manage orders and checkout.
 */
public class TimeTable {

    private String name;
    
    public TimeTable(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
	/**
     * The method to operate the restaurant.
     */
    public void run() {
    	boolean exit = false;
    	do {
			printMenu();
			
			String stringInput = readUserInput();
			
			// Check the user input and continue with the next iteration
			// if no input is provided
			if (stringInput.isEmpty()) {
				System.out.println("Please select a valid menu option.");
				continue;
			}

			char input = stringInput.charAt(0);
			
			switch (input) {
				case 'a':
					this.order();
					break;
				case 'b':
					this.checkout();
					break;
				case 'c':
					exit = true;
					break;
				default:
					System.out.println("Please select a valid menu option.");
					break;
			}
		} while (!exit);
    }
    
	/**
     * The utility method to print menu options.
     */
	public void printMenu(){
		String banner = new String(new char[50]).replace('\u0000', '=');
		System.out.println(banner + "\n" + "Welcome to " + getName() + "\n" + banner);
		System.out.printf("   %s%n", "a) Order");
		System.out.printf("   %s%n", "b) Checkout");
		System.out.printf("   %s%n", "c) Exit");
		System.out.print("Please select: ");
	}
	
	/**
     * The utility method to read user input.
     */
    public static String readUserInput() {
	    Scanner sc = new Scanner(System.in);
	    return sc.nextLine();
	}
    
    /**
     * The method to place orders.
     */
    public void order() {
    	System.out.println("Order food.");
    }
    
    /**
     * The method to manage checkout.
     */
    public void checkout() {
    	System.out.println("Checkout.");
    }
}
