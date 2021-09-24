/* 
What should the functions have as parameter(s) ? What type should they be?
What should the functions return?

The functions should have the opposite unit as a parameter. 
So if you're converting it into Celsius, you put farenheit 
as your parameter. Both the parameter and the return type 
of the function should be of type double. And obviously, 
the functions should ideally return the conversion of the
unit.
*/

import java.util.Scanner;

public class CtoFtester {
    public static double toCelcius(double farenheit) {
        return (farenheit / 1.8) - 32.0;
    }

    public static double toFarenheit(double celcius) {
        return (celcius * 1.8) + 32.0;
    }

    //I decided to make the test function something interesting.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Still hate this -- it leaves closing the class to garbage collection.

        System.out.println("Enter the number you want to convert...");
        double number = in.nextDouble();
        in.nextLine(); //Scanner bug workaround

        System.out.println("Enter C or F...");
        String unit = in.nextLine();
        in.close(); //Nevermind, I found out how to close it.

        if (unit.equals("C")) {
            System.out.printf("%.1f C = %.1f F", number, toFarenheit(number));
        }
        else if (unit.equals("C")) {
            System.out.printf("%.1f F = %.1f C", number, toCelcius(number));
        }


    }
}
