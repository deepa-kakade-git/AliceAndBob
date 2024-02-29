import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main
{

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();


        // call the compute() method on that new object
        compute();
    }

    public static void compute() {
        String name;
        Scanner scanner = new Scanner(System.in);
        // Get input string of name from user
        System.out.print("Enter your name: ");
        name = scanner.nextLine();


        if (name.equals("Alice")  || name.equals("Bob")){
            System.out.println("Hello "+ name);
        }
        else {
            System.out.println("You are neither Alice nor Bob");

        }
    }






    // Create conditional to check name against Alice and Bob

    // Print greeting to screen if Alice or Bob are true

    // Print "You are neither Alice nor Bob." otherwise


}
