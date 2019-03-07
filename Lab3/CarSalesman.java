
/**
 * Writes Receipt of car purchase costs.
 *
 * @author (Ryan Kim)
 * @version (2-20-2019)
 */
import java.util.Scanner;
public class CarSalesman
{
    public static void main(String[] args) {
        //Display project info
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Cours:      COSC 111, Winter 2019");
        System.out.println("Lab#:       3, part #1");
        System.out.println("Due Date:   2-20-2019\n");
        
        //Initialize constants
        final double SALES_TAX = .06;
        final double LICENSE_TAX = .005;
        final int DESTINATION = 700;
        final int DOCUMENTATION = 200;
        final int PREP = 50;
        
        //Create scanner object and take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base price of a car: $");
        double basePrice = sc.nextDouble();
        
        //Calculate taxes
        double licenseCost = LICENSE_TAX * basePrice;
        double salesPrice = SALES_TAX * basePrice;
        double total = basePrice + DESTINATION + DOCUMENTATION + PREP + licenseCost + salesPrice;
        
        //Print receipt
        System.out.printf("\nVehicle Base Price.................$ %.2f", basePrice);
        System.out.printf("\nDestination Charge.................$ %.2f", (double)DESTINATION);
        System.out.printf("\nDocumentation......................$ %.2f", (double)DOCUMENTATION);
        System.out.printf("\nPrep...............................$ %.2f", (double)PREP);
        System.out.printf("\nLicense Plate......................$ %.2f", licenseCost);
        System.out.printf("\nTax................................$ %.2f", salesPrice);
        System.out.printf("\n\nTotal..............................$ %.2f", total);
    }
}
/*
Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #1
Due Date:   2-20-2019

Enter the base price of a car: $18375.00

Vehicle Base Price.................$ 18375.00
Destination Charge.................$ 700.00
Documentation......................$ 200.00
Prep...............................$ 50.00
License Plate......................$ 91.88
Tax................................$ 1102.50

Total..............................$ 20519.38
*/