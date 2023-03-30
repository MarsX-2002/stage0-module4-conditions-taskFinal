package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double side1 = Math.sqrt(Math.pow(firstSide - secondSide, 2) + Math.pow(firstSide - thirdSide, 2));
        double side2 = Math.sqrt(Math.pow(secondSide - firstSide, 2) + Math.pow(secondSide - thirdSide, 2));
        double side3 = Math.sqrt(Math.pow(thirdSide - firstSide, 2) + Math.pow(thirdSide - secondSide, 2));

        // Check the Triangle Inequality Theorem
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println("This is a valid triangle.");
        } else {
            System.out.println("It's not a triangle.");
        }
    }
}
