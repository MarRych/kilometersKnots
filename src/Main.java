import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //13. Napisz program pozwalający na przeliczenie prędkości
        // zadanej w kilometrach na godzinę na prędkość wyrażoną w węzłach. (poziom 1)
        /*
           double kph, knots;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many kilometers/hour: ");
            kph = scanner.nextDouble();
            knots = (kph * 1.85);
            System.out.printf("Knots:  %.2f", knots);
*/
        double kph;
        double knots ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many kilometers/hour: ");
        kph = scanner.nextDouble();

        System.out.print(multiply(kph,1.85));

    }

    private static double multiply(double kph, double knots)  {
       double result = kph * knots;
       return result;
    }
}