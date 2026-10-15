public class AreaOfClass{ // name of class
    // start of class
    public static void main (String[]args){
        // start of main method
        //Declare my variables here
        //This var will hold the radius of the circle
        double radius = 5.6;
        //This var will hold the constant for pi
        final double pi = 3.14159;

        //This will hold the answer of the calculation
        double area = 0.0;

        // calculate the area
        area = pi * radius * radius;

        //The next line will display output to the user
        System.out.println("The area of a circle with a radius of " + radius + " cm is " + area + " cm squared.");

    } // end of main method
} // end of class
