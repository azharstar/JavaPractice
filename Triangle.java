package controlstatements;

public class Triangle {

    public static void main(String[] args) {
        // Declare and initialize the three angles of the triangle
        int angle1 = 49;
        int angle2 = 66;
        int angle3 = 65;

        /* Check if the sum of the three angles is equal to 180 degrees
         and if all angles are greater than 0 */
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The Angles form a valid Triangle");
        } else {
            System.out.println("The Angles do not form a valid Triangle");
        }
    }
}
