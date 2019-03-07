
/**
 * Converts from second to hours, minutes, and seconds.
 *
 * @author (Ryan Kim)
 * @version (2-20-19)
 */
import java.util.Scanner;
public class TimeConverter
{
    public static void main(String[] args) {
        //Output programmer details
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Cours:      COSC 111, Winter 2019");
        System.out.println("Lab#:       3, part #2");
        System.out.println("Due Date:   2-20-2019\n");
        
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int time = sc.nextInt();
        
        //Find time in hh:mm:ss
        int hours = time/3600;
        int minutes = (time % 3600)/60;
        int seconds = (time % 3600) % 60;
        
        //Display time
        System.out.print(time + " seconds is: ");
        //Make sure that every digit is printed with two 0's
        if (hours < 10) {
            System.out.print("0");
            System.out.print(hours + ":");
        }
        else {
            System.out.print(hours + ":");
        }
        if (minutes < 10) {
            System.out.print("0");
            System.out.print(minutes + ":");
        }
        else {
            System.out.print(minutes + ":");
        }
        if (seconds < 10) {
            System.out.print("0");
            System.out.print(seconds);
        }
        else {
            System.out.print(seconds);
        }
    }
}
/*
Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #2
Due Date:   2-20-2019

Enter time in seconds: 14228
14228 seconds is: 03:57:08

Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #2
Due Date:   2-20-2019

Enter time in seconds: 18540
18540 seconds is: 05:09:00

Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #2
Due Date:   2-20-2019

Enter time in seconds: 36012
36012 seconds is: 10:00:12

Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #2
Due Date:   2-20-2019

Enter time in seconds: 7382
7382 seconds is: 02:03:02

Programmer: Ryan Kim
Cours:      COSC 111, Winter 2019
Lab#:       3, part #2
Due Date:   2-20-2019

Enter time in seconds: 36610
36610 seconds is: 10:10:10
 */
