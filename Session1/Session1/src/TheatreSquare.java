import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        // get the value from the users
        double m = input.nextDouble();
        double n = input.nextDouble();
        double a = input.nextDouble();

    
        // calculate the formula
        double result = Math.ceil(m/a) * Math.ceil(n/a);

        // print the result
        System.out.println((int)result); // == System.out.print(result + "\n")
    }
}
