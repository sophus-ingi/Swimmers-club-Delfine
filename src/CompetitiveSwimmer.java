import java.util.ArrayList;
import java.util.List;

public class CompetitiveSwimmer {
    private String team;
    private List<String> swimmingDisciplines;
    private String coach;

    public CompetitiveSwimmer(String team, List<String> swimmingDisciplines) {
        this.team = team;
        this.swimmingDisciplines = swimmingDisciplines;
    }

    //TODO add additional methods for swimmer-related functionalities can be added here

    public void setCoach(String coach) {
        this.coach = coach;
    }
}