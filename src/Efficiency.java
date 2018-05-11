/*
 * COMP90041 lab2 
 * Assignment Name: Efficiency.java
 * Student NO.:653909 
 * Author: Changjian MA 
 * Date: 25/08/2015
 * Java program to compute the fuel efficiency,in litres per hundred
 * kilometers, of a vehicle
 */
import java.util.Scanner;
public class Efficiency {

	public static void main(String[] args) {
		System.out.print("Enter vehicle make: ");
		Scanner scanner =new Scanner(System.in);
		String make = scanner.nextLine();
		
		System.out.print("Enter vehicle model: ");
		String model = scanner.nextLine();
		System.out.print("Enter kilometres travelled: ");
		Double kilo = scanner.nextDouble();
		System.out.print("Enter litres of fuel used: ");
		Double litres = scanner.nextDouble();
		scanner.close();
		Double aver=litres/kilo*100;
		System.out.printf("Fuel efficiency for a "+ make +" "+ model + 
			 ": " + "%.2f litres/100 km\n",aver);
 
	}

}
