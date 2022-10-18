import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter Coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter Coordinate 2: ");
        String coord2 = scan.nextLine();

        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(","))) ;
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",")+2,coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",")+2,coord2.indexOf(")"))) ;

        if (x1 == x2) {
            System.out.println("Produces a vertical line.");
            System.out.println("Equation: x = " + x1);
            System.exit(0);
        }

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        System.out.println("Coordinate for x: " + equation.coordinateForX(scan.nextDouble()));
        scan.nextLine();


    }
}
