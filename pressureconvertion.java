import java.util.*;
import java.text.DecimalFormat;
public class Pressure_converter {
		public static void main(String[] args) {
	 
			double pressure, atmosphere, Bar, choice, psi, torr, Pascals;
	 
			DecimalFormat f = new DecimalFormat("##.##");
	 
			Scanner sc = new Scanner(System.in);
	 
			System.out.println("$$$ Welcome to the Pressure Converter! $$$");
	 
			System.out.println("which Pressure unit You want to Convert ? ");
			
			System.out.println("1:Pascals \t2:atmosphere \t3:Bar \n4:psi \t5:torr ");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			System.out.println("Enter the pressure ?");
			pressure = sc.nextFloat();
	 
			if (choice == 1) {
	 
				atmosphere = pressure / 70;
				System.out.println("Your " + pressure + " Pascals is : " + f.format(atmosphere) + " atmosphere");
	 
				Bar = pressure / 100000;
				System.out.println("Your " + pressure + " Pascals is : " + f.format(Bar) + " Bar");
	 
				psi = pressure / 6895;
				System.out.println("Your " + pressure + " Pascals is : " + f.format(psi) + " psi");
	 
				torr = pressure /133;
				System.out.println("Your " + pressure + " Pascals is : " + f.format(torr) + " torr");
	 
			} else if (choice == 2) {
				// For atmosphere Conversion
	 
				Pascals = pressure * 101325;
				System.out.println("Your " + pressure + " atmosphere is : " + f.format(Pascals) + " Pascals");
	 
				Bar = pressure * 1.013;
				System.out.println("Your " + pressure + " atmosphere is : " + f.format(Bar) + " Bar");
	 
				psi = pressure *14.696;
				System.out.println("Your " + pressure + " atmosphere is : " + f.format(psi) + " psi");
	 
				torr = pressure * 760;
				System.out.println("Your " + pressure + " atmosphere is : " + f.format(torr) + " torr");
	 
				} else if (choice == 3) {
				// For Bar Conversion
	 
				Pascals = pressure * 100000;
				System.out.println("Your " + pressure + " Bar is : " + f.format(Pascals) + " Pascals");
	 
				atmosphere = pressure *1.013;
				System.out.println("Your " + pressure + " Bar is : " + f.format(atmosphere) + " atmosphere");
	 
				psi = pressure * 14.504;
				System.out.println("Your " + pressure + " Bar is : " + f.format(psi) + " psi");
	 
				torr = pressure * 750;
				System.out.println("Your " + pressure + " Bar is : " + f.format(torr) + " torr");
	 
				} else if (choice == 4) {
				// For psi Conversion
	 
				Pascals = pressure * 6895;
				System.out.println("Your " + pressure + " psi is : " + f.format(Pascals) + " Pascals");
	 
				atmosphere = pressure /14.696;
				System.out.println("Your " + pressure + " psi is : " + f.format(atmosphere) + " atmosphere");
	 
				Bar = pressure /14.504;
				System.out.println("Your " + pressure + " psi is : " + f.format(Bar) + " Bar");
	 
				torr = pressure * 51.715;
				System.out.println("Your " + pressure + " psi is : " + f.format(torr) + " torr");
	 
				} else if (choice == 5) {
	 
				// For torr Conversion
	 
				Pascals = pressure * 133;
				System.out.println("Your " + pressure + " torr is : " + f.format(Pascals) + " Pascals");
	 
				atmosphere = pressure /760;
				System.out.println("Your " + pressure + " torr is : " + f.format(atmosphere) + " atmosphere");
	 
				Bar = pressure /750;
				System.out.println("Your " + pressure + " torr is : " + f.format(Bar) + " Bar");
	 
				psi = pressure /51.715;
				System.out.println("Your " + pressure + " torr is : " + f.format(psi) + " psi");
	 
				} else {
				System.out.println("Invalid input");
			}
		}
}
