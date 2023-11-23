import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    /* This functions should prompt the user to enter information that would
     * populate a visitor. This function should also check for errors in the
     * user's input, and re-prompt them if necessary. The Visitor instance is
     * created in this function and returned.
     */
    public static Visitor inputNewVisitor() {
        // we need this to read from input
        Scanner scanner = new Scanner(System.in);

        // this will get a single integer
        //int i = scanner.nextInt();

        // this will get a single line (as a string)
        //String s = scanner.nextLine();

        // create the new visitor
        Visitor visitor = new Visitor();

        //Beginning of the program
        System.out.println("Hello! This is a survey for Oxy's Marketing and Communications Team!");
        System.out.println("Please fill out the survey below to be entered into our raffle for a chance to win some cool Oxy merch!");
        System.out.println("(The survey below should only be filled out for one person.)");
        System.out.println();

        // ask for and set the email
        // this will loop until the email is valid
        String email = "";
        while (!visitor.setEmail(email)) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
        }

        // ask for and set the age
        // this will loop until the age is valid
        String  age = "0";
        while (!visitor.setAge(age)) {
            System.out.print("Enter your age: ");
            age = (scanner.nextLine());
        }

        String name = "";
        while (!visitor.setName(name)) {
            System.out.print("Enter your full name: ");
            name = scanner.nextLine();
        }

        String country = "";
        while (!visitor.setCountry_code(country)) {
            System.out.print("Enter your country code for your phone number (only digits): ");
            country = scanner.nextLine();
        }

        String phone = "";
        while (!visitor.setPhone(phone)) {
            System.out.print("Enter your phone number (only digits): ");
            phone = scanner.nextLine();
        }

        String reason = "";
        while (!visitor.setReason(reason)) {
            System.out.print("Enter your reason for coming today: ");
            reason = scanner.nextLine();
        }

        return visitor;
    }

    /* In a real scenario, a main() might loop forever asking for users to
     * enter information, then return them all in a list (or save it to file).
     * For this assignment, getting one Visitor is sufficient.
     */
    public static void main(String[] args) {
        Visitor visitor = inputNewVisitor();
        System.out.println();
        // FIXME add more printouts here
        System.out.println("Email: " + visitor.getEmail());
        System.out.println("Age: " + visitor.getAge());
        System.out.println("Name: " + visitor.getName());
        System.out.println("Phone Number: " + visitor.getCountry_code() + visitor.getPhone());
        System.out.println("Reason: " + visitor.getReason());
        System.out.println();
        System.out.println("Thank you for filling out our survey! We will follow up and notify you");
        System.out.println("by email and phone number if you have won our raffle in order to get");
        System.out.println("your shipping details.");
        System.out.println();
        System.out.println("Thank you for coming out today!");
        System.out.println();
        System.out.println("        @@@@            @@@@        ");
        System.out.println("       @@@@@@          @@@@@@       ");
        System.out.println("       @@@@@@          @@@@@@       ");
        System.out.println("        @@@@            @@@@        ");
        System.out.println("                                    ");
        System.out.println("   @                            @   ");
        System.out.println("    @@                        @@    ");
        System.out.println("     @@@                   @@@      ");
        System.out.println("        @@@@@         @@@@@         ");
        System.out.println("           @@@@@@@@@@@@@            ");
    }
}