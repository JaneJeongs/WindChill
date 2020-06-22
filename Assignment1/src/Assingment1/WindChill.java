package Assingment1;
import java.util.Scanner;
/*

 * Class: CMSC203

 * Program: Wind Chill Calculator

 * Instructor: p. Grinberg

 * Description: Calulate wind chill temperature using Fahrenheit temperature and wind speed input by user

 * Due: <06/21/2020> 

 * I pledge that I have completed the programming assignment independently.

	I have not copied the code from a student or any source.

	I have not given my code to any student.

Print your Name here: Jane Jeong
*/
public class WindChill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Header
		System.out.println("Wind Chill Calculator");
		System.out.println();

		double temp, windSpeed, windChill;
		
		//prompt user to enter temperature
		System.out.print("Enter the temperature in Fahrenheit (must be >=-45 and <=40):");
		temp = scanner.nextDouble();
		
		//conditional statement
		while (temp <-45 || temp >40) {
			System.out.println("Must be >= -45 and <=40");
			System.out.print("Please enter temperature again: ");
			temp = scanner.reset().nextDouble();
			System.out.println();
		} 
		
		//prompt user to enter wind speed
		System.out.print("Enter the wind speed (must be >=5 and <=60): ");
		windSpeed = scanner.nextDouble();
		System.out.println();
		
		//conditional statement
		while (windSpeed <5 || windSpeed >60) {
			System.out.println("Must be >= 5 and <=60");
			System.out.print("Please enter wind speed again: ");
			windSpeed = scanner.reset().nextDouble();
			System.out.println();
		} 
		
		
		windChill = 35.74 + (0.6215*temp) - (35.75*(Math.pow(windSpeed, 0.16))) + (0.4275*temp*(Math.pow(windSpeed, 0.16)));
		
		System.out.println("Wind chill temperature: " + windChill + " degrees Fahrenheit");
		System.out.println();
	
		
		System.out.println("Programmer: Jane Jeong");
		scanner.close();
			}
	}

