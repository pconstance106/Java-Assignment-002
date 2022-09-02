/**
 *
 * @author Trevor Hartman
 * @author Paul Constance
 *
 * @since Version 1.0
 *
 */

public class ArchimedesPiMethod {
    public static void main(String[] args) {

        int polygonSides = 420;

        double polygonB = 360.0 / polygonSides;
        double polygonA = polygonB / 2;

        double polygonLength = 2 * (Math.sin(Math.toRadians(polygonA)));

        double polygonPerimeter = polygonLength * polygonSides;

        System.out.print("I like π, ");
        System.out.print(polygonPerimeter / 2);

    }
}
