package controlstatements;

public class Greatestof5 {

    public static void main(String[] args) {
        // Declare and initialize five integer variables
        int a = 10;
        int b = 111;
        int c = 510;
        int d = 1;
        int e = 1246;

        // Check if 'a' is greater than all other variables
        if (a > b && a > c && a > d && a > e) {
            System.out.println(a + " (a) is Greater");
        }
        // Check if 'b' is greater than all other variables
        else if (b > a && b > c && b > d && b > e) {
            System.out.println(b + " (b) is Greater");
        }
        // Check if 'c' is greater than all other variables
        else if (c > a && c > b && c > d && c > e) {
            System.out.println(c + " (c) is Greater");
        }
        // Check if 'd' is greater than all other variables
        else if (d > a && d > b && d > c && d > e) {
            System.out.println(d + " (d) is Greater");
        }
        // If none of the above conditions are true, 'e' is the greatest
        else {
            System.out.println(e + " (e) is Greater");
        }
    }
}
