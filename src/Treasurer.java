import java.util.ArrayList;
import java.util.List;

public class Treasurer {
    //method to calculate dues based on the given criteria for multiple members
    public List<Double> calculateDues(List<ClubMember> members) {
        List<Double> duesList = new ArrayList<>();

        for (ClubMember member : members) {
            double dues = 0;

            if (member.getMembershipType().equalsIgnoreCase("active")) {
                if (member.getAge() < 18) {
                    dues = 1000;
                } else if (member.getAge() >= 18 && member.getAge() < 60) {
                    dues = 1600;
                } else if (member.getAge() >= 60) {
                    dues = 1600 * 0.75; //25% discount for members over 60
                }
            } else if (member.getMembershipType().equalsIgnoreCase("passive")) {
                dues = 500;
            }

            duesList.add(dues);
        }

        return duesList;
    }
}

    //TODO add additional methods for treasurer-related functionalities can be added here

