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
            System.out.println("*** Add a new Member ***");

            System.out.println("What is the member's name?");
            String name = scanner.next();

            System.out.println("What is the member's age?");
            int age = scanner.nextInt();

            System.out.println("What is the member's membershipType?");
            String membershipType = scanner.next();

            System.out.println("What is the member's CPR number?");
            int cprNumber = scanner.nextInt();

            System.out.println("What is the member's phone number?");
            int phoneNumber = scanner.nextInt();

            System.out.println("What is the member's email?");
            String email = scanner.next();

            System.out.println("What is the member's adress?");
            String adress = scanner.next();

            members.add(new ClubMember(name, age, membershipType, cprNumber, phoneNumber, email, adress));

            //calculate dues for the created member
            List<Double> duesList = treasurer.calculateDues(members);

            //display the calculated dues
            for (int i = 0; i < duesList.size(); i++) {
                System.out.println("Payment for " + members.get(i).getName() + ": DKK " + duesList.get(i));
                System.out.println("Additional Info: " + members.get(i).getCprNumber()); //TODO add all the info to printline
            }
        }
        //TODO add additional functionality can be implemented and tested here
    }
}
/*
        Member member1 = new Member("Micheal Phelps", 25, "active");
        Member member2 = new Member("John Lennon", 65, "active");
        Member member3 = new Member("Forrest Gump", 17, "active");
        Member member4 = new Member("new guy not active", 20, "passive");

        Treasurer treasurer = new Treasurer();
        List<Double> duesList = treasurer.calculateDues(member1, member2, member3, member4);

        for (int i = 0; i < duesList.size(); i++) {
            System.out.println("Payment for " + "Member " + (i + 1) + ": DKK " + duesList.get(i));
        }
    }


}
*/

