import java.lang.reflect.Member;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SwimmingClubProgram {
    public static void main(String[] args) {
        boolean stillGoing = true;
        Scanner scanner = new Scanner(System.in);
        Treasurer treasurer = new Treasurer();
        List<ClubMember> members = new ArrayList<>();

        while (stillGoing) {
            //creating  members
            System.out.println("""
                    ************************
                    *** Add a new Member ***
                    ************************
                    """);

            System.out.println("What is the member's name?");
            String name = scanner.next();

            System.out.println("What is the member's age?");
            int age = scanner.nextInt();

            System.out.println("What is the member's membershipType? (active or passive)");
            String membershipType = scanner.next();

            System.out.println("What is the member's CPR number?");
            int cprNumber = scanner.nextInt();

            System.out.println("What is the member's phone number?");
            int phoneNumber = scanner.nextInt();

            System.out.println("What is the member's email?");
            String email = scanner.next();

            System.out.println("What is the member's address?");
            String address = scanner.next();

            members.add(new ClubMember(name, age, membershipType, cprNumber, phoneNumber, email, address));

            //calculate dues for the created member
            List<Double> duesList = treasurer.calculateDues(members);

            //display the calculated dues
            for (int i = 0; i < duesList.size(); i++) {
                System.out.println("Payment for " + members.get(i).getName() + ": DKK " + duesList.get(i));
                System.out.println("Additional Info: ");
                System.out.println("CprNumber " + members.get(i).getCprNumber()); //TODO add all the info to println
                System.out.println("Phone number: " + members.get(i).getPhoneNumber());
                System.out.println("Email address: " + members.get(i).getEmail());
                System.out.println("Address: " + members.get(i).getAddress());
            }
        }
        //TODO add additional functionality can be implemented and tested here
    }
}


