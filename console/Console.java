package console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {

			TV tv = new TV("TV", 2, false);

			System.out.print("Enter input (X to change status, E to exit program): ");
			String input = scan.next();
			if (input.equalsIgnoreCase("X")) {
				System.out.print("TV mute status changed to ");
				tv.changeStatus(!(tv.getStatus()));
			} else if (input.equalsIgnoreCase("E")) {
				System.out.println("Program end.");
				scan.close();
				break;
			} else {
				System.out.println("Current TV volume is: " + tv.getVol());
				System.out.print("Change TV volume by (enter a number): ");
				try {
					tv.changeVol(scan.nextInt());
				} catch (InputMismatchException e) {
					System.out.println("You did not enter a number.");
				} catch (InvalidVolumeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
